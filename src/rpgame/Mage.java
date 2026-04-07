package rpgame;

public class Mage extends PlayerClass {
    //Bigger mana and skill pool.
    Mage(ClassAbilityList cal)
    {
        super(cal);
        maxHP = healthMulti * 10;
        mana = manaMulti * 10;
        attackPower = attackMulti * 5;
        HP = maxHP;
    }
}
