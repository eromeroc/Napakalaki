package napakalaki;

import java.util.ArrayList;
import napakalaki.Player;
import napakalaki.Monster;

//CombatResult y CardDealer discontinuas


public class Napakalaki {
    
    private Monster currentMonster; 
    private Player currentPlayer;   
    private ArrayList<Player> players;          // 1 o más 
    
    
    private static  Napakalaki instance = null;
 
    
    /**
     * Constructor (privado)
     */
    private  Napakalaki(){
        players = new ArrayList<Player>();
        currentPlayer = null;
        currentMonster = null;
    }
    
    /*
    private void initPlayers(String[] names){
        
    }
    
     
    private Player nextPlayer(){
        
    }
    */

    /**
     * Devuelve la única instancia de Napakalaki y la inicializa si no lo está aún
     */
    public static  Napakalaki getInstance() {
        if (instance == null){
                instance = new Napakalaki();
        }
        return instance;
    }
    
    /*
    public CombatResult combat() {
        
    }
   
    public  void discardVisibleTreasure(Treasure t ){
        
    }   
    
    public  void discardHiddenTreasure(Treasure t ){
        
    }
    
    public  boolean makeTreasureVisible(Treasure t){
        
    }
    
    public  boolean buyLevels(Treasure [] visible, Treasure [] hidden){
        
    }
    
    public void initGame(String [] players) {
    
    }
    
    public Player getCurrentPlayer(){
        
    }
    
    public Monster getCurrentMonster(){
        
    }
    
    public boolean canMakeTreasureVisible(Treasure t){
        
    }
    
    public ArrayList<Treasure> getVisibleTreasures(){
        
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        
    }
   
    public boolean nextTurn(){
        
    }
    
   
    public boolean nextTurnAllowed(){
        
    }
    
    public boolean endOfGame(CombatResult result){
        
    }
    */
}
