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
    
    private Monster currentMonster; // 0 o 1
    private Player currentPlayer;   // 0 ó 1
    private ArrayList<Player> player;          // 1 o más    o un arrayList?
    
    //CombatResult          con lineas
    //CardDealer            discontinuas
    
    private static  Napakalaki instance = null;
 
    
    // Private constructor por defecto
    private  Napakalaki(){
        player = new ArrayList<Player>();
        currentPlayer = null;
        currentMonster = null;
    }

    
    public static  Napakalaki getInstance() {
        if (instance == null){
                instance = new Napakalaki();
        }
        return instance;
    }
    
    //Inicializa jugadores (el objeto players)
    private void initPlayers(String[]  names){
        
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
}
