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
    
}
