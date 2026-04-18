package rpgame;
//import rpgame.PlayerClass.*;
import java.util.ArrayList;


enum GUIState {PLAYER_SELECTION, COMBAT, SHOP, WIN};

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
    @Override
    public void playerSelectGUIEnded(){
        main m = new main();
        
        shopGUI = new ShopGUI(m, group);
        
        initCombat();
        
        playerSelectGUI.setVisible(false);
        combatGUI.setVisible(true);
    }
    
    @Override
    public void combatGUIEnded(){
        System.out.println("combat is over");
        
        difficulty++;
        
        shopGUI.setVisible(true);
        combatGUI.setVisible(false);

    }
    
    @Override
    public void shopGUIEnded(){
        
        initCombat();
        
        combatGUI.setVisible(true);
        shopGUI.setVisible(false);
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
