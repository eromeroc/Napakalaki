/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

public class Cultist implements Card {
    private String name ;
    private int gainedLevels;
    //private ArrayList<CardDealer> unusedCultist;
    //private CultistPlayer myCultistCard;
    
    
    public Cultist(String name, int gainedLevels){
        this.name = name;
        this.gainedLevels = gainedLevels;
    }
    
    public int getBasicValue(){
        return  gainedLevels;
    }
        
    public int getSpecialValue(){
        return getBasicValue()*CultistPlayer.getTotalCultistPlayers();
    }
   
}
