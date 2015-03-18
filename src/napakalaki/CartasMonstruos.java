
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Marta Verona y Elena Romero
 */
public class CartasMonstruos {
    
    private ArrayList<Monster> monstruos;
    
    public CartasMonstruos(){
         monstruos = new ArrayList<Monster>();
        
         /**
          * Crea monstruo "3 Byakhees de bonanza"
          */
        BadConsequence badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,      
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        
        Prize prize = new Prize(2,1);
        
        monstruos.add(new Monster("3 Byakhees de bonanza", 8, badConsequence, prize));
        
        /**
         * Crea monstruo "Chubithulhu"
         */
        badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
    
        prize = new Prize(1,1);
    
        monstruos.add(new Monster("Chubithulhu",2, badConsequence, prize));
    
        /**
         * Crea monstruo "El sopor de Dunwich"
         */ 
        badConsequence = new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible.",
                0, new ArrayList(Arrays.asList(TreasureKind.SHOE)), new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich",2, badConsequence, prize));
    
     
        /**
         * Crea monstruo "Ángeles de la noche ibicenca"
         */
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible "
            + "y 1 mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize = new Prize(4,1);
        monstruos.add(new Monster("Ángeles de la noche ibicenca", 14, badConsequence, prize));
    
        /**
         * Crea monstruo "El gorrón en el umbral"
         */
        badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles", 0, Integer.MAX_VALUE,0);
        prize = new Prize(3,1);
        monstruos.add(new Monster("El gorrón en el umbral",10, badConsequence, prize));
    
         /**
          * Crea monstruo "H.P. Munchcraft"
          */
         badConsequence = new BadConsequence("Pierdes la armadura visible", 0,
                 new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList());
        prize = new Prize(2,1);
        monstruos.add(new Monster("H.P. Munchcraft", 6, badConsequence, prize));
    
        /**
         * Crea monstruo "Bichgooth"
         */
        badConsequence = new BadConsequence("Sientes bichos bajo la ropa. Descarta la armadura visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("Bichgooth",2, badConsequence,prize));
    
        /**
         * Crea monstruo "El rey de la rosa"
         */
        badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        prize = new Prize(4,2);
        monstruos.add(new Monster("El rey de rosa", 13, badConsequence, prize));
    
        /**
         * Crea monstruo "La que redacta en las tinieblas"
         */
        badConsequence = new BadConsequence("Toses los pulmones y pierdes dos niveles", 2, 0, 0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("La que redacta en las tinieblas",2, badConsequence, prize));
    
        /**
         * Crea monstruo "Los hondos"
         */
        badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales"
                + " y te aburren mortalmente", true);
        prize = new Prize(2,1);
        monstruos.add(new Monster("Los hondos",8, badConsequence, prize));
    
        /**
         * Crea monstruo "Semillas Cthulhu"
         */
        badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos", 2, 0, 2);
        prize = new Prize(2,1);
        monstruos.add(new Monster("Semillas Cthulhu", 4, badConsequence, prize));
    
        /**
         * Crea monstruo "Dameargo"
         */
        badConsequence = new BadConsequence("Te intentas escaquear. Pierdes una mano visible", 0, 
            new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList());
        prize = new Prize(2,1);
        monstruos.add(new Monster("Dameargo", 1, badConsequence, prize));
    
        /**
         * Crea monstruo "Pollipólipo volante"
         */
        badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles", 3, 0, 0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("Pollipólipo volante", 3, badConsequence, prize));
    
        /**
         * Crea monstruo "Yskhtihyssg-Goth"
         */
        badConsequence = new BadConsequence("No le hace gracia que pronuncien mal su nombre."
                + "Estas muerto", true);
        prize = new Prize(3,1);
        monstruos.add(new Monster("Yskhtihyssg-Goth", 12, badConsequence, prize));
    
        /**
         * Crea monstruo "Familia feliz"
         */
        badConsequence = new BadConsequence("La familia te atrapa. Estas muerto", true);
        prize = new Prize(4,1);
        monstruos.add(new Monster("Familia feliz", 1, badConsequence, prize));
    
        /**
         * Crea monstruo "Roboggoth"
         */
        badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles"
                + " y un tesoro 2 manos visible", 2, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
                new ArrayList());
        prize = new Prize(2,1);
        monstruos.add(new Monster("Roboggoth", 8, badConsequence, prize));
    
    
        /**
         * Crea monstruo "El espia"
         */
        badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("El espia", 5, badConsequence, prize));
    
        /**
         * Crea monstruo "El Lenguas"
         */
        badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y"
                + " 5 tesoros visibles", 2, 5, 0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("El Lenguas" , 20, badConsequence, prize));
    
        /**
         * Crea monstruo "Bicéfalo"
         */
        badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 niveles "
                + "y tus tesoros visibles de las manos", 3,
             new ArrayList(Arrays.asList(TreasureKind.ONEHAND,TreasureKind.ONEHAND,TreasureKind.BOTHHANDS)), new ArrayList());
        prize = new Prize(1,1);
        monstruos.add(new Monster("Bicéfalo", 20, badConsequence, prize));
    }
    
    public ArrayList<Monster> getMonstruos(){
        return monstruos;
    }
    
    //Monstruos cuyo nivel es mayor que 10
    public ArrayList<Monster> levelMayorQue10(){
        ArrayList<Monster> listaMonstruos = new ArrayList<Monster>() ;
        
        for(Monster k: monstruos){
            if((k.getCombatLevel()) > 10){
                listaMonstruos.add(k);
            }
        }
        return listaMonstruos;
    }
    
    //Monstruos que solo pierden un nivel en su mal rollo
    public ArrayList<Monster> soloPierdenNivel(){
        ArrayList<Monster> listaMonstruos = new ArrayList<Monster>() ;
        
        for(Monster k: monstruos){
            if((k.getBadConsequence().getLevels() > 0) && (k.getBadConsequence().getnHiddenTreasures() == 0)
                    && (k.getBadConsequence().getnVisibleTreasures() == 0)){
                listaMonstruos.add(k);
            }
        }
        return listaMonstruos;
    }
   
    //Monstruos cuyo buen rollo indique una ganancia de niveles superior a 1
    public ArrayList<Monster> NivelMayorQueUno(){
        ArrayList<Monster> listaMonstruos = new ArrayList<Monster>() ;
        for(Monster k: monstruos){
            if(k.getBadConsequence().getLevels() > 1){
                listaMonstruos.add(k);
            }
        }
        
        return listaMonstruos;
    }
    
    //Monstruos cuyo mal rollo suponga la pérdida de al menos un tesoro tipo ONEHAND ya sea visible u oculto.
    public ArrayList<Monster> pierdeOnehand(){
        ArrayList<Monster> listaMonstruos = new ArrayList<Monster>();
        
        for(Monster m: monstruos){
            for(TreasureKind k: m.getBadConsequence().getSpecificHiddenTreasures()){
                if(k == TreasureKind.ONEHAND){
                  listaMonstruos.add(m);
                }   
            }
            for(TreasureKind k: m.getBadConsequence().getSpecificVisibleTreasures()){
                if(k == TreasureKind.ONEHAND){
                  listaMonstruos.add(m);
                }
            }
        }
        return listaMonstruos;
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