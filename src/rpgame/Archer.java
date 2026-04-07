package rpgame;

public class Archer extends PlayerClass {
    //Dodge ability, have a chance to dodge attack
    Archer()
    {
        
        super();
        
        maxHP = healthMulti * 14;
        mana = manaMulti * 5;
        attackPower = attackMulti * 10;
        
        HP = maxHP;

    }
    

}
