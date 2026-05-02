package rpgame;

import java.util.Random;

public abstract class Entity {
    
    private String entityName;
        
    protected int HP;
    protected int maxHP;
    
    
    protected int attackPower;
    
    protected int [] statusList = {0,0,0,0,0,0,0,0};
    
    
    public Entity(){

    }
    //==========================================================================
    // Getters, Setters
    //==========================================================================
    public String getEntityName(){
        return entityName;
    }
    
    public void setEntityName(String entityName){
        this.entityName = entityName;
    }

    //==========================================================================
    // Combat functions
    //==========================================================================
    public void attack(Entity target){

        int damage = attackPower;
        
        if(statusList[Config.FOG_INDEX] > 0){ // %50 chance to attack urself instead
            Random rand = new Random();
            
            if(rand.nextBoolean()){
                System.out.println("AAAAHH!! I HIT MYSELF"); //visual?
                takeDamage(attackPower);
                return;
            }
        }
        if(statusList[Config.SHOCK_INDEX] > 0){
            damage /= 2; //round
        }
        
        double targetTempHealth = target.statusList[Config.TEMP_H_INDEX];
        if(targetTempHealth > 0){
            damage -= targetTempHealth;
            target.statusList[Config.TEMP_H_INDEX] = 0;
        }
        
        if (target.statusList[Config.DODGE_INDEX] > 0) { //needs to be changed
            
            Random rand = new Random();
            double chance = rand.nextDouble();
            
            if (target.statusList[Config.DODGE_INDEX] >= chance) {
                
                System.out.println("The attack got dodged !.");
                if (target.statusList[Config.DODGE_INDEX] >= 1) {
                    target.statusList[Config.DODGE_INDEX] -= 1;
                }
                return;
            }
        }
        
        
        if (target.statusList[Config.DODGE_INDEX] >= 1) {
            target.statusList[Config.DODGE_INDEX] -= 1;
        }    
        
        
        
        giveDamage(damage,target);
    }
    
    
    public boolean isDead(){
        return (HP <= 0);
    }
    
    
    public void takeDamage(int damage){
        
        if(damage <= 0) return;
        
        HP -= damage;
    }
    
    
    public void heal(int amount, Entity target){
        
        if(amount <= 0) return;
        
        target.HP += amount;

        if(target.HP > target.maxHP) {target.HP = target.maxHP;}
    }

    
    public void giveDamage(int damage, Entity target)
    {
        if(damage <= 0) return;
        
        target.takeDamage(damage);
    }
    //==========================================================================
    // Status functions
    //==========================================================================
    public void addStatus(Status status, int forTurns, Entity target)
    {
        switch(status)
        {
            case Bleed ->           {target.statusList[Config.BLEED_INDEX]     += forTurns;}
            case Burn ->            {target.statusList[Config.BURN_INDEX]      += forTurns;}
            case Dodge ->           {target.statusList[Config.DODGE_INDEX]     += forTurns;}
            case Fog ->             {target.statusList[Config.FOG_INDEX]       += forTurns;}
            case Poison ->          {target.statusList[Config.POISON_INDEX]    += forTurns;}
            case Shock ->           {target.statusList[Config.SHOCK_INDEX]     += forTurns;}
            case Stun ->            {target.statusList[Config.STUN_INDEX]      += forTurns;}
            case TemporaryHealth -> {target.statusList[Config.TEMP_H_INDEX]    += forTurns;}
        }
    }
    
    
    //called in start of turn
    //returns true if stunned
    public boolean checkStatus()
    {
        for (int i = 0; i < statusList.length; i++) {
            
            if (statusList[i] != 0) {
                
                switch(i)
                {
                    case Config.BLEED_INDEX -> {this.takeDamage(statusList[i]);}
                    case Config.BURN_INDEX -> {this.takeDamage(statusList[i]);}
                    case Config.DODGE_INDEX -> {}
                    case Config.FOG_INDEX -> {}
                    case Config.POISON_INDEX -> {this.takeDamage(2);}
                    case Config.SHOCK_INDEX -> {}
                    case Config.STUN_INDEX -> {return true;}
                    case Config.TEMP_H_INDEX -> {statusList[i] = 0;}

                }
                
            }
        }
        return false;
    }
    //==========================================================================
    //
    //==========================================================================
    public void endTurnEffects(){
        
        //update status
        for(int i = 0; i < statusList.length; i++){
            
            switch(i){
                
                //special conditons
                case Config.BLEED_INDEX -> {}
                case Config.BURN_INDEX -> {statusList[i] = 0;}
                case Config.FOG_INDEX -> {}
                case Config.DODGE_INDEX -> {}
                case Config.POISON_INDEX -> {}
                case Config.SHOCK_INDEX -> {}
                case Config.STUN_INDEX -> {}
                case Config.TEMP_H_INDEX -> {}
                
            }
            
            if(statusList[i] > 0 && i != Config.DODGE_INDEX && i != Config.TEMP_H_INDEX){
                statusList[i]--;
            }
        }
        
    }
}