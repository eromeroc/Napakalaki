
package Model;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class BadConsequenceTypeTreasures extends BadConsequence{
    
      
    public BadConsequenceTypeTreasures(String t, int lev, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        text = t;
        levels = lev;             
        nHiddenTreasures = 0;   
        nVisibleTreasures = 0;  
        death = false;
        specificVisibleTreasures = tVisible;
        specificHiddenTreasures = tHidden;
    }
    
}
