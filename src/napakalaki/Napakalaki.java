package napakalaki;

import java.util.ArrayList;
import napakalaki.Player;
import napakalaki.Monster;

/**
 * @author Elena Romero y Marta Verona
 */
public class Napakalaki {
    
    private Monster currentMonster; 
    private Player currentPlayer;   
    private ArrayList<Player> players;          // 1 o más 
    
    //Combat result y Card dealer con discontinuas
    
    private static  Napakalaki instance = null;
 
    
    /**
     * Constructor (privado)
     */
    private  Napakalaki(){
        players = new ArrayList<Player>();
        currentPlayer = null;
        currentMonster = null;
    }

    
    public static  Napakalaki getInstance() {
        if (instance == null){
                instance = new Napakalaki();
        }
        return instance;
    }
    

    public ArrayList<Treasure> getVisibleTreasures(){
        
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        
    }
    
    /**
     * Inicializa jugadores
     */
    private void initPlayers(String[] names){
        
    }
/*    
    private Player nextPlayer(){
        
    }
    
    
    
    public CombatResult combat() {
        //Aqui se usa CombatResult (discontinuas)
    }
    */
    public  void discardVisibleTreasure(Treasure t ){
        
    }   
    
    public  void discardHiddenTreasure(Treasure t ){
        
    }
    /*
    public  boolean makeTreasureVisible(Treasure t){
        
    }
    
    public  boolean buyLevels(Treasure [] visible, Treasure [] hidden){
        
    }
    */
    public void initGame(String [] players) {
    
    }
    
    /**
     * 
     */
    public Player getCurrentPlayer(){
        
    }
    
    /**
     * 
     */
    public Monster getCurrentMonster(){
        
    }
    
    /**
     * 
     */
    public boolean canMakeTreasureVisible(Treasure t){
        
    }
    
    /**
     * 
     */
    public boolean nextTurn(){
        
    }
    
    /**
     * 
     */
    public boolean nextTurnAllowed(){
        
    }
    
    /**
     * 
     */
    public boolean endOfGame(CombatResult result){
        
    }
}
