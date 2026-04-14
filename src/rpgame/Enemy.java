package rpgame;



public class Enemy extends Entity {
    
    private static final int constantMultiplier = 3;
        
    Enemy(int powerLevel){
        
        
        maxHP           = powerLevel * constantMultiplier * Config.health;
        attackPower     = powerLevel * constantMultiplier * Config.attack;
        abilityPower    = powerLevel * constantMultiplier * Config.ability;
        mana            = powerLevel * constantMultiplier * Config.mana;
        
        HP = maxHP;
    }
    
    
    public void turn(PlayerClass p){
        //different behaviours: only attack, attack and heal etc.
        
        
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            
        }

        
        System.out.println("Checking Status"); //debug
        
        boolean isStunned = checkStatus();
        System.out.println("Enemy hp after status check : " + HP); //debug
        
     
        if(!isStunned) {attack(p); }
        
    }

    
    public void ability0(Entity target){
        
    }

    public void ability1(Entity target){
        
    }

    public void ability2(Entity target){
        
    }
    
    public void ability3(Entity target){

    }
    
    public void ability4(Entity target){

    }
    
    public void ability5(Entity target){

    }
    
}
