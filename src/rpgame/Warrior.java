package rpgame;

public class Warrior extends PlayerClass {
    //More health and basic attack power
    Warrior(ClassAbilityList cal)
    {
        super(cal);
        maxHP = healthMulti * 20;
        mana = manaMulti * 3;
        attackPower = attackMulti * 15;
        HP = maxHP;
    }
}
