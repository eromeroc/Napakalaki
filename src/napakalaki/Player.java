package napakalaki;

import java.util.ArrayList;
import napakalaki.Treasure;
import napakalaki.BadConsequence;
import napakalaki.TreasureKind;



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
    
    
    private void die(){
        dead = true;
        level = 1;
        visibleTreasures = new ArrayList<Treasure>();
        hiddenTreasures = new ArrayList<Treasure>();
    }
    
    
    private void discardNecklaceIfVisible(){
        
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
        
        if(l > 10) // no sería levels + l > 10 ???
            win = false;
        
        return win;  
    }
    
    /*
    protected float computeGoldCoinsValue(ArrayList<Treasure> t){
        
    }
    */
    
    /*
    public void applyPrize(Prize p){
        
    }
    
    public CombatResult combat(Monster m){
        
    }
    
    public void applyBadConsequence(BadConsequence bq){
        
    }
    
    public boolean makeTreasureVisible(Treasure t){
        
    }
    
    public boolean canMakeTreasureVisible(Treasure t){
        
    }
    
    public void discardVisibleTreasure(Treasure t){
        
    }
    
    public void discardHiddenTreasure(Treasure t){
        
    }
    
    public void buyLevels(ArrayList<Treasure> visible, ArrayList<Treasure> hidden){
        
    }
    */
    
    /**
     * Devuelve true si el jugador tiene un tesoro de tipo collar
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
        
        //Lo de necklace es solo cuando max y min son diferentes
        //Si max y min son iguales, tenga o no necklace se le suma maxBonus, 
        
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
