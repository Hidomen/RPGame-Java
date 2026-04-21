package rpgame;
//import rpgame.PlayerClass.*;
import java.util.ArrayList;

            
enum GUIState {MAIN_SCREEN, PLAY, PLAYER_SELECTION, START_GAME, LOBBY, COMBAT, SHOP, GAME_OVER, EXIT};

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
    private static MainScreenGUI    mainScreenGUI;
    private static GameOverGUI      gameOverGUI;
    private static PlayerSelectGUI  playerSelectGUI;
    private static CombatGUI        combatGUI;
    private static ShopGUI          shopGUI;
    private static LobbyGUI         lobbyGUI;

    private static GUIState state;
    
    public static void main(){    
        main m = new main();
        
        players = new ArrayList<PlayerClass>();
        
        difficulty = 1;
        maxEnemySize = 5; 
        playerCount = 2; //modifyable

        
        
        mainScreenGUI = new MainScreenGUI(m);
        mainScreenGUI.setVisible(true);
        
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
            
            case GUIState.PLAY -> { 
                
                
                //deciding player count
                //if its decided in main screen delete this
                
            }
            
            case GUIState.START_GAME -> { //changed things on replay?


            }
            case GUIState.COMBAT -> {
                
                difficulty++;
                initCombat();
                if(null == combatGUI){
                    combatGUI = new CombatGUI(m, players, enemy);
                }
                
                combatGUI.setVisible(true);
            }
            case GUIState.LOBBY -> {
                
                if(null == lobbyGUI){
                    lobbyGUI = new LobbyGUI(m);
                }
                
                
                lobbyGUI.setVisible(true);
            }
            case GUIState.PLAYER_SELECTION -> {
                
                if(null == playerSelectGUI){
                    playerSelectGUI = new PlayerSelectGUI(m, playerCount);
                }
                
                playerSelectGUI.setVisible(true);
            }
            case GUIState.SHOP -> {
                
                if(null == shopGUI){
                    shopGUI = new ShopGUI(m, group);
                }
                
                shopGUI.setVisible(true);
            }
            case GUIState.GAME_OVER -> {
                System.out.println("YOU ARE DEAD BUDDY.");
            }
            
            case GUIState.EXIT -> {
                
                System.out.println("Exitting game");
            }
        }
    }
    
    
    @Override
    public void addPlayer(PlayerClass player){

        
        if(playerCount <= players.size()){
            System.err.println("PLAYERS ARE FULL");
            return;
        }
        
        
        
        System.out.println("Player added");
        players.add(player);
        
        System.out.println(players.getLast().getEntityName());
    }
    
    @Override
    public void gameOver(){
        System.out.println("game over :(. Lasted 'till " + difficulty + ". Difficulty");
    }
    
    @Override
    public void setPlayerCount(int playerCount){
        this.playerCount = playerCount;
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
