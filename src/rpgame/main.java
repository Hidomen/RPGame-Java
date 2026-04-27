package rpgame;

import java.util.ArrayList;

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
    private static InventoryGUI     invGUI;

    private static GUIState state;
    
    public static void main(){    
        
        players = new ArrayList<PlayerClass>();
        
        main m = new main();
        
        mainScreenGUI = new MainScreenGUI(m);
        mainScreenGUI.setVisible(true);
    }
    //==========================================================================
    //  GUI Callbacks
    //==========================================================================
    public void setVisibility(){
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
        if (invGUI != null) {
            invGUI.setVisible(false);
        }
    }
    
    public void setGUIState(GUIState state){
        this.state = state;
        
        setVisibility();
        
        
        switch(state){
            case GUIState.MAIN_SCREEN -> {
                
                mainScreenGUI = new MainScreenGUI(this);
                mainScreenGUI.setVisible(true);
            }
            case GUIState.PLAYER_SELECTION -> {
                
                playerSelectGUI = new PlayerSelectGUI(this, playerCount);
                playerSelectGUI.setVisible(true);
            }
            case GUIState.START_GAME -> {
                
                difficulty = 0;
                
                group = new Group(players);
                
                setGUIState(GUIState.LOBBY);

            }
            case GUIState.LOBBY -> {
                
                if(null == lobbyGUI){
                    lobbyGUI = new LobbyGUI(this , players);
                }
                
                lobbyGUI.setVisible(true);
            }
            case GUIState.COMBAT -> {
                
                difficulty++;
                initEnemy();
                
                refreshPlayers();
                
                combatGUI = new CombatGUI(this, players, enemy);
                combatGUI.setVisible(true);
            }
            case GUIState.SHOP -> {
                
                if(null == shopGUI){
                    shopGUI = new ShopGUI(this, group);
                }
                
                shopGUI.setVisible(true);
            }
            case GUIState.INVENTORY -> {
                
                if(null == invGUI) {
                    invGUI = new InventoryGUI(this, group);
                }
                
                invGUI.setVisible(true);
            }
            case GUIState.GAME_OVER -> {
                
                if(null == gameOverGUI){
                    gameOverGUI = new GameOverGUI(this, difficulty);
                }
                
                gameOverGUI.setVisible(true);
            }
            case GUIState.EXIT -> {
                System.exit(0);
            }
        }
    }
    
    
    @Override
    public void addPlayer(PlayerClass player){

        if(playerCount <= players.size()){
            System.err.println("PLAYERS ARE FULL");
            return;
        }
        
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
    
    public void refreshPlayers(){
        
        
        
        for(PlayerClass p : players){
            p.HP = p.maxHP;
            p.mana = p.maxMana;
        }
    }

}
