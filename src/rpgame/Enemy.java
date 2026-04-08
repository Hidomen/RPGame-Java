package rpgame;



public class Enemy extends Entity {
    
    
    Enemy(int powerLevel){
        
        maxHP = powerLevel * 10 * mult.health;
        HP = maxHP;
        
        attackPower = powerLevel * 10 * mult.attack;
        abilityPower = powerLevel * 10 * mult.ability;
        mana = powerLevel * 10 * mult.mana;
    }
    
    
    public void turn(){
        //different behaviours: only attack, attack and heal etc.
    }
}
