package rpgame;

import java.util.ArrayList;

public class Combat{
    
    private EntityType turn;
    private boolean stunned = false;
    
    private ArrayList<PlayerClass> players;
    private ArrayList<Enemy> enemies;
    
    Combat(ArrayList<PlayerClass> players, ArrayList<Enemy> enemies){
         
        this.players = players;
        this.enemies = enemies;
        
        turn = EntityType.Player;

    }

    //==========================================================================
    // Getters, Setters
    //==========================================================================
    public EntityType getTurn(){
        return turn;
    }
    
    public void setTurn(EntityType turn){
        this.turn = turn;
    }
    //==========================================================================
    //
    //==========================================================================
    public void nextTurn(){
        
        turn = EntityType.values()[(turn.ordinal() + 1) % 2];
    }
    //==========================================================================
    //
    //==========================================================================
    public void playerTurnStart(int playerIndex){
        System.out.println("PLAYER TURN");
                
        
        if(players.get(playerIndex).checkStatus()){
            System.out.println(players.get(playerIndex).getEntityName() + "IS STUNNED");
            nextTurn();  
        }
        
        // Listen Buttons
    }
    
    public void playerTurnEnd(int playerIndex){
        players.get(playerIndex).endTurnEffects();
                
        nextTurn();
    }
    
    public void enemyTurn(int enemyIndex){
        System.out.println("ENEMY TURN");
                
        if(enemies.get(enemyIndex).checkStatus()){
            System.out.println(enemies.get(enemyIndex).getEntityName() + "IS STUNNED");
            return;
        }
        enemies.get(enemyIndex).turn(players); 
        enemies.get(enemyIndex).endTurnEffects();
                
    }
}
