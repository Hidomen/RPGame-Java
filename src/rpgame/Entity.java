package rpgame;

import java.util.Random;

public abstract class Entity implements EntityFeatures {
    
    
    private String entityName;
        
    protected double HP;
    protected double maxHP;
    
    protected int mana;
    protected double attackPower;
    protected double abilityPower;
    
    protected AbilityManager abilityManager;

    
    protected double [] statusList = {0,0,0,0,0,0,0,0};
    
    public static final int BLEED_INDEX     = 0; //At the start of the enemy's turn take damage equal to bleed. Then decrease bleed by one. (Working)
    public static final int BURN_INDEX      = 1; //Take damage equal to burn at the start of your turn.                                     (Working)
    public static final int FOG_INDEX       = 2; //Enemy strikes half of the damage to itself with the chance of %50                        (Working)
    public static final int DODGE_INDEX     = 3;
    public static final int POISON_INDEX    = 4; //Make your enemy take 2 damage for turns equal to your ability power                      (Working)
    public static final int SHOCK_INDEX     = 5; //Deal half damage                                                                         (Working)
    public static final int STUN_INDEX      = 6; //Pass turn                                                                                (Working)
    public static final int TEMP_H_INDEX    = 7; //TemporaryHealth : Lasts until enemy's turn end                                           (Working)

    
    protected static int attackScale;
    protected static int healthScale;
    protected static int manaScale;
    protected static int abilityScale;

    public Entity(){
        
        attackScale = 1;
        healthScale = 1;
        manaScale = 1;
        abilityScale = 1;
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

    public Ability getAbility(int index){
        return abilityManager.getAbilityList(index);
    }
    //==========================================================================
    // Ability function
    //==========================================================================
    public void useAbility(Ability a , Entity target){
        
        //System.out.println(a.name);
        
        if(mana < a.getCost()){
            System.out.println("Your mana is not enough for the " + a.getName());
            return;
        }

        mana -= a.getCost();
        
        
        switch(a.getID()){
            case 0 -> ability0(target);
            case 1 -> ability1(target);
            case 2 -> ability2(target);
            case 3 -> ability3(target);
            case 4 -> ability4(target);
            case 5 -> ability5(target);
        }
    }
    //==========================================================================
    // Combat functions
    //==========================================================================
    @Override
    public void attack(Entity target){

        double damage = attackPower;
        
        if(statusList[FOG_INDEX] > 0){ // %50 chance to attack urself instead
            Random rand = new Random();
            
            if(rand.nextBoolean()){
                System.out.println("AAAAHH!! I HIT MYSELF");
                takeDamage(attackPower);
                return;
            }
        }
        if(statusList[SHOCK_INDEX] > 0){
            damage /= 2;
        }
        
        double targetTempHealth = target.statusList[TEMP_H_INDEX];
        if(targetTempHealth > 0){
            //target.statusList[TEMP_H_INDEX] -= damage; //if its gonna reset after one turn doesn't necessary
            damage -= targetTempHealth;
        }
        
        if (target.statusList[DODGE_INDEX] > 0) {
            Random rand = new Random();
            double chance = rand.nextDouble();
            if (target.statusList[DODGE_INDEX] >= chance) {
                System.out.println("Enemy dodged the attack.");
                return;
            }
        }
        
        giveDamage(damage,target);
    }
    
    
    public boolean isDead(){
        return (HP <= 0);
    }
    
    
    public void takeDamage(double damage){
        
        if(damage <= 0) return;
        
        HP -= damage;
    }
    
    
    public void heal(int heal){
        
        if(heal <= 0) return;

        HP += heal;

        if(HP > maxHP) {HP = maxHP;}
    }

    
    public void giveDamage(double damage, Entity target)
    {
        
        if(damage <= 0) return;
        
        target.takeDamage((int)damage); //Maybe floor cast
    }
    //==========================================================================
    // Status functions
    //==========================================================================
    public void addStatus(Status status, int forTurns, Entity target)
    {
        switch(status)
        {
            case Bleed ->           {target.statusList[BLEED_INDEX]     += forTurns;}
            case Burn ->            {target.statusList[BURN_INDEX]      += forTurns;}
            case Dodge ->           {target.statusList[DODGE_INDEX]     += forTurns;}
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
                    case DODGE_INDEX -> {}
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
    //==========================================================================
    //
    //==========================================================================
    public void endTurnEffects(){
        
        
        //update status
        for(int i = 0; i < statusList.length; i++){
        
            
            switch(i){
                
                //special conditons
                case BLEED_INDEX -> {}
                case BURN_INDEX -> {statusList[i] = 0;}
                case FOG_INDEX -> {}
                case DODGE_INDEX -> {if(statusList[i] != 0.1) {statusList[i]--;}}
                case POISON_INDEX -> {}
                case SHOCK_INDEX -> {}
                case STUN_INDEX -> {}
                case TEMP_H_INDEX -> {statusList[i] = 0;}
                
                
            }
            
            if(statusList[i] > 0){
                statusList[i]--;
            }
        }
        
        
        mana++;
    }

}

