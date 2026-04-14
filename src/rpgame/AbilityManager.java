package rpgame;


public class AbilityManager {
    
    int abilityCapacity; //changes by class. for example mage can have 5 abilities, whereas warrior can only have 2
    
    Ability[] abilityList;
    Ability[] equippedAbilites;
    int nextEqNull;

    AbilityManager(Ability[] abilitylist, int abilityCapacity){
        abilityList = new Ability[Config.MAX_ABILITY_SIZE];
        equippedAbilites = new Ability[abilityCapacity];
        this.abilityList = abilitylist;
        this.abilityCapacity = abilityCapacity;
    }
   
    
   public void addEqAbility(Ability a){
        if(equippedAbilites.length <= nextEqNull){
            System.out.println("Ability list is full. You can not add another abilitiy.");
            return;
        }
        
        equippedAbilites[nextEqNull++] = a;
    }
    

    public void ListAbilities(Ability[] abList)
    {
        for (Ability abl : abList) {
            
            
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
    

    public Ability getAbility(int index)
    {
        if (index >= abilityCapacity){
            return null;
        }

        return abilityList[index];
    }
    
}
