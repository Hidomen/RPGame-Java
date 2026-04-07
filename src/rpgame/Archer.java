package rpgame;

public class Archer extends PlayerClass {
    //Dodge ability, have a chance to dodge attack
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Ultimate Dodge","Next Attack will be definitely dodged",3)
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
