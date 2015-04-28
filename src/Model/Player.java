package Model;

import java.util.ArrayList;
import Model.Treasure;
import Model.BadConsequence;
import Model.TreasureKind;
import Model.CardDealer;
import Model.CombatResult;
import Model.Dice;
import Model.Prize;
import Model.Monster;



public class Player {
    
    private boolean dead = true;
    private String name;
    private int level;
    private static final int MAXHIDDENTREASURES = 4;
    
    private ArrayList<Treasure> hiddenTreasures;
    private ArrayList<Treasure> visibleTreasures;
    private BadConsequence pendingBadConsequence;
    
    /**
     * Constructor
     */
    public Player(String name){
        this.name = name;
        level = 1;
        hiddenTreasures = new ArrayList<Treasure>();
        visibleTreasures = new ArrayList<Treasure>();
        pendingBadConsequence = new BadConsequence();
    }
    
    public String getName(){
        return name;
    }
    
    /**
     * Revive al jugador
     */
    private void bringToLive(){
        dead = false;
    }
    
    /**
     * Aumenta el nivel del jugador
     * 1 <= level <= 10
     */
    private void incrementLevels(int i){
        if((level+i)>10) 
           level = 10;
        else 
           level += i;
    }
    
    /**
     * Decrementa el nivel del jugador
     * 1 <= level <= 10
     */
    private void decrementLevels(int i){
        if((level-i)<1) 
           level = 1;
        else 
           level -= i;
    }
    
    /**
     * Asigna mal rollo al jugador
     */
    private void setPendingBadConsequence(BadConsequence bq){
        pendingBadConsequence = bq;     
    }

    /**
     * Cuando el jugador muere en un combate, esta operación es la encargada de dejarlo sin
     * tesoros, ponerle el nivel a 1 e indicar que está muerto, en el atributo correspondiente
     */ 
    private void die(){
        dead = true;
        level = 1;
        visibleTreasures = new ArrayList<Treasure>();
        hiddenTreasures = new ArrayList<Treasure>();
    }
    
    /**
     * Si el jugador tiene equipado un tesoro NECKLACE, se lo entrega al CardDealer 
     * y lo elimina de sus tesoros visibles
     */
    private void discardNecklaceIfVisible(){
        
        for(Treasure treasure: visibleTreasures){
                if(treasure.getType() == TreasureKind.NECKLACE){
                    CardDealer.getInstance().giveTreasureBack(treasure);
                    visibleTreasures.remove(treasure);
                }
            }
        
    }
    
    
    /**
     * Cambia el estado del jugador a muerto si no tiene tesoros
     */
    private void dieIfNoTreasures(){
        
        if(hiddenTreasures.isEmpty() && visibleTreasures.isEmpty()){
            dead = true;
        }     
    }
    
    /**
     * Devuelve true si con los niveles que compra no gana la partida
     */
    private boolean canIBuyLevels(int i){
        boolean win = true;
        int l = i / 1000;
        
        if(level + l > 10) 
            win = false;
        
        return win;  
    }
    
    /**
     * Calcula y devuelve los niveles que puede comprar el jugador con la lista t de tesoros
     * El número de tesoros no es redondeado y se expresa mediante un número en coma flotante
     */
    
    protected float computeGoldCoinsValue(ArrayList<Treasure> t){
        float goldCoinsValue = 0;
        
        for(Treasure treasure: t){
            goldCoinsValue += treasure.getGolCoind();
        }
        
        return goldCoinsValue/1000;  //1000 o 100?
        
    }

    
    
    
    /**
     * Cuando el jugador gana el combate, esta operación es la encargada de aplicar el buen
     * rollo al jugador, sumando los niveles correspondiente y robando los tesoros indicados en el
     * buen rollo del monstruo.
     */ 
    public void applyPrize(Prize p){
        incrementLevels(p.getLevels());
        int t = p.getTreasures();
        for (int i = 0 ; i < t ; i++)
            hiddenTreasures.add(CardDealer.getInstance().nextTreasure());
    }
  
    /*Si el nivel de jugador > nivel del monstruo {
            Se actualiza el nivel y tesoros del jugador y se invoca al operación applyPrize
            Devuelve Win si el jugador no gana la partida (nivel del jugador <10).
            Devuelve WinAndWinGame si el jugador gana la partida.
      }
      Si el nivel del jugador es <= nivel del monstruo {
        Se lanza el dado
        Si sale 5 ó 6, {
            No pasa nada y se devuelve LooseAndEscape
        } en otro caso {
            Se analiza en qué consiste el mal rollo
            Si el jugador muere {
                Se invoca a la operación die
                Se devuelve LoseAndDie
            } en otro caso {
                Se invoca a la operación applyBadConsequence
                Se devuelve Lose
            }
        }
      }
    */
    public CombatResult combat(Monster m){
        CombatResult combatResult;
        int levelMonster = m.getCombatLevel();
        
        if(getCombatLevel() > levelMonster){
            Prize p = m.getPrize();
            applyPrize(p);
            if(level < 10){
                combatResult = CombatResult.WIN;
            }
            else
                combatResult = CombatResult.WINANDWINGAME;
            
        }
        else{
            int nextNumber = Dice.getInstance().nextNumber();
            
            if(nextNumber >= 5){
                combatResult = CombatResult.LOSEANDESCAPE;
            }
            else{
                BadConsequence bq = m.getBadConsequence();
                if(bq.kills()){
                    die();
                    combatResult = CombatResult.LOSEANDDIE;
                }
                else{
                    applyBadConsequence(bq);
                    combatResult = CombatResult.LOSE;
                }
            }
            
        }
        
        return combatResult;
    }
    
    /**
     * Cuando el jugador ha perdido el combate, no ha podido huir y no muere, hay que
     * almacenar el mal rollo que le impone el monstruo con el que combatió. Para ello,
     * decrementa sus niveles según indica el mal rollo y guarda una copia de un objeto
     * badConsequence ajustada a los tesoros que puede perder según indique el mal rollo del
     * monstruo y de los tesoros que disponga el jugador. La operación encargada de hacer este
     * ajuste es adjustToFitTreasureLists de la clase badConsequence. El mal rollo
     * pendiente (pendingbadConsequence) es el que el jugador almacenará y que deberá
     * cumplir descartándose de esos tesoros antes de que pueda pasar al siguiente turno.
     */
    public void applyBadConsequence(BadConsequence bq){
        decrementLevels(bq.getLevels());
        pendingBadConsequence = bq.adjustToFitTreasureLists(visibleTreasures,hiddenTreasures);
        setPendingBadConsequence(pendingBadConsequence);
    }
   
    /**
     * Pasa tersoros ocultos a visibles, siempre que pueda hacerlo según las reglas 
     */
    public boolean makeTreasureVisible(Treasure t){
        boolean make = false;
        
        if(canMakeTreasureVisible(t)){
            visibleTreasures.add(t);
            hiddenTreasures.remove(t);
            make = true;
        }
        
        return make;
    }
    
    
    /**
     * Comprueba si el tesoro t se puede pasar de oculto a visible según las reglas del juego
     */
    public boolean canMakeTreasureVisible(Treasure t){
        boolean canMakeVisible = true;
        int contador = 0;
        boolean bothhands = false;

        for(Treasure treasure: visibleTreasures){
            if(treasure.getType()== TreasureKind.ONEHAND)
                contador++;
            
            if(treasure.getType() == TreasureKind.BOTHHANDS)
                bothhands = true;
            
            if(treasure.getType() == t.getType())
                canMakeVisible = false;                
        }
            
        if(t.getType() == TreasureKind.ONEHAND){
            if(contador<2)
                canMakeVisible = true;
            if(bothhands)
                canMakeVisible = false;
        }
        if(t.getType() == TreasureKind.BOTHHANDS && contador >0)
            canMakeVisible = false;
        
    return canMakeVisible;        
    }
    
    /**
     * Eliminar los tesoros visibles indicados de la lista de tesoros
     * visibles del jugador. Al eliminar esos tesoros, si el jugador tiene un mal rollo pendiente, se
     * indica a éste dicho descarte para su posible actualización.
     */
    public void discardVisibleTreasure(Treasure t){
        visibleTreasures.remove(t);
        
        if((pendingBadConsequence != null) && (!pendingBadConsequence.isEmpty())){
            pendingBadConsequence.substractVisibleTreasure(t);
        }
        
        CardDealer.getInstance().giveTreasureBack(t);
        
        dieIfNoTreasures();
        
    }
    
    /**
     * Eliminar los tesoros ocultos indicados de la lista de tesoros
     * ocultos del jugador. Al eliminar esos tesoros, si el jugador tiene un mal rollo pendiente, se
     * indica a éste dicho descarte para su posible actualización.
     */
    public void discardHiddenTreasure(Treasure t){
        hiddenTreasures.remove(t);
        
        if((pendingBadConsequence != null) && (!pendingBadConsequence.isEmpty())){
            pendingBadConsequence.substractHiddenTreasure(t);
        }
        
        CardDealer.getInstance().giveTreasureBack(t);
        
        dieIfNoTreasures();
        
    }
    /**
     * Permite comprar niveles antes de combatir con el monstruo actual. Para
     * ello, a partir de las listas de tesoros (pueden ser tanto ocultos como visibles) se calculan
     * los niveles que puede subir el jugador en función del número de piezas de oro que sumen.
     * Si al jugador le está permitido comprar la cantidad de niveles resultantes (no se puede
     * comprar niveles si con ello ganas el juego), entonces se produce el mencionado
     * incremento
     */
    public boolean buyLevels(ArrayList<Treasure> visible, ArrayList<Treasure> hidden){
        boolean canI;
        int l;
        float levels = computeGoldCoinsValue(visible);
        levels += computeGoldCoinsValue(hidden);
        l = (int) levels;
        
        canI = canIBuyLevels(l); 
        
        if(canI){
            incrementLevels(l);
            
            for(Treasure v: visible){
                discardVisibleTreasure(v);
            }
            for(Treasure h: hidden){
                discardHiddenTreasure(h);
            }      
        }
        
        return canI;
    }
    
    
    /**
     * Devuelve true si el jugador tiene un tesoro de tipo collar en el array pasado
     */
    public boolean hasNecklace(){
        boolean hasNecklace = false;
        
        for(Treasure t: visibleTreasures){
            if(t.getType() == TreasureKind.NECKLACE){
                hasNecklace = true;
            }
        }
        
        for(Treasure t: hiddenTreasures){
            if(t.getType() == TreasureKind.NECKLACE){
                hasNecklace = true;
            }
        }
        
        return hasNecklace;                
    }
    
    /**
     * Devuelve nivel de combate del jugador: su nivel + bonus.
     * Si maxBonus y minBonus son diferentes
     *      Si el jugador tiene un tesoro de tipo collar
     *          todas las cartas de tesoros que tiene suman maxBonus
     *      Si no, suman minBonus
     */
    public int getCombatLevel(){
        int combatLevel = level;
        boolean usado = false;
        
        for(Treasure t: visibleTreasures){  
            if(t.getMaxBonus() != t.getMinBonus()){
                if(hasNecklace()){            
                    combatLevel += t.getMaxBonus();
                    usado = true;
                }
                else
                    combatLevel += t.getMinBonus();
            }
            else
                combatLevel += t.getMaxBonus();
        }
        
        if(usado) discardNecklaceIfVisible();
        
        
       return combatLevel;   
    }
    
    /**
     * Devuelve true cuando no tiene ningún mal rollo que cumplir y no tiene más
     * de 4 tesoros ocultos
     */
    public boolean validState(){
        boolean valid = false;
        if(pendingBadConsequence.isEmpty() && hiddenTreasures.size() <= MAXHIDDENTREASURES)
            valid = true;
        
        return valid;
    }
    
    
    /**
     * Cuando un jugador está en su primer turno o se ha quedado sin tesoros ocultos o visibles,
     * hay que proporcionarle nuevos tesoros para que pueda seguir jugando. El número de
     * tesoros que se les proporciona viene dado por el valor que saque al tirar el dado:
     *     Si (dado == 1) roba un tesoro.
     *     Si (1 < dado< 6) roba dos tesoros.
     *     Si (dado == 6) roba tres tesoros.
     */
    public void initTreasures(){
        bringToLive();
        int num= Dice.getInstance().nextNumber();
            
        if(num == 1){
            hiddenTreasures.add(CardDealer.getInstance().nextTreasure());
        }
        else {
            if(num ==6){
                for (int i = 0 ; i < 2 ; i++)
                    hiddenTreasures.add(CardDealer.getInstance().nextTreasure());
            }
            
            else{
                for (int i = 0 ; i < 3 ; i++)
                    hiddenTreasures.add(CardDealer.getInstance().nextTreasure());
            }
                
        }
    }
    
    
    /**
     * Devuelve true si el jugador está muerto
     */
    public boolean isDead(){
        return dead;
    }
    
    /**
     * Devuelve true cuando el jugador tiene algún tesoro visible
     */
    public boolean hasVisibleTreasures(){
        return !visibleTreasures.isEmpty();
    }
    
    
    /**
     * Consultores
     */
    public ArrayList<Treasure> getVisibleTreasures(){
        return visibleTreasures;
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        return hiddenTreasures;
    } 
    
    public String toString(){
        String output =  "\nNombre: " +name+ "\n\tNivel: " +level;
        
        if(pendingBadConsequence.isEmpty())
            output += "\n\tNo tienes mal rollo pendiente";
        else
            output += "\n\tMal rollo pendiente: " +pendingBadConsequence.toString();
        return output;
    }

}
