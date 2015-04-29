package Model;

import Model.BadConsequence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import Model.Monster;
import Model.Treasure;


public class CardDealer {
   
    ArrayList<Monster> unusedMonsters;   
    ArrayList<Monster> usedMonsters;     
    
    ArrayList<Treasure> unusedTreasures; 
    ArrayList<Treasure> usedTreasures;   
  
    
    private static CardDealer instance = null;
 
    /**
     * Constructor (privado)
     */
    private CardDealer(){
        unusedMonsters = new ArrayList<Monster>();
        usedMonsters = new ArrayList<Monster>();
        unusedTreasures = new ArrayList<Treasure>() ;
        usedTreasures = new ArrayList<Treasure>() ;
        
        initCards();
    }
 
    /**
     * Devuelve la única instancia de CardDealer y la inicializa si no lo está aún
     */
    public static CardDealer getInstance() {
        if (instance == null){
            instance = new CardDealer();
        }
        return instance;
    }
    
    
    /**
     * Inicializa Cartas de Tesoros
     */
    private void initTreasureCardDeck(){
        //Estructura: Nombre, Piezas de oro, minBonus, maxBonus, TreasureKind.XXXXX

        unusedTreasures.add(new Treasure("¡Sí mi amo!", 0, 4, 7, TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Botas de investigación", 600, 3, 4, TreasureKind.SHOE));
        unusedTreasures.add(new Treasure("Capucha de Cthulhu", 500, 3, 5, TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("A prueba de babas", 400, 2, 5, TreasureKind.ARMOR));
        unusedTreasures.add(new Treasure("Botas de lluvia ácida", 800, 1, 1, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Casco minero", 400, 2, 4, TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Ametralladora Thompson", 600, 4, 8, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Camiseta de la UGR", 100, 1, 7, TreasureKind.ARMOR));
        unusedTreasures.add(new Treasure("Clavo de rail ferroviario", 400, 3, 6, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Cuchillo de sushi arcano", 300, 2, 3, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Fez alópodo", 700, 3, 5, TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Hacha prehistórica", 500, 2, 5, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("El aparato del Pr. Tesla", 900, 4, 8, TreasureKind.ARMOR));
        unusedTreasures.add(new Treasure("Gaita", 500, 4, 5, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Insecticida", 300, 2, 3, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Escopeta de 3 cañones", 700, 4, 6, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Garabato místico", 300, 2, 2, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("La fuerza de Mr. T", 1000, 0, 0, TreasureKind.NECKLACE));
        unusedTreasures.add(new Treasure("La rebeca metálica", 400, 2, 3, TreasureKind.ARMOR));
        unusedTreasures.add(new Treasure("Mazo de los antiguos", 200, 3, 4, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Necro-playboycon", 300, 3, 5, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Lanzallamas", 800, 4, 8, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Necro-comicón", 100, 1, 1, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Necronomicón", 800, 5, 7, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Linterna a 2 manos", 400, 3, 6, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Necro-gnomicón", 200, 2, 4, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Necrotelecom", 300, 2, 3, TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Porra preternatural", 200, 2, 3, TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Tentácula de pega", 200, 0, 1, TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Zapato deja-amigos", 500, 0, 1, TreasureKind.SHOE));
        unusedTreasures.add(new Treasure("Shogulador", 600, 1, 1, TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Varita de atizamiento", 400, 3, 4, TreasureKind.ONEHAND));
        
        
    }
    
    
    /**
     * Inicializa cartas de monstruos
     */
    private void initMonsterCardDeck(){
         
        //Crea monstruo "3 Byakhees de bonanza"
        BadConsequence badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,      
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        
        Prize prize = new Prize(2,1);
        
        unusedMonsters.add(new Monster("3 Byakhees de bonanza", 8, badConsequence, prize));
        
        //Crea monstruo "Chubithulhu"
        badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
    
        prize = new Prize(1,1);
    
        unusedMonsters.add(new Monster("Chubithulhu",2, badConsequence, prize));
    
        //Crea monstruo "El sopor de Dunwich"
        badConsequence = new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible.",
                0, new ArrayList(Arrays.asList(TreasureKind.SHOE)), new ArrayList());
        prize = new Prize(1,1);
        unusedMonsters.add(new Monster("El sopor de Dunwich",2, badConsequence, prize));
    
        //Crea monstruo "Ángeles de la noche ibicenca"
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible "
            + "y 1 mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize = new Prize(4,1);
        unusedMonsters.add(new Monster("Ángeles de la noche ibicenca", 14, badConsequence, prize));
    
        //Crea monstruo "El gorrón en el umbral"
        badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles", 0, 6,0);
        prize = new Prize(3,1);
        unusedMonsters.add(new Monster("El gorrón en el umbral",10, badConsequence, prize));
    
         //Crea monstruo "H.P. Munchcraft"
         badConsequence = new BadConsequence("Pierdes la armadura visible", 0,
                 new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList());
        prize = new Prize(2,1);
        unusedMonsters.add(new Monster("H.P. Munchcraft", 6, badConsequence, prize));
    
        //Crea monstruo "Bichgooth"
        badConsequence = new BadConsequence("Sientes bichos bajo la ropa. Descarta la armadura visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList());
        prize = new Prize(1,1);
        unusedMonsters.add(new Monster("Bichgooth",2, badConsequence,prize));
    
        //Crea monstruo "El rey de la rosa"
        badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        prize = new Prize(4,2);
        unusedMonsters.add(new Monster("El rey de rosa", 13, badConsequence, prize));
    
        //Crea monstruo "La que redacta en las tinieblas"
        badConsequence = new BadConsequence("Toses los pulmones y pierdes dos niveles", 2, 0, 0);
        prize = new Prize(1,1);
        unusedMonsters.add(new Monster("La que redacta en las tinieblas",2, badConsequence, prize));
    
        //Crea monstruo "Los hondos"
        badConsequence = new BadConsequence("Estos unusedMonsters resultan bastante superficiales"
                + " y te aburren mortalmente", true);
        prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Los hondos",8, badConsequence, prize));
    
        //Crea monstruo "Semillas Cthulhu"
        badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos", 2, 0, 2);
        prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Semillas Cthulhu", 4, badConsequence, prize));
    
        //Crea monstruo "Dameargo"
        badConsequence = new BadConsequence("Te intentas escaquear. Pierdes una mano visible", 0, 
            new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList());
        prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Dameargo", 1, badConsequence, prize));
    
        //Crea monstruo "Pollipólipo volante"
        badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles", 3, 0, 0);
        prize = new Prize(1,1);
        unusedMonsters.add(new Monster("Pollipólipo volante", 3, badConsequence, prize));
    
        //Crea monstruo "Yskhtihyssg-Goth"
        badConsequence = new BadConsequence("No le hace gracia que pronuncien mal su nombre."
                + "Estas muerto", true);
        prize = new Prize(3,1);
        unusedMonsters.add(new Monster("Yskhtihyssg-Goth", 12, badConsequence, prize));
    
        //Crea monstruo "Familia feliz"
        badConsequence = new BadConsequence("La familia te atrapa. Estas muerto", true);
        prize = new Prize(4,1);
        unusedMonsters.add(new Monster("Familia feliz", 1, badConsequence, prize));
    
        //Crea monstruo "Roboggoth"
        badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles"
                + " y un tesoro 2 manos visible", 2, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
                new ArrayList());
        prize = new Prize(2,1);
        unusedMonsters.add(new Monster("Roboggoth", 8, badConsequence, prize));
    
    
        //Crea monstruo "El espia"
        badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
        prize = new Prize(1,1);
        unusedMonsters.add(new Monster("El espia", 5, badConsequence, prize));
    
        //Crea monstruo "El Lenguas"
        badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y"
                + " 5 tesoros visibles", 2, 5, 0);
        prize = new Prize(1,1);
        unusedMonsters.add(new Monster("El Lenguas" , 20, badConsequence, prize));
    
        //Crea monstruo "Bicéfalo"
        badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 niveles "
                + "y tus tesoros visibles de las manos", 3,
             new ArrayList(Arrays.asList(TreasureKind.ONEHAND,TreasureKind.ONEHAND,TreasureKind.BOTHHANDS)), new ArrayList());
        prize = new Prize(1,1);
        unusedMonsters.add(new Monster("Bicéfalo", 20, badConsequence, prize));
    }
    
    /**
     * Baraja cartas de tesoros
     */
    void shuffleTreasures(){
       Collections.shuffle(unusedTreasures);        
    }
    
    /**
     * Baraja cartas de  monstruos
     */
    void shuffleMonsters(){
        Collections.shuffle(unusedMonsters);       
    }
    
    /**
     * Devuelve el siguiente tesoro que hay en unusedTreasures y lo elimina de él.
     * Si el mazo está vacío, pasa el mazo de descartes al de tesoros y lo baraja
     */
    public Treasure nextTreasure(){
        Treasure nextTreasure;
        
        if(unusedTreasures.isEmpty()){
            unusedTreasures = usedTreasures;
            usedTreasures.clear();
            shuffleTreasures();
        }
        nextTreasure = unusedTreasures.get(unusedMonsters.size()-1); //¿Cogemos el último o el 0?
        unusedTreasures.remove(unusedMonsters.size()-1);
        
        return nextTreasure;
    }
    
    /**
     * Devuelve el siguiente monstruo que hay en unusedMonsters y lo elimina de él.
     * Si el mazo está vacío, pasa el mazo de descartes al de monstruos y lo baraja
     */
    public Monster nextMonster(){
       Monster nextMonster;
        
        if(unusedMonsters.isEmpty()){
            unusedMonsters = usedMonsters;
            usedMonsters.clear();
            shuffleMonsters();
        }
        nextMonster = unusedMonsters.get(unusedMonsters.size()-1); //¿Cogemos el último o el 0?
        unusedMonsters.remove(unusedMonsters.size()-1);
        
        return nextMonster;
      
    }
    
    
    /**
     * Introduce en el mazo de cartas de tesoros(usedTreasures) el tesoro t
     */
    public void giveTreasureBack(Treasure t){
        usedTreasures.add(t);
        
    }
    
    /**
     * Introduce en el mazo de cartas de monstruos(usedMonsters) el monstruo m
     */
    public void giveMonsterBack(Monster m){
        usedMonsters.add(m);
        
    }
    
    /**
     * Inicializa las cartas llamando a los métodos privados que inicializan las 
     * barajas de monstruos y tesoros
     */
    public void initCards(){
        initTreasureCardDeck();
        initMonsterCardDeck();
        
        shuffleMonsters();
        shuffleTreasures();
        
    }
}


