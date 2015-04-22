package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Elena Romero y Marta Verona
 */


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
//        BadConsequence badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,      
//        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
//        
//        Prize prize = new Prize(2,1);
//        Monster m = new Monster("3 Byakhees de bonanza", 8, badConsequence, prize);
//        
//        Player player= new Player("nombre");
//        
//        player.initTreasures();
//        player.applyPrize(m.getPrize());
//        player.die(); // PONER PUBLICO PARA PRUEBAS
//        System.out.println(player.isDead());
//        player.applyBadConsequence(badConsequence);
//        
        /*
       Treasure tesoros = new Treasure("nombre",3,4,5, TreasureKind.ARMOR );
       System.out.println(tesoros.getName());
       System.out.println(tesoros.getGolCoind());
       System.out.println(tesoros.getMaxBonus());
       System.out.println(tesoros.getMinBonus());
       System.out.println(tesoros.getType());
       System.out.println("Prueba Treasure");
       */
      
        /*
        BadConsequence bc = new BadConsequence("prueba", true);
        Treasure v = new Treasure("s", 0,0,0,TreasureKind.ARMOR);
        Treasure h = new Treasure("s", 0,0,0,TreasureKind.ARMOR);
        ArrayList<Treasure> hidden = new ArrayList<Treasure>();
        hidden.add(h);
        ArrayList<Treasure> visible = new ArrayList<Treasure>();
        hidden.add(v);
        bc.adjustToFitTreasureLists(visible,hidden);
        System.out.println("Prueba BC");
                */
    }
    
}
