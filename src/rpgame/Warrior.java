package rpgame;

public class Warrior extends PlayerClass {
    //More health and basic attack power
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Fireball" , "Throw a huge fireball to the enemy. Be carefull you may hurt your loved ones." , 7),
            new Ability("Stun'em" , "With using electric make your opponents studder" , 3),
            new Ability("PlaceHolder" , "This place is being hold by this ability" , 1)
    };
    
    Warrior()
    {
        super(abilityList,1);
        maxHP = healthMulti * 20;
        mana = manaMulti * 3;
        attackPower = attackMulti * 15;
        HP = maxHP;
        abilityPower = abilityMulti * 3;

    }
}
