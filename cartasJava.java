
/**
 *@deprecated Método encargado de inicializar la baraja de monstruos
 *@param max Número máximo de objetos que puede poseer un jugardor
 *@return Array de monstruos inicializados
 */
 
public static ArrayList<Monster> InitializeMonsters(int max)
{  

    ArrayList<Monster> monstruos = new ArrayList();
    BadConsequence badConsequence;
    Prize prize;
    
    /* 3 byankhees de bonanza */
    badConsequence = new BadConsequence("Pierdes tu armadura visible y "
        + "otra oculta",0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
    prize = new Prize(2,1);
    monstruos.add(new Monster("3 byankhees de bonanza", 8 , badConsequence, prize));
    
    /* Chubithulhu */
    badConsequence = new BadConsequence("Embobados con el lindo primigenio "
        + "te descartas de tu casco visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
    prize = new Prize(1,1);
    monstruos.add(new Monster("Chubithulhu",2, badConsequence, prize));
    
    /*El sopor de Dunwich*/ 
    badConsequence = new BadConsequence("El primordial bostezo contagioso. "
        + "tPierdes el calzado visible.", 0, 
        new ArrayList(Arrays.asList(TreasureKind.SHOE)), new ArrayList());
    prize = new Prize(1,1);
    monstruos.add(new Monster("El sopor de Dunwich",2, badConsequence, prize));
    
     
    /* Ángeles de la noche ibicenca */
    badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta "
        + "y te dejan caer en mitad del vuelo. Descarta 1 mano visible "
        + "y 1 mano oculta", 0,
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
    prize = new Prize(4,1);
    monstruos.add(new Monster("Ángeles de la noche ibicenca", 14, 
        badConsequence, prize));
    
    /* El gorrón en el umbral */
    badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles", 0,
    max,0);
    prize = new Prize(3,1);
    monstruos.add(new Monster("El gorrón en el umbral",10, badConsequence, prize));
    
    /* H.P. Munchcraft */
    badConsequence = new BadConsequence("Pierdes la armadura visible", 0,
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), 
        new ArrayList());
    prize = new Prize(2,1);
    monstruos.add(new Monster("H.P. Munchcraft", 6, badConsequence, prize));
    
    /* Bichgooth */
    badConsequence = new BadConsequence("Sientes bichos bajo la ropa. "
        + "Descarta la armadura visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList());
    prize = new Prize(1,1);
    monstruos.add(new Monster("Bichgooth",2, badConsequence,prize));
    
    /* El rey de la rosa */
    badConsequence = new BadConsequence("Pierdes 5 niveles y "
        + "3 tesoros visibles", 5, 3, 0);
    prize = new Prize(4,2);
    monstruos.add(new Monster("El rey de rosa", 13, badConsequence, prize));
    
    /* La que redacta en las tinieblas */
    badConsequence = new BadConsequence("Toses los pulmones y pierdes dos "
        + "niveles", 2, 0, 0);
    prize = new Prize(1,1);
    monstruos.add(new Monster("La que redacta en las tinieblas",2, 
        badConsequence, prize));
    
    /* Los hondos */
    badConsequence = new BadConsequence("Estos monstruos resultan bastante "
        + "superficiales y te aburren mortalmente", true);
    prize = new Prize(2,1);
    monstruos.add(new Monster("Los hondos",8, badConsequence, prize));
    
    /* Semillas Cthulhu */
    badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros "
        + "ocultos", 2, 0, 2);
    prize = new Prize(2,1);
    monstruos.add(new Monster("Semillas Cthulhu", 4, badConsequence, prize));
    
    /* Dameargo */
    badConsequence = new BadConsequence("Te intentas escaquear. Pierdes una "
        + "mano visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), 
        new ArrayList());
    prize = new Prize(2,1);
    monstruos.add(new Monster("Dameargo", 1, badConsequence, prize));
    
    /* Pollipólipo volante */
    badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",
        3, 0, 0);
    prize = new Prize(1,1);
    monstruos.add(new Monster("Pollipólipo volante", 3, badConsequence, prize));
    
    /* Yskhtihyssg-Goth */
    badConsequence = new BadConsequence("No le hace gracia que pronuncien "
        + "mal su nombre. Estas muerto", true);
    prize = new Prize(3,1);
    monstruos.add(new Monster("Yskhtihyssg-Goth", 12, badConsequence, prize));
    
    /* Familia feliz */
    badConsequence = new BadConsequence("La familia te atrapa. Estas muerto",
        true);
    prize = new Prize(4,1);
    monstruos.add(new Monster("Familia feliz", 1, badConsequence, prize));
    
    /* Roboggoth */
    badConsequence = new BadConsequence("La quinta directiva primaria te "
        + "obliga a perder 2 niveles y un tesoro 2 manos visible", 2, 
        new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
        new ArrayList());
    prize = new Prize(2,1);
    monstruos.add(new Monster("Roboggoth", 8, badConsequence, prize));
    
    
    /* El espia */
    badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un "
        + "casco visible", 0, 
        new ArrayList(Arrays.asList(TreasureKind.HELMET)), 
        new ArrayList());
    prize = new Prize(1,1);
    monstruos.add(new Monster("El espia", 5, badConsequence, prize));
    
    /* El Lenguas */
    badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 "
        + "niveles y 5 tesoros visibles", 2, 5, 0);
    prize = new Prize(1,1);
    monstruos.add(new Monster("El Lenguas" , 20, badConsequence, prize));
    
    /* Bicéfalo */

    badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. " +
             "Pierdes 3 niveles y tus tesoros visibles de las manos", 3,
             new ArrayList(Arrays.asList(TreasureKind.ONEHAND,TreasureKind.ONEHAND,TreasureKind.BOTHHANDS)), new ArrayList());
    prize = new Prize(1,1);
    monstruos.add(new Monster("Bicéfalo", 20, badConsequence, prize));
    
    
    return monstruos;
}
