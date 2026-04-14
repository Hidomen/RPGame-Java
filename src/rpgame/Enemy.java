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
        
        System.out.println("Checking Status"); //debug
        
        if(checkStatus()){
            System.out.println("Enemy hp after status check : " + HP); //debug
            return;
        }
        
        System.out.println("ENEMY ATTACKED THE PLAYER, gives " + attackPower + " damage.");
        attack(p);
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
