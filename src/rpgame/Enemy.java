package rpgame;

import java.util.ArrayList;

public class Enemy extends Entity {
    
    private static final int CONST = 1;
        
    Enemy(int powerLevel, int playerCount){
        
        
        maxHP           = powerLevel * playerCount * CONST * Config.health;
        attackPower     = powerLevel * playerCount * CONST * Config.attack;
        abilityPower    = powerLevel * playerCount * CONST * Config.ability;
        mana            = powerLevel * playerCount * CONST * Config.mana;
        
        HP = maxHP;
    }
    
    //different behaviours: only attack, attack and heal etc.
    //randomly attack to one player
    public void turn(ArrayList<PlayerClass> players, int currentPlayerIndex){
        
        System.out.println("Enemy hp after status check : " + HP); //debug
        
        attack(players.get(currentPlayerIndex));
    }

    @Override
    public void ability0(Entity target){
        System.err.println("Enemy does not have ability0");
    }
    
    @Override
    public void ability1(Entity target){
        System.err.println("Enemy does not have ability1");
    }

    @Override
    public void ability2(Entity target){
        System.err.println("Enemy does not have ability2");
    }
    
    @Override
    public void ability3(Entity target){
        System.err.println("Enemy does not have ability3");
    }
    
    @Override
    public void ability4(Entity target){
        System.err.println("Enemy does not have ability4");
    }
    
    @Override
    public void ability5(Entity target){
        System.err.println("Enemy does not have ability5");
    }
    
}
