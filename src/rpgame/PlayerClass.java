package rpgame;


public abstract class PlayerClass extends Entity {

    protected int money;
    
    protected int level;
    protected int xp;
    protected final int xpCap;

    AbilityManager abilityManager;
    
    int abilityCap;
    
    
    PlayerClass(Ability[] abilityList, int abilityCap){
        
        xpCap = 100;
        level = 1;
        xp = 0;
        money = 0;
        
        this.abilityCap = abilityCap;
        
        abilityManager = new AbilityManager(abilityList, abilityCap);
    }

    
    public void useAbilityManaControl(Ability a){
        
        if(mana < a.cost){
            abilityManager.abilityErrorMissingMana(a.name);
            return;
        }

        mana -= a.cost;
    }
    
    
    private void levelUp(){
        level++;
    }

    
    public void gainXP(int xp){
        this.xp += xp;
        
        if(this.xp >= xpCap){
            levelUp();
            
            this.xp -= xpCap;
        }
        
    }
    
    
    
}
