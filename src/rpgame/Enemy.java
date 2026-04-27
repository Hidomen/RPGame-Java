package rpgame;

import java.util.ArrayList;

public class Enemy extends Entity {
    
    private static final int CONST = 2;
        
    Enemy(int powerLevel, int playerCount){
        
        
        maxHP           = powerLevel * playerCount * CONST * Config.HEALTH_MULTIPLIER;
        attackPower     = powerLevel * playerCount * CONST * Config.ATTACK_MULTIPLIER;
        
        HP = maxHP;
    }
    
    public void turn(ArrayList<PlayerClass> players, int currentPlayerIndex){
        
        attack(players.get(currentPlayerIndex));
    }
}
