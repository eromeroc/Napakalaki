
package Model;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class BadConsequenceDeath extends BadConsequence{
    
     public BadConsequenceDeath(String t){
        text = t;
        levels = 0;             
        nHiddenTreasures = 0;   
        nVisibleTreasures = 0;  
        death = true;
        specificVisibleTreasures = new ArrayList<TreasureKind>();
        specificHiddenTreasures = new ArrayList<TreasureKind>();
         
    }
}
