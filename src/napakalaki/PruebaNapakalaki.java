/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author usuario
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "El gorrón en el umbral";
        int nivel = 10;
        int nivelesQuePierde = 1;
        String malRollo = "Pierdes todos tus tesoros visibles";
        boolean death = false;
        int nTesorosVisibles = 3;
        int nTesorosOcultos = 500;
        
        
        BadConsequence malRollito = new BadConsequence(malRollo, nivelesQuePierde, nTesorosVisibles, nTesorosOcultos);
        Prize premio = new Prize(nivelesQuePierde, nTesorosVisibles);
        Monster monstruito = new Monster(nombre, nivel, malRollito, premio);
        
        System.out.println(malRollito.toString());
        System.out.println(premio.toString());
        System.out.println(monstruito.toString());
    }
    
}
