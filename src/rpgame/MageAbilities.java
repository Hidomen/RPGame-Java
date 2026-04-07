package rpgame;

public class MageAbilities {
    private Abilities []mageAbs;
    private int abilityNum;
    
    public MageAbilities(int capacity)
    {
        mageAbs = new Abilities[capacity];
        abilityNum = 0;
    }
    
    public void AddAbility(Abilities mAb)
    {
        if (abilityNum < mageAbs.length) {
            mageAbs[abilityNum] = mAb;
            abilityNum++;
        }
        else
            System.out.println("Mage Ability list is full. You can not add another abilitiy.");
    }

    public void ListAbilities()
    {
        for (Abilities abArr1 : mageAbs) {
            System.out.println("=====================");
            System.out.println("Ability Name");
            System.out.println(abArr1.abilityName + "\n");
            System.out.println("Ability Description");
            System.out.println(abArr1.abilityDescription + "\n");
            System.out.println("Ability Cost : " + abArr1.abilityCost);
            System.out.println("=====================\n");            
        }
    }
    
    public Abilities pickAbility(int usedIndex)
    {
        //When you pick a ability to use maybe this can help to reach the ability easier with the return Abilities.
        //Maybe check for mana here ?
        return mageAbs[usedIndex];
    }
}
