
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
    
    @Override
    public void substractVisibleTreasure(Treasure t){
        TreasureKind substract =null;
            for(TreasureKind treasure: specificVisibleTreasures){
                if(treasure == t.getType())
                    substract = treasure;
            }
            if(substract != null)
                specificVisibleTreasures.remove(substract);
    }
    
    
    @Override
    public void substractHiddenTreasure(Treasure t){
        TreasureKind substract =null;
            for(TreasureKind treasure: specificHiddenTreasures){
                if(treasure == t.getType())
                     substract = treasure;
            }
            if(substract != null)
                specificHiddenTreasures.remove(substract);
    }
    
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){
        ArrayList<TreasureKind> visible = new ArrayList<TreasureKind>();
        ArrayList<TreasureKind> hidden = new ArrayList<TreasureKind>();
        boolean añadido;
        for(Treasure k:v){
            añadido = false;
            for(TreasureKind j:specificVisibleTreasures){
                if (j == k.getType() && !añadido){
                    visible.add(j);
                    añadido = true;
                }
            }
        }
                
        for(Treasure k:h){
            añadido = false;
            for(TreasureKind j:specificHiddenTreasures){
                if (j == k.getType()  && !añadido){
                    hidden.add(j);
                    añadido = true;
                }
            }
        }
        BadConsequence bc = new BadConsequenceTypeTreasures(text, 0, visible, hidden);
        return bc;
    }
    
    public boolean isEmpty(){
        if ((levels == 0) && specificHiddenTreasures.isEmpty() && specificVisibleTreasures.isEmpty()){        
            return true;
        }
        else
            return false;
    }
        
    
    
    public String toString(){
        return " " +text+ "\n\t\tNiveles que se pierden: " +Integer.toString(levels)
                + "\n\t\tTesoros ocultos: " +arrayToString(specificHiddenTreasures)+ 
                "\n\t\tTesoros visibles: " +arrayToString(specificVisibleTreasures)+ "\n\n"; 
    }
} 
