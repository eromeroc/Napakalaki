/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class CartasMonstruos {
    
    private ArrayList<Monster> monstruos;
    
    public CartasMonstruos(){
         /**
         * Crea monstruo "3 Byakhees de bonanza"
         */

        monstruos = new ArrayList<Monster>();
        
        
        BadConsequence badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,      
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        
        Prize prize = new Prize(2,1);
        
        monstruos.add(new Monster("3 Byakhees de bonanza", 8, badConsequence, prize));
    }
    
    public ArrayList<Monster> getMonstruos(){
        return monstruos;
    }
    
    public ArrayList<Monster> levelMayorQue10(){
        ArrayList<Monster> monstruitos = new ArrayList<Monster>() ;
        
        for(Monster k: monstruos){
            if((k.getCombatLevel()) > 10){
                monstruitos.add(k);
            }
        }
        return monstruitos;
    }

    public ArrayList<Monster> soloPierdenNivel(){
        ArrayList<Monster> monstruitos = new ArrayList<Monster>() ;
        
        for(Monster k: monstruos){
            if((k.getBadConsequence().getLevels() > 0) && (k.getBadConsequence().getnHiddenTreasures() == 0)
                    && (k.getBadConsequence().getnVisibleTreasures() == 0)){
                monstruitos.add(k);
            }
        }
        return monstruitos;
    }
   
    //Su buen rollo indique una ganancia de niveles superior a 1
    public ArrayList<Monster> NivelMayorQueUno(){
        ArrayList<Monster> monstruitos = new ArrayList<Monster>() ;
        for(Monster k: monstruos){
            if(k.getBadConsequence().getLevels() > 1){
                monstruitos.add(k);
            }
        }
        
        return monstruitos;
    }
    
    //Cuyo mal rollo suponga la pérdida de al menos un tesoro tipo ONEHAND ya sea visible u oculto.
    public ArrayList<Monster> PierdesUnTesoro(){
        ArrayList<Monster> monstruitos = new ArrayList<Monster>();
        
        for(Monster k: monstruos){
            if((k.getBadConsequence().getnHiddenTreasures() >= 1) | (k.getBadConsequence().getnVisibleTreasures()>= 1)){
                monstruitos.add(k);
            }
        }
        return monstruitos;
    }
    
    public String toString(ArrayList<Monster> array_monstruo){
        String cadena_monstruos = "\n";
        int contador = 1 ; 
        for(Monster k : array_monstruo){
            cadena_monstruos += "Monstruo número"+Integer.toString(contador)+ ":\n";
            cadena_monstruos += k.toString();
            cadena_monstruos += "\n\n";
            contador++;
        }
        
        return cadena_monstruos;
    }
    
   
}