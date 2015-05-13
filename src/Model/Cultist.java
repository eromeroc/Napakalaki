/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

public class Cultist extends Player implements Card {
    private String name ;
    private int gainedLevels;
    private ArrayList<CardDealer> unusedCultist;
    private CultistPlayer myCultistCard;
    
    
    public Cultist(String name, int gainedLevels){
        super(name);
        this.gainedLevels = gainedLevels;
    }
    
    public int getGainedLevels(){
        return gainedLevels;
    }
    
    public int getBasicValue(){
        return  getGainedLevels();
    }
        
    public int getSpecialValue(){
        return getBasicValue()*CultistPlayer.getTotalCultistPlayers();
    }
     
    @Override //POR QUE DA ERROR??
    protected boolean shouldConvert(){
        return false;
    }
    
    @Override
    public int getCombatLevel(){
        int level = getSpecialValue();
        level += super.getCombatLevel();
        
        return level;
    }
}
