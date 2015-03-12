package napakalaki;


import napakalaki.Prize;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Monster {
    private String name; //nombre monstruo
    private int combatLevel; //nivel de combate
    
    private Prize price;
    private BadConsequence bc;
    
    public Monster(String name, int combatLevel, BadConsequence bc, Prize price){
        this.name = name;
        this.combatLevel = combatLevel;
        this.bc = bc;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCombatLevel(){
        return combatLevel;
    }
    
    public BadConsequence getBadConsequence(){
        return bc;
    }
    
    public String toString(){
        return "\nName =" +name+ "\nLevels =" +Integer.toString(combatLevel)+ "\nPrize =" +price.toString()+ "\nBadConsequence =" +bc.toString();
    }
}
