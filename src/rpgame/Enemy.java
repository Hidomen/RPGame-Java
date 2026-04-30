package rpgame;


public class Enemy extends Entity {
    
    private static final int CONST = 2;
        
    Enemy(int powerLevel, int playerCount){
        
        
        maxHP           = powerLevel * playerCount * CONST * Config.HEALTH_MULTIPLIER;
        attackPower     = powerLevel * playerCount * CONST * Config.ATTACK_MULTIPLIER;
        
        HP = maxHP;
    }
    
}
