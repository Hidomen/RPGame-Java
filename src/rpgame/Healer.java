package rpgame;

public class Healer extends PlayerClass{
    //Passively heal urself/urgroup every turn.
    Healer()
    {
        super();
        maxHP = healthMulti * 15;
        mana = manaMulti * 7;
        attackPower = attackMulti * 6;
        HP = maxHP;
    }
}
