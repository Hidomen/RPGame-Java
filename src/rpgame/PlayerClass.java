package rpgame;

//import java.util.Scanner;

public abstract class PlayerClass extends Entity{

    protected Classes className;
        
    protected int level;
    protected int XP;
    protected final int xpCap;

    protected Ability[] abilityList;

    PlayerClass(Ability[] abilityList){
        xpCap = 100;
        level = 1;
        XP = 0;
        
        this.abilityList = abilityList;
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
    
    
    public boolean isManaEnough(Ability a){
        
        if(mana < a.getCost()){
            return false;
        }
        return true;
    }
    
    public Ability getAbility(int index)
    {
        if (index >= abilityList.length){
            System.err.println("Given index is out of limit");
            return null;
        }

        return abilityList[index];
    }

}
