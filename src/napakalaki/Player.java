package napakalaki;

import java.util.ArrayList;
import napakalaki.Treasure;
import napakalaki.BadConsequence;
import napakalaki.TreasureKind;
import napakalaki.CardDealer;



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

//    Cuando el jugador muere en un combate, esta operación es la encargada de dejarlo sin
//    tesoros, ponerle el nivel a 1 e indicar que está muerto, en el atributo correspondiente.
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
                    giveTreasureBack(treasure); //???????????????????
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
        
        return goldCoinsValue/1000; 
        
    }

    
    /*
    
//    Cuando el jugador gana el combate, esta operación es la encargada de aplicar el buen
//    rollo al jugador, sumando los niveles correspondiente y robando los tesoros indicados en el
//    buen rollo del monstruo.
    public void applyPrize(Prize p){
        
    }
    
    public CombatResult combat(Monster m){
        
    }
    
//    Cuando el jugador ha perdido el combate, no ha podido huir y no muere, hay que
//    almacenar el mal rollo que le impone el monstruo con el que combatió. Para ello,
//    decrementa sus niveles según indica el mal rollo y guarda una copia de un objeto
//    badConsequence ajustada a los tesoros que puede perder según indique el mal rollo del
//    monstruo y de los tesoros que disponga el jugador. La operación encargada de hacer este
//    ajuste es adjustToFitTreasureLists de la clase badConsequence. El mal rollo
//    pendiente (pendingbadConsequence) es el que el jugador almacenará y que deberá
//    cumplir descartándose de esos tesoros antes de que pueda pasar al siguiente turno.
    public void applyBadConsequence(BadConsequence bq){
        
    }
    
    public boolean makeTreasureVisible(Treasure t){
        
    }
    */
    
    /**
     * Comprueba si el tesoro t se puede pasar de oculto a visible según las reglas del juego
     */
    public boolean canMakeTreasureVisible(Treasure t){
        boolean canMakeVisible = true;
        
        if(visibleTreasures.size() > 4){
            canMakeVisible = false;
        }else{
            for(Treasure treasure: visibleTreasures){
                if(treasure.getType() == t.getType()){
                    canMakeVisible = false;
                }
            }
        }
        
        return canMakeVisible;
        
    }
    
    /*
    public void discardVisibleTreasure(Treasure t){
        
    }
    
    public void discardHiddenTreasure(Treasure t){
        
    }
    
    public void buyLevels(ArrayList<Treasure> visible, ArrayList<Treasure> hidden){
        
    }
    */
    
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
     * Devuelve nivel de combate del jugador: su nivel + bonus
     */
    public int getCombatLevel(){
        int combatLevel = level;
        /*Si el jugador tiene un tesoro de tipo collar
            todas las cartas de tesoros que tiene suman maxBonus
          Si no, suman minBonus
        */
        
        if(hasNecklace()){
            for(Treasure t: visibleTreasures){
                combatLevel += t.getMaxBonus();
            }
            for(Treasure t: hiddenTreasures){
                combatLevel += t.getMaxBonus();
            }
        }
        else{   
            for(Treasure t: visibleTreasures){
                combatLevel += t.getMinBonus();
            }
            for(Treasure t: hiddenTreasures){
                combatLevel += t.getMinBonus();
            }
        }
       return combatLevel;   
    }
    
    /**
     * Devuelve true cuando no tiene ningún mal rollo que cumplir y no tiene más
     * de 4 tesoros ocultos
     */
    public boolean validState(){
        boolean valid = false;
        if(pendingBadConsequence.isEmpty() && hiddenTreasures.size() <= 4)
            valid = true;
        
        return valid;
    }
    
    /*
    
//    Cuando un jugador está en su primer turno o se ha quedado sin tesoros ocultos o visibles,
//    hay que proporcionarle nuevos tesoros para que pueda seguir jugando. El número de
//    tesoros que se les proporciona viene dado por el valor que saque al tirar el dado:
//    ● Si (dado == 1) roba un tesoro.
//    ● Si (1 < dado< 6) roba dos tesoros.
//    ● Si (dado == 6) roba tres tesoros.
    public boolean initTreasures(){
        
    }
    */
    
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
    
    
}
