/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author sagrario
 */
public class Singleton {
    private static Singleton INSTANCE = null;
 
    // Private constructor suppresses 
    private Singleton(){}
 
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new Singleton();
        }
    }
 
    public static Singleton getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }

}
