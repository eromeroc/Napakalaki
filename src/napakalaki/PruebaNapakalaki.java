package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Elena Romero y Marta Verona
 */
import napakalaki.Monster;
import napakalaki.CardDealer;
import napakalaki.Napakalaki;
import napakalaki.Treasure;
import napakalaki.Dice;
import napakalaki.BadConsequence;

public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /*    
        CardDealer cartas = CardDealer.getInstance();
        cartas.initCards();
        cartas.shuffleTreasures();
        cartas.shuffleMonsters();
        System.out.println("Prueba CardDealer");
      */
        
        
      /*
        Napakalaki napa = Napakalaki.getInstance();
        String names[] = {"marta", "elena"};
        napa.initPlayers(names);
        napa.nextPlayer();
        napa.getCurrentPlayer();
        napa.getCurrentMonster();
        napa.nextTurnAllowed();
        System.out.println(napa.endOfGame(CombatResult.WINANDWINGAME));
        System.out.println(napa.endOfGame(CombatResult.WIN));
        System.out.println("Prueba Napakalaki");
        */
       
      /*  Dice dice = Dice.getInstance();
        for(int i = 0; i<6; i++)
            System.out.println(dice.nextNumber());
        */
       /*
        Player player= new Player("nombre");
         System.out.println(player.validState());
        System.out.println(player.getCombatLevel());
         System.out.println(player.isDead());
        System.out.println(player.getVisibleTreasures());
        System.out.println(player.getHiddenTreasures());
        System.out.println(player.hasVisibleTreasures());
        */        
        
        /*
       Treasure tesoros = new Treasure("nombre",3,4,5, TreasureKind.ARMOR );
       System.out.println(tesoros.getName());
       System.out.println(tesoros.getGolCoind());
       System.out.println(tesoros.getMaxBonus());
       System.out.println(tesoros.getMinBonus());
       System.out.println(tesoros.getType());
       System.out.println("Prueba Treasure");
       */
        
        BadConsequence bc = new BadConsequence("prueba", true);
        Treasure v = new Treasure("s", 0,0,0,TreasureKind.ARMOR);
        Treasure h = new Treasure("s", 0,0,0,TreasureKind.ARMOR);
        //bc.adjustToFitTreasureLists(v,h);
    }
    
}
