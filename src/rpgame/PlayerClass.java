package rpgame;

//import java.util.Scanner;

public abstract class PlayerClass extends Entity{

    protected Classes className;
        
    

    protected Ability[] abilityList;

    PlayerClass(Ability[] abilityList){
        
        this.abilityList = abilityList;
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
