package rpgame;

public class Healer extends PlayerClass{
    //Passively heal urself/urgroup every turn.
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Fireball" , "Throw a huge fireball to the enemy. Be carefull you may hurt your loved ones." , 7),
            new Ability("Stun'em" , "With using electric make your opponents studder" , 3),
            new Ability("PlaceHolder" , "This place is being hold by this ability" , 1)
    };
    
    Healer()
    {
        super(abilityList,1);
        maxHP = healthMulti * 15;
        mana = manaMulti * 7;
        attackPower = attackMulti * 6;
        HP = maxHP;
    }
}
