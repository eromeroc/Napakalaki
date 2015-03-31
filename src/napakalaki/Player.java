package napakalaki;

import java.util.ArrayList;
import napakalaki.Treasure;

/**
 * @author Elena Romero y Marta Verona
 */
public class Player {
    
    private boolean dead = true;
    private String name;
    private int level;
    private static final int MAXHIDDENTREASURES = 4;
    
    private ArrayList<Treasure> hiddenTreasures;
    private ArrayList<Treasure> visibleTreasures;
    
    /**
     * Constructor
     */
    public Player(String name){
        this.name = name;
        level = 1;
        hiddenTreasures = new ArrayList<Treasure>();
        visibleTreasures = new ArrayList<Treasure>();
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
    
    public int getCombatLevel(){
        return level;
    }
    
    /**
     * Revive al jugador
     */
    private void bringToLive(){
        
    }
    
    /**
     * Aumenta el nivel del jugador
     */
    private void incrementLevels(int l){
        
    }
    
    /**
     * Decrementa el nivel del jugador
     */
    private void decrementLevels(int l){
        
    }
    
    /**
     * 
     */
    private void setPendingBadConsequence(BadConsequence bq){
        
    }
    
    /**
     * 
     */
    private void die(){
        
    }
    
    /**
     * 
     */
    private void discardNecklaceIfVisible(){
        
    }
    
    /**
     * 
     */
    private void dieIfNoTreasures(){
        
    }
    
    /**
     * 
     */
    private boolean canIBuyLevels(int l){
        
    }
    
    /**
     * 
     */
    protected float computeGoldCoinsValue(ArrayList<Treasure> t){
        
    }
    
    /**
     * 
     */
    public void applyPrize(Prize p){
        
    }
    
    /**
     * 
     */
    public CombatResult combat(Monster m){
        
    }
    
    /**
     * 
     */
    public void applyBadConsequence(BadConsequence bq){
        
    }
    
    /**
     * 
     */
    public boolean makeTreasureVisible(Treasure t){
        
    }
    
    /**
     * 
     */
    public boolean canMakeTreasureVisible(Treasure t){
        
    }
    
    /**
     * 
     */
    public void discardVisibleTreasure(Treasure t){
        
    }
    
    /**
     * 
     */
    public void discardHiddenTreasure(Treasure t){
        
    }
    
    /**
     * 
     */
    public void buyLevels(ArrayList<Treasure> visible, ArrayList<Treasure> hidden){
        
    }
    
    /**
     * 
     */
    public boolean validState(){
        
    }
    
    /**
     * 
     */
    public boolean initTreasures(){
        
    }
    
    /**
     * 
     */
    public boolean isDead(){
        
    }
    
    /**
     * 
     */
    public boolean hasVisibleTreasures(){
        
    }
    
}
