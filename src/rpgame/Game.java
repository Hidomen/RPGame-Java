package rpgame;

//import java.util.Vector;

enum GameState {PLAYER_TURN, ENEMY_TURN, ANIMATING, GAME_OVER, WIN /*shop, inventory tab etc.*/};

public class Game {
    
    GameState state;
    
    private PlayerClass[] players;
    //private Vector<PlayerClass> players;
    private int playerCount;
    
    private PlayerClass selectedClass;
    
    //Vector<Enemy> enemies;
    private Enemy[] enemies;
    private int maxEnemySize;
    
    private int difficulty;
    //entityList
    
    private Combat combat;
    
    public Game(int playerCount){
        
        if(playerCount <= 0){
            System.err.println("YOU CANNOT INITIALIZE GAME WITH 0 OR LESS PLAYERS");
            return;
        }
        
        difficulty = 1;
        
        
        
        this.playerCount = playerCount;
        
        players = new PlayerClass[playerCount];
        //players = new Vector<>();
        
        //cbb
        maxEnemySize = 5; 
        enemies = new Enemy[maxEnemySize];
        
        state = GameState.PLAYER_TURN;
    }
    
    public GameState getState(){
        return state;
    }
    
    public void changeState(GameState state){
        this.state = state;
    }
    
    
    public void enemyTurn(){ //cbb
        combat.enemyTurn(0);
        state = GameState.PLAYER_TURN;
    }
    
    public int getPlayerCount(){
        //return players.size();
        return 1; //debug
    }
    
    public PlayerClass getPlayer(int index){
        return players[index];
    }
    
    public Enemy getEnemy(int index){
        return enemies[index];
    }

    public void selectClass(Classes pClass){ //one by one
        
        switch(pClass){
            case Classes.Archer ->  {selectedClass = new Archer();}
            case Classes.Healer ->  {selectedClass = new Healer();}
            case Classes.Mage ->    {selectedClass = new Mage();}
            case Classes.Warrior -> {selectedClass = new Warrior();}
        }
    }
    
    public void confirmClassSelection(){
        if(selectedClass == null){
            System.err.println("THERE IS NO SELECTED CLASS");
            return;
        }
        
        //if(playerCount <= players.size()){
        //    System.err.println("PLAYERS ARE FULL");
        //    return;
        //}
            
        System.out.println("Player added");
        //players.add(selectedClass);
        players[0] = selectedClass;
        //selectedClass = null;
    }

    /*
    public void initClass(Classes[] classes){ //all at once
        
        
        if(classes.length != playerCount){
            System.err.println("CLASS ARRAY SIZE IS NOT EQUAL TO PLAYER SIZE");
            return;
        }
        

        for(int i = 0; i < playerCount; i++){          
            
            switch(classes[i]){
                case Classes.Mage ->{players[i] = new Mage();}
                case Classes.Archer -> {players[i] = new Archer();}
                case Classes.Healer -> {players[i] = new Healer();}
                case Classes.Warrior -> {players[i] = new Warrior();}
            }
        }
    }
    */
    
    public void initEnemy(int enemySize){
        
        int i;
        
        for(i = 0; i < enemySize; i++){
            
            enemies[i] = new Enemy(difficulty);
        }
        
        for(; i < maxEnemySize; i++){
            enemies[i] = null;
        }
        
    }
    
    
    public void initCombat(int enemySize){
        
        initEnemy(enemySize);
        
        combat = new Combat(players, enemies);
        
    }
    
    public void combatTurn(){
        
        EntityType turn = combat.getTurn();
        
        
        
        if(EntityType.Player == turn){
            combat.playerTurn(0);
        }
        if(EntityType.Enemy == turn){
            combat.enemyTurn(0);
        }
        
        
        
    }

}