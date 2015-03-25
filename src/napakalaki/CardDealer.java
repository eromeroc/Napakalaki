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
public class CardDealer {
 //CREO
    ArrayList<Monster> unusedMonsters;   // 0*
    ArrayList<Monster> usedMonsters;     // 0*
    
    ArrayList<Treasure> unusedTreasures; //0*
    ArrayList<Treasure> usedTreasures;   //0*
  
    
    private static final CardDealer instance = new CardDealer();
 
    
    private CardDealer(){
        unusedMonsters = new ArrayList<Monster>();
        usedMonsters = new ArrayList<Monster>();
        unusedTreasures = new ArrayList<Treasure>() ;
        usedTreasures = new ArrayList<Treasure>() ;
    }
 
    public static CardDealer getInstance() {
        return instance;
    }
    
    private void initTreasureCardDeck(){
        //Creo que aqui hay que poner las cartas de tesoros
    }
    
    private void initMonsterCardDeck(){
        //Aquí cartas de monstruos
    }
    
    private void shuffleTreasures(){
        //NO SE
    }
    
    private void shuffleMonsters(){
        
    }
    /*
    
    public Treasure nextTreasure(){
        
    }
    
    public Monster nextMonster(){
        
    }
    */
    public void giveTreasureBack( Treasure t){
        
    }
    
    public void giveMonsterBack(Monster m){
        
    }
    
    public void initCards(){
        
    }
}
