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
    
    
    
    private static CardDealer INSTANCE = null;
 
    // Private constructor suppresses 
    private CardDealer(){}
 
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new CardDealer();
        }
    }
 
    public static CardDealer getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
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
