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

    private static int totalCultistPlayer =0;
    private Cultist myCultistCard;
    
    public CultistPlayer(Player p, Cultist c){
        super("sectario");
        super.copyPlayer(p);
        myCultistCard = c;
        totalCultistPlayer +=1;
    }
 
    @Override
    public int getCombatLevel(){
        int level = super.getCombatLevel();
        level+= myCultistCard.getSpecialValue();
        return level;
    }
    
    @Override
    protected int getOponentLevel(Monster m ){
        return m.getSpecialValue();
    }
    
    @Override
    protected boolean shouldConvert(){
        return false; //Por defecto
    }
    
    @Override
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
