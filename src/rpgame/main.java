package rpgame;
//import rpgame.PlayerClass.*;
import java.util.ArrayList;

            
enum GUIState {MAIN_SCREEN, PLAYER_SELECTION, START_GAME, LOBBY, COMBAT, SHOP, GAME_OVER, EXIT};

public class main implements GUICallback{
        
    private static ArrayList<PlayerClass> players;
    private Enemy enemy;
    
    
    private PlayerClass selectedClass;
    
    private static int difficulty;
    private static int playerCount;
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
        
        
        mainScreenGUI = new MainScreenGUI(m);
        mainScreenGUI.setVisible(true);
        
    }
    //==========================================================================
    //  GUI Callbacks
    //==========================================================================
    public void setGUIState(GUIState state){
        //main m = new main();
        
        this.state = state;
        
        
        if(mainScreenGUI != null){
            mainScreenGUI.setVisible(false);
        }
        if(lobbyGUI != null){
            lobbyGUI.setVisible(false);
        }
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
            case GUIState.PLAYER_SELECTION -> {
                
                if(null == playerSelectGUI){
                    playerSelectGUI = new PlayerSelectGUI(this, playerCount);
                }
                
                playerSelectGUI.setVisible(true);
            }
            case GUIState.START_GAME -> {
                
                initGroup();
                difficulty = 0;
                setGUIState(GUIState.LOBBY);

            }
            case GUIState.LOBBY -> {
                initGroup();
                if(null == lobbyGUI){
                    lobbyGUI = new LobbyGUI(this , players);
                }
                
                
                lobbyGUI.setVisible(true);
            }
            case GUIState.COMBAT -> {
                
                difficulty++;
                initEnemy();
                
                restoreHealth();
                combatGUI = new CombatGUI(this, players, enemy);
                
                combatGUI.setVisible(true);
            }
            case GUIState.SHOP -> {
                
                if(null == shopGUI){
                    initGroup();
                    shopGUI = new ShopGUI(this, group);
                }
                
                shopGUI.setVisible(true);
            }
            case GUIState.GAME_OVER -> {
                
                
                gameOverGUI = new GameOverGUI(this, difficulty);
                gameOverGUI.setVisible(true);
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
    
    @Override
    public void combatWin(){
        group.setMoney(group.getMoney() + 100);
        group.gainXP(difficulty * 75);
    }
    //==========================================================================
    //  Combat Functions
    //==========================================================================
    public void initEnemy(){
        
        enemy = new Enemy(difficulty, players.size());        
    }

    public void initGroup(){
        
        System.out.println("initted group");
        
        if(group != null){
            System.err.println("there is a group");
            return;
        }
        
        ArrayList<Classes> c = new ArrayList<Classes>();
        
        for(PlayerClass p : players){
            c.add(p.className);
        }
        
        group = new Group(c);
    }
    
    public void restoreHealth(){
        
        for(PlayerClass p : players){
            p.HP = p.maxHP;
        }
    }

}
