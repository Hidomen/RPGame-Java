package rpgame;


public class AbilityManager {
    
    int nextNull;
    int abilityCap; //changes by class. for example mage can have 5 abilities, whereas warrior can only have 2
    Ability[] abilityList;
    

    AbilityManager(Ability[] abilitylist, int abilityCap){
        abilityList = new Ability[abilityCap];
        this.abilityList = abilitylist;
        this.abilityCap = abilityCap;
    }

    
   public void addAbility(Ability a){
        if(abilityCap <= nextNull){
            System.out.println("Ability list is full. You can not add another abilitiy.");
            return;
        }
        
        abilityList[nextNull++] = a;
    }
    
   
    public void ListAbilities()
    {
        for (Ability abl : abilityList) {
            
            
            if (null == abl){
                System.out.println("1");
                return;
            }
            
            System.out.println("=====================");
            System.out.println("Ability Name");
            System.out.println(abl.name + "\n");
            System.out.println("Ability Description");
            System.out.println(abl.description + "\n");
            System.out.println("Ability Cost : " + abl.cost);
            System.out.println("=====================\n");            
        }
    }
    

    
    public Ability pickAbility(int index)
    {
        if (index >= abilityCap) return null;
        
        //When you pick a ability to use maybe this can help to reach the ability easier with the return Abilities.
        //Maybe check for mana here ?
        return abilityList[index];
    }
    
}
