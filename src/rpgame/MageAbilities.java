package rpgame;

public class MageAbilities extends Abilities {
    private Abilities []mageAbs;
    private int abilityNum;  
    
    public MageAbilities(int capacity)
    {
        super();
        mageAbs = new MageAbilities[capacity];
        abilityNum = 0;
    }
    
    public void AddAbility(Abilities mAb)
    {
        if (abilityNum < mageAbs.length) {
            mageAbs[abilityNum] = mAb;
            abilityNum++;            
        }
    }
    
    public Abilities pickAbility(int usedIndex)
    {
        //When you pick a ability to use maybe this can help to reach the ability easier with the return Abilities.
        //Maybe check for mana here ?
        return mageAbs[usedIndex];
    }
}
