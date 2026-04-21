package rpgame;
//import rpgame.PlayerClass.*;
import java.util.ArrayList;


enum GUIState {PLAYER_SELECTION, START_GAME, LOBBY, COMBAT, SHOP, GAME_OVER};

public class main implements GUICallback{
        
    private static ArrayList<PlayerClass> players;
    private Enemy enemy;
    
    private static int maxEnemySize;
    private static int playerCount;
    
    private PlayerClass selectedClass;
    
    private static int difficulty;
    
    private Group group;
    
    //==========================================================================
    // GUIs
    //==========================================================================
    private static PlayerSelectGUI playerSelectGUI;
    private static CombatGUI combatGUI;
    private static ShopGUI shopGUI;
    //private static LobbyGUI lobbyGUI;

    private static GUIState state;
    
    public static void main(){    
        main m = new main();
        
        players = new ArrayList<PlayerClass>();
        
        difficulty = 1;
        maxEnemySize = 5; 
        playerCount = 1; //modifyable

        playerSelectGUI = new PlayerSelectGUI(m,playerCount);
        playerSelectGUI.setVisible(true);
        
        
    }
    //==========================================================================
    //  GUI Callbacks
    //==========================================================================
    public void setGUIState(GUIState state){
        main m = new main();
        
        this.state = state;
        
        if(shopGUI != null){
            shopGUI.setVisible(false);

        }
        if(combatGUI != null){
            combatGUI.setVisible(false);
        }
        if(playerSelectGUI != null){
            playerSelectGUI.setVisible(false);

        }
        
        switch(state){
            case GUIState.START_GAME -> {
                
                initGroup();
                shopGUI = new ShopGUI(m, group);
            }
            case GUIState.COMBAT -> {
                
                
                initCombat();
                
                combatGUI.setVisible(true);
            }
            case GUIState.LOBBY -> {
                
                difficulty++;
                System.out.println("LOBBY");
                //lobbyGUI.setVisible(true);
            }
            case GUIState.PLAYER_SELECTION -> {
                
                playerSelectGUI.setVisible(true);
            }
            case GUIState.SHOP -> {
                
                shopGUI.setVisible(true);
            }
            case GUIState.GAME_OVER -> {
                System.out.println("YOU ARE DEAD BUDDY.");
            }
        }
    }
    
    
    @Override
    public void addPlayer(PlayerClass player){

        
        if(playerCount <= players.size()){
            System.err.println("PLAYERS ARE FULL");
            return;
        }
        
        
        player.setEntityName("PLAYER1"); //fix
        
        System.out.println("Player added");
        players.add(player);
        
        System.out.println(players.getLast().getEntityName());
    }
    
    @Override
    public void gameOver(){
        System.out.println("game over :(. Lasted 'till " + difficulty + ". Difficulty");
    }
    //==========================================================================
    //  Combat Functions
    //==========================================================================
    public void initEnemy(){
        
        enemy = new Enemy(difficulty, players.size());        
    }
    
    public void initCombat(){
        main m = new main();
        
        initEnemy();
        combatGUI = new CombatGUI(m, players, enemy);
    }
    
    public void initGroup(){
        
        ArrayList<Classes> c = new ArrayList<Classes>();
        
        for(PlayerClass p : players){
            c.add(p.className);
        }
        
        group = new Group(100, c);
    }

}
