package rpgame;



public class Combat {
    
    private EntityType turn;
    private boolean stunned = false;
    
    private PlayerClass[] players;
    private Enemy[] enemies;
    
    
    Combat(PlayerClass[] players, Enemy[] enemies){ //list of entities
        turn = EntityType.Player;
        
        this.players = players;
        this.enemies = enemies;
    }

    
    public EntityType getTurn(){
        return turn;
    }
    
    public void nextTurn(){
        
        turn = EntityType.values()[(turn.ordinal() + 1) % 2];
    }

    
    public void playerTurn(int playerIndex){
        System.out.println("PLAYER TURN");
                
        players[playerIndex].checkStatus();
        //p.turn(e);
        players[playerIndex].endTurnEffects();
                
        nextTurn();
    }
    
    public void enemyTurn(int enemyIndex){
        System.out.println("ENEMY TURN");
                
        enemies[enemyIndex].checkStatus();
        enemies[enemyIndex].turn(players[0]); 
        enemies[enemyIndex].endTurnEffects();
                
    }
}
