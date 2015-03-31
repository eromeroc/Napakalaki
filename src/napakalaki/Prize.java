package napakalaki;


/**
 * @author Marta Verona y Elena Romero
 */

public class Prize {
    private int levels;
    private int treasures;
    
    
    /**
     * Constructor
     */
    Prize(int treasures, int levels){
        this.treasures = treasures;
        this.levels = levels;
    }
    
    /**
     * Consultores 
     */
    public int getTreasures(){
        return treasures;
    }
    
    public int getLevels(){
        return levels;
    }
    
    /**
     * Devuelve string con el estado completo del objeto
     */ 
    public String toString(){
        return "\nTreasures =" + Integer.toString(treasures)+ "\nLevels =" +Integer.toString(levels);
    }
}
