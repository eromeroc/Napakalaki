package Model;

import java.util.ArrayList;


public abstract class BadConsequence {
    //package
    String text;            //Mal rollo
    int levels;             //Niveles que se pierden
    int nHiddenTreasures;   //Nº tesoros ocultos que se pierden
    int nVisibleTreasures;  //Nº tesoros visibles que se pierden
    boolean death;          //Mal rollo de tipo muerte
    
    ArrayList<TreasureKind> specificHiddenTreasures;
    ArrayList<TreasureKind> specificVisibleTreasures;
    
    /**
     * Devuelve true cuando el mal rollo está vacío, es decir, el conjunto de atributos
     * de mal rollo indican que no hay mal rollo que cumplir
     */
    public abstract boolean isEmpty();
    
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
     * @param Treasure t
     */
    public abstract void substractVisibleTreasure(Treasure t);
    /**
     * Actualiza el mal rollo (que tiene que cumplir el jugador) basandose
     * en el hecho de que el jugador se descarta del tesoro oculto t
     */
    public abstract void substractHiddenTreasure(Treasure t);
    
    
    /**
     * Recibe como parámetros los tesoros visibles y ocultos de los que dispone el jugador y
     * devuelve un nuevo objeto mal rollo creado a partir del objeto mal rollo que ejecuta este
     * método.
     * El objeto de mal rollo devuelto por adjustToFitTreasureLists solo contendrá listas
     * de tipos de tesoros o cantidades de tesoros de forma que el jugador correspondiente
     * pueda cumplir el mal rollo generado.
     */ 
    
    public abstract BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h);
    
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
   
    public abstract String toString();
    
}
