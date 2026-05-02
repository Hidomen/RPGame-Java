package rpgame;

import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;

public class main implements GUICallback{
        
    private static ArrayList<PlayerClass> players;
    private Enemy enemy;
    
    private static int difficulty;
    private static int playerCount;
    private Group group;
    //==========================================================================
    // GUIs
    //==========================================================================
    private static javax.swing.JFrame currentWindow;
    
    private static MainScreenGUI    mainScreenGUI;
    private static PlayerSelectGUI  playerSelectGUI;
    private static LobbyGUI         lobbyGUI;
    private static CombatGUI        combatGUI;
    private static ShopGUI          shopGUI;
    private static InventoryGUI     invGUI;
    private static GameOverGUI      gameOverGUI;

    private static GUIState state;
    //==========================================================================
    
    public static void main(){    
        
        players = new ArrayList<PlayerClass>();
        
        main m = new main();
        
        
        
        mainScreenGUI = new MainScreenGUI(m);
        
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        mainScreenGUI.setLocation(  (int)(screenSize.width/2 -  Config.WINDOW_DIMENSION.width/2),
                                    (int)(screenSize.height/2 - Config.WINDOW_DIMENSION.height/2));
        
        currentWindow = mainScreenGUI;
        mainScreenGUI.setVisible(true);
    }
    //==========================================================================
    //  GUI Callbacks
    //==========================================================================
    public void setGUIState(GUIState state, Point location){
        this.state = state;
        
        currentWindow.setVisible(false);
        
        switch(state){
            case GUIState.MAIN_SCREEN -> {
                players = new ArrayList<>();
                
                mainScreenGUI = new MainScreenGUI(this);
                
                currentWindow = mainScreenGUI;
            }
            
            case GUIState.PLAYER_SELECTION -> {
                
                playerSelectGUI = new PlayerSelectGUI(this, playerCount);
                
                currentWindow = playerSelectGUI;
            }
            
            case GUIState.START_GAME -> {
                
                difficulty = 0;

                group = new Group(players);

                
                
                if(shopGUI != null){
                    System.out.println("RESET SHOP");
                    shopGUI.resetShop();
                }
                
                setGUIState(GUIState.LOBBY, location);
            }
            
            case GUIState.LOBBY -> {
                
                if(null == lobbyGUI){
                    lobbyGUI = new LobbyGUI(this , players);
                }
                
                currentWindow = lobbyGUI;
            }
            
            case GUIState.COMBAT -> {
                
                difficulty++;
                initEnemy();
                
                refreshPlayers();

                combatGUI = new CombatGUI(this, players, enemy);
                
                currentWindow = combatGUI;
            }
            
            case GUIState.SHOP -> {
                
                if(null == shopGUI){ //WHY WAS İT COMMENTED PREVİOUSLY ? IF İT İS NOT HERE THEN EVERYTİME SHOP RENEW ITSELF WE DONT WANT THAT. 
                shopGUI = new ShopGUI(this, group);
                }
                
                currentWindow = shopGUI;
            }
            
            case GUIState.INVENTORY -> {
                
                if(null == invGUI) {
                    invGUI = new InventoryGUI(this, group);
                }
                
                currentWindow = invGUI;
            }
            
            case GUIState.GAME_OVER -> {
                rebirthPlayers();
                gameOverGUI = new GameOverGUI(this, difficulty);
                group = new Group(players);
                invGUI = null;
                shopGUI = null;
                lobbyGUI = null;
                currentWindow = gameOverGUI;
            }
            
            case GUIState.EXIT -> {
                System.exit(0);
            }
        }
        
        currentWindow.setVisible(true);
        currentWindow.setLocation(location);
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
    public void setPlayerCount(int playerCount){
        this.playerCount = playerCount;
    }
    
    @Override
    public void combatWin(){
        group.setMoney(group.getMoney() + 50);
        group.gainXP(difficulty * 10);
    }
    
    public void rebirthPlayers()
    {
        String name;
        PlayerClass freshPlayer;
        for (int i = 0; i < players.size(); i++) {
            name = players.get(i).getEntityName();
            switch(players.get(i).className)
            {
                case Archer -> 
                {
                    freshPlayer = new Archer();
                    freshPlayer.setEntityName(name);
                    players.remove(i);
                    players.add(i, freshPlayer);
                    break;
                }
                case Warrior ->
                {
                    freshPlayer = new Warrior();
                    freshPlayer.setEntityName(name);
                    players.remove(i);
                    players.add(i, freshPlayer);            
                    break;
                }
                case Mage ->
                {
                    freshPlayer = new Mage();
                    freshPlayer.setEntityName(name);
                    players.remove(i);
                    players.add(i, freshPlayer);             
                    break;
                }
                case Healer ->
                {
                    freshPlayer = new Healer();
                    freshPlayer.setEntityName(name);
                    players.remove(i);
                    players.add(i, freshPlayer);        
                    break;
                }
            }
        }
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
