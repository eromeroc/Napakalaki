package napakalaki;

import napakalaki.TreasureKind;
import java.util.ArrayList;


public class BadConsequence {
    
    private String text;            //Mal rollo
    private int levels;             //Niveles que se pierden
    private int nHiddenTreasures;   //Nº tesoros ocultos que se pierden
    private int nVisibleTreasures;  //Nº tesoros visibles que se pierden
    private boolean death;          //Mal rollo de tipo muerte
    
    private ArrayList<TreasureKind> specificHiddenTreasures;
    private ArrayList<TreasureKind> specificVisibleTreasures;
    
    /**
     * Constructores
     */
  
    public BadConsequence(){
        text = " ";
        levels = 0;
        nHiddenTreasures = 0;
        nVisibleTreasures = 0;
        death = false;
        specificHiddenTreasures = new ArrayList<TreasureKind>();
        specificVisibleTreasures = new ArrayList<TreasureKind>();        
    }
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        this.nHiddenTreasures = nHidden;
        this.nVisibleTreasures = nVisible;
        this.death = false;
        
        specificHiddenTreasures = new ArrayList<TreasureKind>();
        specificVisibleTreasures = new ArrayList<TreasureKind>();
    }
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
        this.nHiddenTreasures = 0;
        this.nVisibleTreasures = 0;
        
        specificHiddenTreasures = new ArrayList<TreasureKind>();
        specificVisibleTreasures = new ArrayList<TreasureKind>();
    }
    
    public BadConsequence(String text, int levels,ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.death = false;
        this.specificHiddenTreasures = tHidden;
        this.specificVisibleTreasures = tVisible;
        
        nHiddenTreasures = 0;
        nVisibleTreasures = 0;
    }
    
    /**
     * Devuelve true cuando el mal rollo está vacío, es decir, el conjunto de atributos
     * de mal rollo indican que no hay mal rollo que cumplir
     */
    public boolean isEmpty(){
        boolean respuesta;
        if ((text == " ") && (nVisibleTreasures == 0) && (nHiddenTreasures == 0)
                && specificHiddenTreasures.isEmpty() && specificVisibleTreasures.isEmpty() && (death  == false)){        
            respuesta = true;
        }
        else
            respuesta = false;
        
        return respuesta;
    }
    
    /**
     * Devuelve true si un mal rollo es muerte
     */
    public boolean kills(){
        return death;
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
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return specificHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return specificVisibleTreasures;
    }
    
    public boolean getDeath(){
        return death;
    }
    
    /**
     * Actualiza el mal rollo (que tiene que cumplir el jugador) basandose
     * en el hecho de que el jugador se descarta del tesoro visible t
     */
    public void substractVisibleTreasure(Treasure t){
        if(nVisibleTreasures > 0) nVisibleTreasures--;
        else{
            for(TreasureKind treasure: specificVisibleTreasures){
                if(treasure == t.getType())
                    specificVisibleTreasures.remove(treasure);
            }
        }
        
    }
    
    /**
     * Actualiza el mal rollo (que tiene que cumplir el jugador) basandose
     * en el hecho de que el jugador se descarta del tesoro oculto t
     */
    public void substractHiddenTreasure(Treasure t){
        
        if(nHiddenTreasures > 0) nHiddenTreasures--;
        else{
            for(TreasureKind treasure: specificHiddenTreasures){
                if(treasure == t.getType())
                    specificHiddenTreasures.remove(treasure);
            }
        }
    }
    
    
    
//    Recibe como parámetros los tesoros visibles y ocultos de los que dispone el jugador y
//devuelve un nuevo objeto mal rollo creado a partir del objeto mal rollo que ejecuta este
//método.
//El objeto de mal rollo devuelto por adjustToFitTreasureLists solo contendrá listas
//de tipos de tesoros o cantidades de tesoros de forma que el jugador correspondiente
//pueda cumplir el mal rollo generado.
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){
        
    }
    
    
    
    
    public String arrayToString(ArrayList<TreasureKind> kindList){
        String aux = " ";
        
        if(kindList.isEmpty()){
            aux = "Ninguno";
        }
        else{
            for(TreasureKind k: kindList){
                aux+= k.toString() + ", ";
            }
        }
        return aux;
    }
    
    public String toString(){
        return "\nMal rollo =" +text+ "\nNiveles que se pierden =" +Integer.toString(levels)+ "\nNº Tesoros ocultos perdidos=" +Integer.toString(nHiddenTreasures)
      +"\nNº tesoros visibles perdidos=" +Integer.toString(nVisibleTreasures)+ "\nMuerte= " +Boolean.toString(death)
       + "\nTesoros ocultos =" +arrayToString(specificHiddenTreasures)+ "\nTesoros visibles =" +arrayToString(specificVisibleTreasures)+ "\n\n"; 
    }
    
}
