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
    
    public void addMana(int manaAdd){
        if(mana + manaAdd >= maxMana)
        {
            mana = maxMana;
        }
        else
            mana += manaAdd;
    }
}
