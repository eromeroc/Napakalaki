package Model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagrario
 */
public class CultistPlayer extends Player{

    private static int totalCultistPlayer ;
    private Player player;
    private Cultist cultist;
    
    public CultistPlayer(Player p, Cultist c){
        super(p);
        cultist = c;
    }
 
    
    public int getCombatLevel(){
        int level = player.getCombatLevel();
        level+= cultist.getSpecialValue();
        return level;
    }
    
    protected int getOponentLevel(Monster m ){
        return m.getSpecialValue();
    }
    
    protected boolean shouldConvert(){
        return false; //Por defecto
    }
    
    protected float computeGoldCoinsValue(ArrayList<Treasure> t){
        float goldCoinsValue = 0;
        
        for(Treasure treasure: t){
            goldCoinsValue += treasure.getGolCoind();
        }
        goldCoinsValue *=2;
        return goldCoinsValue/1000;  
        
    }
    
    public static int getTotalCultistPlayers(){
        return totalCultistPlayer;
    }
    
    
}
