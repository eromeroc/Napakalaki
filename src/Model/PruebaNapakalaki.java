package Model;

import java.util.ArrayList;
import java.util.Arrays;
import GUI.NapakalakiView;
import GUI.PlayerNamesCapture;

/**
 * @author Elena Romero y Marta Verona
 */

public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Napakalaki napakalakiModel = Napakalaki.getInstance();
        NapakalakiView napakalakiView = new NapakalakiView();
        ArrayList<String> names = new ArrayList<String>();
        PlayerNamesCapture namesCapture= new PlayerNamesCapture(napakalakiView,true);
        
        napakalakiView.setNapakalaki(napakalakiModel);
        Dice.createInstance(napakalakiView);
        
        names = namesCapture.getNames();
        napakalakiModel.initGame(names);
        
        napakalakiView.showView();
        
        
        
        //PRUEBA CARDDEALER
        
//        CardDealer cartas = CardDealer.getInstance();
//        cartas.initCards();
//        System.out.println(cartas.nextCultist().toString()); //No hace bien el toString
//        System.out.println(cartas.nextTreasure().toString());
//        System.out.println(cartas.nextMonster().toString());
//        System.out.println("Prueba CardDealer");
//        
//        
//        //PRUEBA NAPAKALAKI
//        
//        Napakalaki napa = Napakalaki.getInstance();
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("marta");
//        names.add("elena");
//        napa.initGame(names);
//        napa.nextTurn();
//        napa.getCurrentPlayer();
//        napa.getCurrentMonster();
//        napa.nextTurnAllowed();
//        napa.combat();
//        System.out.println(napa.endOfGame(CombatResult.WINANDWINGAME));
//        System.out.println(napa.endOfGame(CombatResult.WIN));
//        System.out.println("Prueba Napakalaki");
//        
//        
//        //PRUEBA DICE
//        
//        Dice dice = Dice.getInstance();
//        for(int i = 0; i<6; i++)
//            System.out.println(dice.nextNumber());
//        
//        
//        //PRUEBA PLAYER
//        
//        BadConsequenceTypeTreasures badConsequence = new BadConsequenceTypeTreasures("Pierdes tu armadura visible y otra oculta", 0,      
//        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR))); 
//        Prize prize = new Prize(2,1);
//        Monster m = new Monster("3 Byakhees de bonanza", 8, badConsequence, prize);
//        Treasure t = new Treasure("Tentácula de pega", 200, 0, 1, TreasureKind.HELMET);
//        ArrayList<Treasure> treasures = new ArrayList<Treasure>() ;
//        treasures.add(t);
//        Player player= new Player("nombre");
//        player.initTreasures();
//        player.applyPrize(m.getPrize());
//        player.applyBadConsequence(badConsequence);
//        player.discardNecklaceIfVisible(); //PONER PÚBLICO PARA PRUEBAS
//        player.die(); // PONER PUBLICO PARA PRUEBAS
//        System.out.println(player.isDead());
//        System.out.println(player.canMakeTreasureVisible(t));
//        System.out.println(player.computeGoldCoinsValue(treasures)); //PONER PUBLICO PARA PRUEBAS (es protected)
//        System.out.println(player.toString());
//        System.out.println(player.shouldConvert());
//        
//        
//        
//        
//       
//        
//        
//        
//        //PRUEBA TREASURE
//        
//        
//        Treasure tesoros = new Treasure("nombre",3,4,5, TreasureKind.ARMOR );
//        System.out.println(tesoros.toString());
//        System.out.println(tesoros.getBasicValue());
//        System.out.println(tesoros.getSpecialValue());
//        
//        
//        
//        //PRUEBA BADCONSEQUENCE
//        BadConsequence bc1 = new BadConsequenceDeath("prueba");
//        BadConsequence bc2 = new BadConsequenceNumTreasures("prueba",0,0,0);
//        BadConsequence bc3 = new BadConsequenceTypeTreasures("prueba",0,new ArrayList<>(),new ArrayList<>());
//        BadConsequence aux = new BadConsequenceDeath("prueba");
//        
//        aux = bc2;
//        bc2= bc1;
//        bc1=aux;
//        
//        aux= bc3;
//        bc3 = bc2;
//        bc2=aux;
//        bc2=bc1;
//        
//        
//        
//        Treasure v = new Treasure("s", 2,0,0,TreasureKind.ARMOR);
//        Treasure h = new Treasure("s", 0,0,0,TreasureKind.ARMOR);
//        ArrayList<Treasure> hidden = new ArrayList<Treasure>();
//        hidden.add(h);
//        ArrayList<Treasure> visible = new ArrayList<Treasure>();
//        visible.add(v);
        
        
//        bc1.adjustToFitTreasureLists(visible,hidden);
//        bc2.adjustToFitTreasureLists(visible,hidden);
//        bc3.adjustToFitTreasureLists(visible,hidden);
//        
//        System.out.println(bc1.isEmpty());
//        System.out.println(bc2.isEmpty());
//        System.out.println(bc3.isEmpty());
//        System.out.println("Prueba BC");
        
        
        //PRUEBA CULTIST
        
//        Cultist pc = new Cultist("j1",2);
//        System.out.println(pc.getBasicValue());
//        System.out.println(pc.getSpecialValue());
         

        //PRUEBA CULTIST PLAYER
//        Player p = new Player("mgs");
//        CultistPlayer cul = new CultistPlayer(p,CardDealer.getInstance().nextCultist());
//        System.out.println(cul.computeGoldCoinsValue(visible));
//        System.out.println(p.computeGoldCoinsValue(visible));
//        System.out.println(cul.toString());
//        System.out.println(p.toString());
        
        //cul = (CultistPlayer) p;
//        p = cul;
        
        
    }
    
}
