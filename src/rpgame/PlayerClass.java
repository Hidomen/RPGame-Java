package rpgame;

//import java.util.Scanner;

public abstract class PlayerClass extends Entity{

    protected Classes className;
        
    protected int level;
    protected int XP;
    protected final int xpCap;

    protected int abilityCap;
    

    PlayerClass(Ability[] abilityList, int abilityCap){
        xpCap = 100;
        level = 1;
        XP = 0;
        
        this.abilityCap = abilityCap;
        
        abilityManager = new AbilityManager(abilityList, abilityCap);
    }


    private void levelUp(){
        level++;
    }

    
    public void gainXP(int xp){
        this.XP += xp;
        
        if(this.XP >= xpCap){
            levelUp();
            
            this.XP -= xpCap;
        }
        
    }

}
