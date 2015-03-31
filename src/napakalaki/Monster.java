package napakalaki;


import napakalaki.Prize;
import napakalaki.BadConsequence;

/**
 * @author Elena Romero y Marta Verona
 */


public class Monster {
    private String name;     //nombre monstruo
    private int combatLevel; //nivel de combate
    
    private Prize price;
    private BadConsequence bc;
    
    /**
     * Constructor
     */
    public Monster(String name, int combatLevel, BadConsequence bc, Prize price){
        this.name = name;
        this.combatLevel = combatLevel;
        this.bc = bc;
        this.price = price;
    }
    
   /**
    * Consultores
    */
    public String getName(){
        return name;
    }
    
    public int getCombatLevel(){
        return combatLevel;
    }
    
    public BadConsequence getBadConsequence(){
        return bc;
    }
    
    public Prize getPrice(){
        return price;
    }
    

    /**
     * Devuelve string con el estado completo del objeto
     */
    public String toString(){
        return "\nName =" +name+ "\nLevels =" +Integer.toString(combatLevel)+ "\nPrize =" +price.toString()+
                "\nBadConsequence =" +bc.toString();
    }
}
