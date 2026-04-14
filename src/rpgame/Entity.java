package rpgame;

import java.util.Random;

public abstract class Entity implements EntityFeatures {
    
    protected String className;
        
    protected double HP;
    protected double maxHP;
    
    protected int mana;
    protected double attackPower;
    protected double abilityPower;
    
    protected AbilityManager abilityManager;
    
    
    
    protected int [] statusList = {0,0,0,0,0,0,0};
    
    public static final int BLEED_INDEX     = 0; //At the start of the enemy's turn take damage equal to bleed. Then decrease bleed by one. (Working)
    public static final int BURN_INDEX      = 1; //Take damage equal to burn at the start of your turn.                                     (Working)
    public static final int FOG_INDEX       = 2; //Enemy strikes half of the damage to itself with the chance of %50                        (Working)
    public static final int POISON_INDEX    = 3; //Make your enemy take 2 damage for turns equal to your ability power                      (Working)
    public static final int SHOCK_INDEX     = 4; //Deal half damage                                                                         (Working)
    public static final int STUN_INDEX      = 5; //Pass turn                                                                                (Working)
    public static final int TEMP_H_INDEX    = 6; //TemporaryHealth : Lasts until enemy's turn end                                           (Working)
    
    
    public Ability getAbility(int index){
        return abilityManager.getAbility(index);
    }

    public void useAbility(Ability a , Entity target){
        
        //System.out.println(a.name);
        
        if(mana < a.cost){
            System.out.println("Your mana is not enough for the " + a.name);
            return;
        }

        mana -= a.cost;
        
        
        switch(a.ID){
            case 0 -> ability0(target);
            case 1 -> ability1(target);
            case 2 -> ability2(target);
            case 3 -> ability3(target);
            case 4 -> ability4(target);
            case 5 -> ability5(target);
        }
    }
    
    public void attack(Entity target){
        
        Random rand = new Random();
        
        double damage = attackPower;
        
        if(statusList[FOG_INDEX] > 0){ // %50 chance to attack urself instead
            
            if(rand.nextBoolean()){
                System.out.println("AAAAHH!! I HIT MYSELF");
                takeDamage(attackPower);
                return;
            }
            
        }
        
        if(statusList[SHOCK_INDEX] > 0){
            damage /= 2;
        }
        
        int targetTempHealth = target.statusList[TEMP_H_INDEX];
        if(targetTempHealth > 0){
            
            //target.statusList[TEMP_H_INDEX] -= damage; //if its gonna reset after one turn doesn't necessary
            damage -= targetTempHealth;
        }
        
        
        target.takeDamage(damage);
    }
    
    
    
    private void die(){
        System.out.println(className + "IS DIED");
    }
    
    public void takeDamage(double damage){
        
        if(damage <= 0) return;
        
        HP -= damage;
        
        if(HP <= 0){
            die();
        }
    }
    
    public void heal(int heal){
        
        if(heal <= 0) return;

        HP += heal;

        if(HP > maxHP) {HP = maxHP;}
    }
    
    //need this? - almost same as attack function. One of them should to go
    public void activateAbility(double damage, Entity target)
    {
        target.takeDamage((int)damage); //Maybe floor cast
    }

    public void addStatus(Status status, int forTurns, Entity target)
    {
            switch(status)
            {
                case Bleed ->           {target.statusList[BLEED_INDEX]     += forTurns;}
                case Burn ->            {target.statusList[BURN_INDEX]      += forTurns;}
                case Fog ->             {target.statusList[FOG_INDEX]       += forTurns;}
                case Poison ->          {target.statusList[POISON_INDEX]    += forTurns;}
                case Shock ->           {target.statusList[SHOCK_INDEX]     += forTurns;}
                case Stun ->            {target.statusList[STUN_INDEX]      += forTurns;}
                case TemporaryHealth -> {target.statusList[TEMP_H_INDEX]    += forTurns;}
            }
    }
    
    
    //called in start of turn
    //returns true if stunned
    public boolean checkStatus()
    {
        for (int i = 0; i < statusList.length; i++) {
            
            System.out.println(statusList[i]); //debug
            
            if (statusList[i] != 0) {
                
                switch(i)
                {
                    case BLEED_INDEX -> {this.takeDamage(statusList[i]);}
                    case BURN_INDEX -> {this.takeDamage(statusList[i]);}
                    case FOG_INDEX -> {}
                    case POISON_INDEX -> {this.takeDamage(2);}
                    case SHOCK_INDEX -> {}
                    case STUN_INDEX -> {System.out.println("STUNNED! Will pass : " + statusList[i] + " turn"); return true;}
                    case TEMP_H_INDEX -> {}

                }
                
            }
        }
        return false;
    }
    
    
    public void statusFix(){
        
        for(int i = 0; i < statusList.length; i++){
        
            
            switch(i){
                
                //special conditons
                case BLEED_INDEX -> {}
                //case BURN_INDEX -> {statusList[i] = 0;}
                case FOG_INDEX -> {}
                case POISON_INDEX -> {}
                case SHOCK_INDEX -> {}
                case STUN_INDEX -> {}
                case TEMP_H_INDEX -> {}
                
                
            }
            
            if(statusList[i] > 0){
                statusList[i]--;
            }
        }
    }

}

