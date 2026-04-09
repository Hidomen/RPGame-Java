package rpgame;



public class Enemy extends Entity {
    
    
    Enemy(int powerLevel){
        
        int constant = 3;
        
        maxHP           = powerLevel * constant * Config.health;
        HP = maxHP;
        
        attackPower     = powerLevel * constant * Config.attack;
        abilityPower    = powerLevel * constant * Config.ability;
        mana            = powerLevel * constant * Config.mana;
    }
    
    
    public void turn(PlayerClass p){
        //different behaviours: only attack, attack and heal etc.
        
        System.out.println("ENEMY ATTACKED THE PLAYER, gives " + attackPower + " damage.");
        attack(p);
    }
    
    
    public void scream(){
        
    }
    
    public void ability0(){
        
    }

    public void ability1(){
        
    }

    public void ability2(){
        
    }
}
