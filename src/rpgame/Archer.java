package rpgame;

public class Archer extends PlayerClass {
    //Dodge ability, have a chance to dodge attack
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Fireball" , "Throw a huge fireball to the enemy. Be carefull you may hurt your loved ones." , 7),
            new Ability("Stun'em" , "With using electric make your opponents studder" , 3),
            new Ability("PlaceHolder" , "This place is being hold by this ability" , 1)
    };
    
    Archer()
    {
        
        super(abilityList,1);
        
        maxHP = healthMulti * 14;
        mana = manaMulti * 5;
        attackPower = attackMulti * 10;
        
        HP = maxHP;

    }
    

}
