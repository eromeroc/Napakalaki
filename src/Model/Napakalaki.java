package Model;

import java.util.ArrayList;
import Model.Player;
import Model.Monster;
import Model.CardDealer;
import java.util.Random;



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
    
    /**
     * Inicializa el array de jugadores que contiene Napakalaki, creando tantos jugadores como
     * elementos haya en names, que es el array de String que contiene el nombre de los
     * jugadores
     */
    private void initPlayers(ArrayList<String> names){
        for (int i = 0 ; i < names.size(); i++){
            Player jugador = new Player(names.get(i));
            players.add(jugador);
        }
        currentPlayer = players.get(0);
    }
    
    /**
     * Decide qué jugador es el siguiente en jugar. 
     *      Si es el primer turno
     *          Se calculará la posición del primer jugador utilizando un número aleatorio.
     *      Si no  
     *          Pasa al siguiente jugador, o al primero en caso de que haya acabado una ronda
     *  Se actualiza currentPlayerIndex y currentPlayer
     */ 
    private Player nextPlayer(){
        int siguiente ;
                
        if (currentPlayerIndex == -1){
            siguiente = Dice.getInstance().nextNumber() % players.size();
        }
        else{
            if (currentPlayerIndex == players.size()-1)
                siguiente = 0;
            else
                siguiente = currentPlayerIndex +1;
        }
        currentPlayerIndex = siguiente;
        currentPlayer = players.get(currentPlayerIndex);
        return currentPlayer;
    }   
    
    
    /**
     * Llama al metodo combat de la clase Player para llevar a cabo el combate
     */
    public CombatResult combat() {
        CombatResult combat;
        combat = currentPlayer.combat(currentMonster);
        
        return combat;
    }
    
   
    /**
     * Operación encargada de eliminar los tesoros visibles indicados de la lista de tesoros
     * visibles del jugador. Al eliminar esos tesoros, si el jugador tiene un mal rollo pendiente, se
     * indica a éste dicho descarte para su posible actualización.
     */
    public  void discardVisibleTreasure(Treasure t ){
        currentPlayer.discardVisibleTreasure(t);
    }   
    
    /**
     * Operación encargada de eliminar los tesoros ocultos indicados de la lista de tesoros
     * ocultos del jugador. Al eliminar esos tesoros, si el jugador tiene un mal rollo pendiente, se
     * indica a éste dicho descarte para su posible actualización.
     */
    public  void discardHiddenTreasure(Treasure t ){
        currentPlayer.discardHiddenTreasure(t);
    }
    
    /**
     * Operación en la que el jugador pasa tesoros ocultos a visibles, siempre que pueda hacerlo
     * según las reglas del juego, para ello llama al método de la clase Player:
     * canMakeTreasureVisible(t:Treasure ):boolean
     */
    public  boolean makeTreasureVisible(Treasure t){
        boolean makeVisible = false;
        
        if(canMakeTreasureVisible(t)){
            makeVisible = true;
            
            currentPlayer.makeTreasureVisible(t); 
            currentPlayer.discardHiddenTreasure(t);
        }
        return makeVisible;
    }
    
    /**
     * Permite comprar niveles antes de combatir con el monstruo actual.
     * Llama al método buyLevels de la clase Player
     */
    public  boolean buyLevels(ArrayList<Treasure> visible, ArrayList<Treasure> hidden){
        
        return currentPlayer.buyLevels(visible, hidden);        
    }
    
    /**
     * Se encarga de solicitar a CardDealer la inicialización de los mazos de cartas de
     * Tesoros y de Monstruos, de inicializar los jugadores proporcionándoles un nombre y de
     * iniciar el juego con la llamada a nextTurn() para pasar al siguiente turno (que en este
     * caso será el primero).    
     */
    public void initGame(ArrayList<String> players) {
        CardDealer.getInstance().initCards();
        initPlayers(players);
        nextTurn();
           
    }
    
    
    /**
     * Devuelve el jugador que posee el turno (currentPlayer)
     */
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    /**
     * Devuelve el monstruo en juego (currentMonster)
     */
    public Monster getCurrentMonster(){
        return currentMonster;
    }
    
    /**
     * Comprueba que el tesoro oculto puede hacerse visible según las reglas del juego
     * Llama al método canMakeTreasureVisible de la clase Player
     */
    public boolean canMakeTreasureVisible(Treasure t){
        return currentPlayer.canMakeTreasureVisible(t);
    }
    
    /**
     * Devuelve los tesoros visibles del jugador actual
     */ 
    public ArrayList<Treasure> getVisibleTreasures(){
        return currentPlayer.getVisibleTreasures();
    }
    
    /**
     * Devuelve los tesoros ocultos del jugador actual
     */ 
    public ArrayList<Treasure> getHiddenTreasures(){
        return currentPlayer.getHiddenTreasures();
    }
    
    
    /**
     * Usa el método nextTurnAllowed(), para verificar si currentPlayer cumple
     * con las reglas del juego para poder terminar su turno.
     *      En caso el caso que nextTurnAllowed() devuelva true, se actualiza el jugador activo
     *      al siguiente jugador y se le solicita a CardDealer el siguiente monstruo al que se
     *      enfrentará ese jugador (currentMonster).
     *      
     *      En caso de que el nuevo jugador activo esté muerto, por el combate en su anterior turno o
     *      porque es el primer turno, se inicializan sus tesoros siguiendo las reglas del juego. La
     *      inicialización de los tesoros se encuentra recogida en el diagrama subordinado initTreasures.
     */
    public boolean nextTurn(){
        
        boolean stateOK = nextTurnAllowed();
        
        if(stateOK){
            nextPlayer();
            currentMonster = CardDealer.getInstance().nextMonster();
            
            if(currentPlayer.isDead()){
                currentPlayer.initTreasures();
            }
        }
       return stateOK;
    }
    
    
   /**
    * Método que comprueba si el jugador activo (currentPlayer) cumple con las reglas del
    * juego para poder terminar su turno. Devuelve false si el jugador activo no puede pasar de
    * turno y true en caso contrario.
    * Para ello usa el método de Player: validState()
    */
    public boolean nextTurnAllowed(){
        if(currentPlayer == null)
            return true;
        if(currentPlayer.validState() == true)
            return true;
        else
            return false;
    }
    
    /**
     * Devuelve true si result tiene el valor WINANDWINGAME del enumerado CombatResult, en
     * caso contrario devuelve false.
     */
    public boolean endOfGame(CombatResult result){
        if(CombatResult.WINANDWINGAME == result)
            return true;
        else
            return false;
    }
    
}
