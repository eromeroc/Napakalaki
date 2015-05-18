package Model;


import Model.Prize;
import Model.BadConsequence;


public class Monster implements Card{
    private String name;     //nombre monstruo
    private int combatLevel; //nivel de combate
    
    private Prize prize;
    private BadConsequence bc;
    private int levelChangeAgainstCultistPlayer;
    
    /**
     * Constructor
     */
    public Monster(String name, int combatLevel, BadConsequence bc, Prize prize, int change){
        this(name,combatLevel,bc,prize);
        levelChangeAgainstCultistPlayer = change; 
    }
    
    public Monster(String name, int combatLevel, BadConsequence bc, Prize prize){
        this.name = name;
        this.combatLevel = combatLevel;
        this.bc = bc;
        this.prize = prize;
        levelChangeAgainstCultistPlayer = 0 ; 
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
        return "\nNombre:" +name+ "\n\tNivel :" +Integer.toString(combatLevel)+ "\n\tPremio: " +prize.toString()+
                "\n\tMal rollo: " +bc.toString();
    }
    
    public int getLevelChangeAgainstCultistPlayer(){
        return levelChangeAgainstCultistPlayer;
    }
    public int getBasicValue(){
        return getCombatLevel();
    }
        
    public int getSpecialValue(){
        return getCombatLevel() + getLevelChangeAgainstCultistPlayer();
        
    }
}
