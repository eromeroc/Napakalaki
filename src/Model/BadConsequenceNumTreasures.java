/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class BadConsequenceNumTreasures extends BadConsequence{
    
    public BadConsequenceNumTreasures(String t, int lev, int nVisible, int nHidden){
        text = t;
        levels = lev;             
        nHiddenTreasures = nHidden;   
        nVisibleTreasures = nVisible;  
        death = false;
        specificVisibleTreasures = new ArrayList<TreasureKind>();
        specificHiddenTreasures = new ArrayList<TreasureKind>();
    }
    
    @Override
    public void substractVisibleTreasure(Treasure t){
        if(nVisibleTreasures > 0)  nVisibleTreasures--;
    }
    
    @Override
    public void substractHiddenTreasure(Treasure t){
        
        if(nHiddenTreasures > 0) nHiddenTreasures--;
    }
    
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){
        int nVisible, nHidden;
        if (nVisibleTreasures > v.size())
            nVisible = v.size();
        else
            nVisible = nVisibleTreasures;
    
        if (nHiddenTreasures > h.size())
            nHidden = h.size();
        else
            nHidden = nHiddenTreasures;
        
        BadConsequence bc = new BadConsequenceNumTreasures(text,0,nVisible, nHidden);
        return bc;
    }
    
    public boolean isEmpty(){
        if ((nVisibleTreasures == 0) && (nHiddenTreasures == 0) && (levels == 0))     
            return true;
        
        else
            return false;
    }
    
    public String toString(){
        return " " +text+ "\n\t\tNiveles que se pierden: " +Integer.toString(levels)+ "\n\t\tNº Tesoros ocultos que pierdes: " +Integer.toString(nHiddenTreasures)
      +"\n\t\tNº tesoros visibles que pierdes: " +Integer.toString(nVisibleTreasures);
    }
}
