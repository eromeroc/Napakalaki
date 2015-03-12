package napakalaki;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Prize {
    private int levels;
    private int treasures;
    
    Prize(int treasures, int levels){
        this.treasures = treasures;
        this.levels = levels;
    }
    
    public int getTreasures(){
        return treasures;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public String toString(){
        return "\nTreasures =" + Integer.toString(treasures)+ "\nLevels =" +Integer.toString(levels);
    }
}
