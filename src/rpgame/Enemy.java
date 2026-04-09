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
    
    
    public void scream(){
        
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
