package rpgame;
//import rpgame.PlayerClass.*;
import java.util.ArrayList;

enum CombatState {PLAYER_TURN, ENEMY_TURN, GAME_OVER};
enum GUIState {PLAYER_SELECTION, COMBAT, SHOP, WIN};

public class main implements PlayerSelectGUICallback, CombatGUICallback{

    private static CombatState combatState;
    
    
    private static ArrayList<PlayerClass> players;
    private static ArrayList<Enemy> enemies;
    
    private static int maxEnemySize;
    private static int playerCount;
    
    private PlayerClass selectedClass;
    
    private static int difficulty;
    
    private Combat combat;
    
    
    private static PlayerSelectGUI gui;
    private static CombatGUI gui2;

    
    public static void main(){
        System.out.println("constructor");
        
        main m = new main();
        
        gui = new PlayerSelectGUI(m);
        
        
        
        gui.setVisible(true);
        
        difficulty = 1;
        maxEnemySize = 5; 
        playerCount = 2; //modifyable

        
        players = new ArrayList<PlayerClass>();
        enemies = new ArrayList<Enemy>();
    }
    
    //==========================================================================
    //  Ability Functions
    //==========================================================================
    @Override
    public void useAbility(PlayerClass player, int abilityIndex, Entity target){
        
        player.useAbility(player.getAbility(abilityIndex), target);
    }
    //==========================================================================
    //  Getters, Setters
    //==========================================================================
    @Override
    public CombatState getCombatState(){
        return combatState;
    }
    
    @Override
    public void setCombatState(CombatState combatState){
        this.combatState = combatState;
    }
    
    @Override
    public int getPlayerCount(){
        return players.size();
    }
    //==========================================================================
    //  GUI Callbacks
    //==========================================================================
    @Override
    public void combatGUI(){
        
        initEnemy(3);
        main m = new main();

        gui2 = new CombatGUI(m, players, enemies);
        
        gui.setVisible(false);
        gui2.setVisible(true);
    }
    
    @Override
    public void enemyTurn(int index){ //cbb
        
        if(combatState != CombatState.ENEMY_TURN){
            System.err.println("Combat State is not in enemy turn");
            return;
        }
        
        combat.enemyTurn(index);
        combatState = CombatState.PLAYER_TURN;
    }
    
    @Override
    public void addPlayer(PlayerClass player){

        
        if(playerCount <= players.size()){
            System.err.println("PLAYERS ARE FULL");
            return;
        }
        
        
        player.setEntityName("PLAYER1");
        
        System.out.println("Player added");
        players.add(player);
    }
    //==========================================================================
    //  Combat Functions
    //==========================================================================
    public void initEnemy(int enemySize){
        
        for(int i = 0; i < enemySize; i++){
            
            enemies.add(i, new Enemy(difficulty));
        }
    }

}
