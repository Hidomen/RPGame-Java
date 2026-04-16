package rpgame;

import java.util.ArrayList;

public class AbilityManager {
    
    private int abilityCapacity; //changes by class. for example mage can have 5 abilities, whereas warrior can only have 2
    
    private Ability[] abilityList;
    
    private ArrayList<Ability> equippedAbilities;

    
    AbilityManager(Ability[] abilitylist, int abilityCapacity){
        
        equippedAbilities = new ArrayList<Ability>();
        
        this.abilityList = abilitylist;
        this.abilityCapacity = abilityCapacity;
    }
   
    
    public void addEqAbility(Ability a){
       
        if(equippedAbilities.size() >= abilityCapacity){
       
            System.err.println("Ability list is full. You can not add another ability.");
            return;
        }
        
        equippedAbilities.add(a);
    }
    //==========================================================================
    // Getters
    //==========================================================================
    public Ability getAbilityList(int index)
    {
        if (index >= abilityList.length){
            System.err.println("Given index is out of limit");
            return null;
        }

        return abilityList[index];
    }
    
    public Ability getAbilityEq(int index){
        if (index >= abilityCapacity){
            System.err.println("Given index is out of limit");
            return null;
        }
        
        return equippedAbilities.get(index);
    }
    
}
