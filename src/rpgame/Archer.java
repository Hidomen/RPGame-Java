package rpgame;

public class Archer extends PlayerClass {
    //Dodge ability, have a chance to dodge attack
    Archer(ClassAbilityList cal)
    {
        
        super(cal);
        
        maxHP = healthMulti * 14;
        mana = manaMulti * 5;
        attackPower = attackMulti * 10;
        
        HP = maxHP;

    }
    

}
