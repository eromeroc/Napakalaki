package napakalaki;


import napakalaki.TreasureKind;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Marta Verona y Elena Romero
 */
public class BadConsequence {
    
    private String text; //Mal rollo
    private int levels; //Niveles que se pierden
    private int nHiddenTreasures; //Nº tesoros ocultos que se pierden
    private int nVisibleTreasures; //Nº tesoros visibles que se pierden
    private boolean death; //Mal rollo de tipo muerte
    
    private ArrayList<TreasureKind> specificHiddenTreasures;
    private ArrayList<TreasureKind> specificVisibleTreasures;
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        this.nHiddenTreasures = nHidden;
        this.nVisibleTreasures = nVisible;
        this.death = false;
    }
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
        this.nHiddenTreasures = 0;
        this.nVisibleTreasures = 0;
    }
    
    public BadConsequence(String text, int levels,ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.death = false;
        this.specificHiddenTreasures = tHidden;
        this.specificVisibleTreasures = tVisible;
    }
    
    public String getText(){
        return text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getnHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public int getnVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public boolean getDeath(){
        return death;
    }
    public String arrayToString(ArrayList<TreasureKind> kindList){
        String aux = "\n";
        for(TreasureKind k: kindList){
            aux=aux+k.toString();
        }
        return aux;
    }
    public String toString(){
        return "Mal rollo =" +text+ "Niveles que se pierden =" +Integer.toString(levels)+ "Nº Tesoros ocultos perdidos=" +Integer.toString(nHiddenTreasures)
      +"Nº tesoros visibles perdidos=" +Integer.toString(nVisibleTreasures)+ "Muerte= " +Boolean.toString(death)
       + "Tesoros ocultos =" +arrayToString(specificHiddenTreasures)+ "Tesoros visibles =" +arrayToString(specificVisibleTreasures); 
    }
    
}
