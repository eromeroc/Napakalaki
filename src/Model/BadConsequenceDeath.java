
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
     
     
     @Override
    public void substractVisibleTreasure(Treasure t){
       
    }
    
    
    @Override
    public void substractHiddenTreasure(Treasure t){
    }
    
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){
        return this;
    }
    
    public boolean isEmpty(){
        if ((levels == 0))     
            return true;
        else
            return false;
        
    }
    
    public String toString(){
        return " " +text+
       "\n\t\tMuerte: " +Boolean.toString(death);
    }
}
