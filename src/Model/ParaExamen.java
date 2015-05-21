
package Model;

import java.util.ArrayList;
import java.util.Arrays;


public class ParaExamen {
    public static void main(String[] args) {
        
    //TESOROS: Nombre, coins, min, max, kind
    ArrayList<Treasure> tVisibles = new ArrayList<Treasure>();
    ArrayList<Treasure> tHidden = new ArrayList<Treasure>();
    tVisibles.add(new Treasure("Treasure", 0, 4, 7, TreasureKind.HELMET));
    tHidden.add(new Treasure("Treasure", 0, 4, 7, TreasureKind.HELMET));
    
    //BADCONSEQUENCE: level, visibles-ocultos
    BadConsequence bcType = new BadConsequenceTypeTreasures("BcType",0,
            new ArrayList(Arrays.asList(TreasureKind.ARMOR, TreasureKind.HELMET)), new ArrayList());
    
    BadConsequence bcNum = new BadConsequenceNumTreasures("BcType",0, 0, 0);
    BadConsequence bcDeath = new BadConsequenceDeath("BcDeath");
    
    //MONSTER: nivel, bc, prize, cultist?
    Prize prize1 = new Prize(2, 1);
    Monster monster1 = new Monster("monster1", 8, bcType, prize1,0);
    
    
    //PLAYER
    Player j1 = new Player("j1");
    Player j2 = new Player("j2");
    Player j3 = new Player("j3");
    
    j1.setPendingBadConsequence(bcType);
    j2.setPendingBadConsequence(bcType);
    j3.setPendingBadConsequence(bcType);
   
    //CULTIST Y CULTIST PLAYER
    Cultist cult = new Cultist("sect1",2);
    CultistPlayer sect1 = new CultistPlayer(j1, cult);
   
    System.out.println(j1.validState());
    
    System.out.println(sect1.getCombatLevel());
    
    System.out.println(cult.getBasicValue());
    System.out.println(cult.getSpecialValue());
        
        
        
        
        
        
        
        
    }
    
}
