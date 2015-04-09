package napakalaki;

import java.util.ArrayList;
import napakalaki.Player;
import napakalaki.Monster;
import java.util.Random;

//CombatResult y CardDealer discontinuas


public class Napakalaki {
    
    private Monster currentMonster; 
    private Player currentPlayer;   
    private ArrayList<Player> players;          // 1 o más 
    private int currentPlayerIndex = -1;
    
    
    private static  Napakalaki instance = null;
 
    
    /**
     * Constructor (privado)
     */
    private  Napakalaki(){
        players = new ArrayList<Player>();
        currentPlayer = null;
        currentMonster = null;
    }
    
    
    /**
     * Devuelve la única instancia de Napakalaki y la inicializa si no lo está aún
     */
    public static  Napakalaki getInstance() {
        if (instance == null){
                instance = new Napakalaki();
        }
        return instance;
    }
    
    /*Inicializa el array de jugadores que contiene Napakalaki, creando tantos jugadores como
elementos haya en names, que es el array de String que contiene el nombre de los
jugadores.*/
    //private 
    public void initPlayers(String[] names){
        for (int i = 0 ; i < names.length; i++){
            Player jugador = new Player(names[i]);
            players.add(jugador);
        }
    }
    
    /*Decide qué jugador es el siguiente en jugar. Se pueden dar dos posibilidades para calcular
el índice que ocupa dicho jugador en la lista de jugadores, que se trate del primer turno o
no. Para el primer turno se calculará la posición del primer jugador utilizando un número
aleatorio.
Se debe añadir a la clase Napakalali un atributo privado denominado
currentPlayerIndex. Este atributo representa el índice del jugador que posee el
turno.
También debe actualizarse la variable de instancia currentPlayer como parte de las
tareas del método.*/
    //private 
    public Player nextPlayer(){
        Random aleatorio = new Random();
        int siguiente ;
                
        if (currentPlayerIndex == -1){
            siguiente = aleatorio.nextInt(players.size());
        }
        else{
            if (currentPlayerIndex == players.size())
                siguiente = 0;
            else
                siguiente = currentPlayerIndex +1;
        }
        currentPlayerIndex = siguiente;
        currentPlayer = players.get(siguiente);
        return currentPlayer;
    }
  
    /*
    
    

    public CombatResult combat() {
        
    }
   
    public  void discardVisibleTreasure(Treasure t ){
        
    }   
    
    public  void discardHiddenTreasure(Treasure t ){
        
    }
    
//    Operación en la que el jugador pasa tesoros ocultos a visibles, siempre que pueda hacerlo
//    según las reglas del juego, para ello llama al método, para ello desde Player se ejecuta el
//    método: canMakeTreasureVisible(t:Treasure ):boolean
    public  boolean makeTreasureVisible(Treasure t){
        
    }
    
    public  boolean buyLevels(Treasure [] visible, Treasure [] hidden){
        
    }
    
    public void initGame(String [] players) {
    
    }
    */
    
    //Devuelve el jugador que posee el turno (currentPlayer)
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    //Devuelve el monstruo en juego (currentMonster)
    public Monster getCurrentMonster(){
        return currentMonster;
    }
    
/*
    public boolean canMakeTreasureVisible(Treasure t){

    }
    
    public ArrayList<Treasure> getVisibleTreasures(){
        
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        
    }
   
    public boolean nextTurn(){

    }
    */
    
   /*Método que comprueba si el jugador activo (currentPlayer) cumple con las reglas del
juego para poder terminar su turno. Devuelve false si el jugador activo no puede pasar de
turno y true en caso contrario. Para ello usa el método de Player: validState()*/
    public boolean nextTurnAllowed(){
        if(currentPlayer.validState() == true)
            return true;
        else
            return false;
    }
    
    /*Devuelve true si result tiene el valor WINANDWINGAME del enumerado CombatResult, en
caso contrario devuelve false.*/
    public boolean endOfGame(CombatResult result){
        if(CombatResult.WINANDWINGAME == result)
            return true;
        else
            return false;
    }
    
}
