package rpgame;


public abstract class PlayerClass extends Entity implements AbilityInterface {

    protected Classes className;
        
    protected int mana;
    protected int maxMana;
    protected int abilityPower;

    protected Ability[] abilityList;

    PlayerClass(Ability[] abilityList){
        
        this.abilityList = abilityList;
    }
    //==========================================================================
    // Ability function
    //==========================================================================
    public void useAbility(Ability a , Entity target){
        
        //System.out.println(a.getName()); //debug
        
        if(mana < a.getCost()){
            System.out.println("Your mana is not enough for the " + a.getName()); //log or popup
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
    
    public boolean isManaEnough(Ability a){
        
        if(mana < a.getCost()){
            return false;
        }
        return true;
    }
    
    public Ability getAbility(int index)
    {
        if (index >= abilityList.length){
            //System.err.println("Given index is out of limit"); Enough debug I guess ?
            return null;
        }

        return abilityList[index];
    }

    public int getMana(){
        return mana;
    }
    
    public void addMana(){
        if(mana >= maxMana) return;
        
        mana++;
    }
    
    public void addMana(int amount){
        
        mana += amount;
        
        if(mana >= maxMana) mana = maxMana;
    }
    
    public void setMaxHP(int amount){
        
        int maxHPLimitMIN = Config.MaxHPLimits[0];
        int maxHPLimitMAX = Config.MaxHPLimits[1];
        
        maxHP = amount;
        
        if(maxHP < maxHPLimitMIN) maxHP = maxHPLimitMIN;
        if(maxHP > maxHPLimitMAX) maxHP = maxHPLimitMAX;
    }
    
    public void setAttackPower(int amount){
        
        int attackPowerLimitMIN = Config.AttackPowerLimits[0];
        int attackPowerLimitMAX = Config.AttackPowerLimits[1];
        
        attackPower = amount;
        
        if(attackPower < attackPowerLimitMIN) attackPower = attackPowerLimitMIN;
        if(attackPower > attackPowerLimitMAX) attackPower = attackPowerLimitMAX;
    }
    
    public void setAbilityPower(int amount){
        
        int abilityPowerLimitMIN = Config.AbilityPowerLimits[0];
        int abilityPowerLimitMAX = Config.AbilityPowerLimits[1];
        
        abilityPower = amount;
        
        if(abilityPower < abilityPowerLimitMIN) abilityPower = abilityPowerLimitMIN;
        if(abilityPower > abilityPowerLimitMAX) abilityPower = abilityPowerLimitMAX;
    }
    
    public void setMaxMana(int amount){
        
        int maxManaLimitMIN = Config.MaxManaLimits[0];
        int maxManaLimitMAX = Config.MaxManaLimits[1];
        
        maxMana = amount;
        
        if(maxMana < maxManaLimitMIN) maxMana = maxManaLimitMIN;
        if(maxMana > maxManaLimitMAX) maxMana = maxManaLimitMAX;
    }
}
