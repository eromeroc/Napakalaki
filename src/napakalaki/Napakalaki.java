/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author sagrario
 */
public class Napakalaki {
     //CREO
    private Monster currentMonster; // 0 o 1
    private Player currentPlayer;   // 0 ó 1
    private ArrayList<Player> player;          // 1 o más    o un arrayList?
    
    //CombatResult          con lineas
    //CardDealer            discontinuas
    
    private static  final Napakalaki instance = new Napakalaki();
 
    // Private constructor suppresses 
    private  Napakalaki(){
        player = new ArrayList<Player>();
        //currenPlayer = new Player();
        //currentMonster = new Monster();
    }

        
    
 
    public static  Napakalaki getInstance() {
        return instance;
    }
    
    
    private void initPlayers(String[]  names){
        
    }
/*    
    private Player nextPlayer(){
        
    }
    
    public Napakalaki getInstance(){
        
    }
    
    public CombatResult combat() {
        
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
}
