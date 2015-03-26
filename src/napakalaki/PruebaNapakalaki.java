package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Elena Romero y Marta Verona
 */
import napakalaki.CartasMonstruos;
import napakalaki.Monster;
import napakalaki.CardDealer;
import napakalaki.Napakalaki;
import napakalaki.Treasure;

public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /* 
        CardDealer cartas = CardDealer.getInstance();
        cartas.initCards();
        System.out.println("Prueba CardDealer");
      */
        
        
        /*
        Napakalaki napa = Napakalaki.getInstance();
        System.out.println("Prueba Napakalaki");
        */
        
        Treasure tesoros = new Treasure("nombre",3,4,5, TreasureKind.ARMOR );
        System.out.println("Prueba Treasure");
        
    }
    
}
