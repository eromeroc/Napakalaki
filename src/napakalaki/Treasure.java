
package napakalaki;

/**
 * @author Elena Romero y Marta Verona
 */

public class Treasure {
    private String name;
    private int goldCoins;
    private int minBonus;
    private int maxBonus;
    
    private TreasureKind type; 

    /**
     * Constructor 
     */
    public Treasure(String n, int g, int min, int max, TreasureKind t){
        name = n;
        goldCoins = g;
        minBonus = min;
        maxBonus = max;
        type = t;
    }
    
    /**
     * Consultores
     */
    public String getName(){
        return name;
    }

    public int getGolCoind(){
        return goldCoins;
    }
    public int getMinBonus() {
        return minBonus;
    }
    public int getMaxBonus(){
        return maxBonus;
    }
    public TreasureKind getType(){
        return type;
    }
}
