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
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Monster> monstruos = new ArrayList();
        
        /**
         * Crea monstruo "3 Byakhees de bonanza"
         */

        BadConsequence badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,      
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        
        Prize prize = new Prize(2,1);
        
        monstruos.add(new Monster("3 Byakhees de bonanza", 8, badConsequence, prize));
        
        /**
         * Crea monstruo: "Chibithulhu"
         */
        
        badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tus casco visible",
        0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new)
    }
    
}
