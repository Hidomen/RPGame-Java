package rpgame;

public class Mage extends PlayerClass {
    //Bigger mana and skill pool.
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Fireball" , "Throw a huge fireball to the enemy. Be carefull you may hurt your loved ones." , 7),
            new Ability("Stun'em" , "With using electric make your opponents studder" , 3),
            new Ability("PlaceHolder" , "This place is being hold by this ability" , 1)
        };
    
    Mage()
    {
        super(abilityList,5);
        maxHP = healthMulti * 10;
        mana = manaMulti * 10;
        attackPower = attackMulti * 5;
        HP = maxHP;
        
        
    }
    
    
 
}
