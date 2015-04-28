package Model;


import Model.Prize;
import Model.BadConsequence;


public class Monster {
    private String name;     //nombre monstruo
    private int combatLevel; //nivel de combate
    
    private Prize prize;
    private BadConsequence bc;
    
    /**
     * Constructor
     */
    public Monster(String name, int combatLevel, BadConsequence bc, Prize prize){
        this.name = name;
        this.combatLevel = combatLevel;
        this.bc = bc;
        this.prize = prize;
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
    
    public Prize getPrize(){
        return prize;
    }
    

    /**
     * Devuelve string con el estado completo del objeto
     */
    public String toString(){
        return "\nNombre :" +name+ "\nNivel :" +Integer.toString(combatLevel)+ "\nPremio: " +prize.toString()+
                "\nMal rollo: " +bc.toString();
    }
}
