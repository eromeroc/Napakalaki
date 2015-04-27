
package Model;

import java.util.Random;


public class Dice {
    
     private static  Dice instance = null;
     
     /**
      * Constructor (privado)
      */
     private Dice(){}
     
     /**
     * Devuelve la única instancia de Dice y la inicializa si no lo está aún
     */
     public static Dice getInstance(){
         if (instance == null){
                instance = new Dice();
        }
        return instance;
     }
     
     /**
      * Genera un número aleatorio entre 1 y 6
      */
     public int nextNumber(){
         int num;
         
         Random r = new Random();
         num = r.nextInt(6) + 1;
         
         return num;
     }
}



