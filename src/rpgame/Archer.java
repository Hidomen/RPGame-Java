package rpgame;

public class Archer extends PlayerClass {
    //Dodge ability, have a chance to dodge attack
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability(1,"Ultimate Dodge","Next Attack will be definitely dodged",3),
            new Ability(2,"Headshot", "Next attack will be critic damage (%150)",5),
            new Ability(3,"ShadowMode", "For three turns you are completely invisible", 10) //meeh
    };
    
    
    double dodgePossibility;

    Archer()
    {
        
        super(abilityList,1);
        
        maxHP = mult.health * 14;
        mana = mult.mana * 5;
        attackPower = mult.attack * 10;
        
        HP = maxHP;

        
        dodgePossibility = 0.1;
        abilityPower = mult.ability * 5;

    }

    
    public void ability1(){
        dodgePossibility = 1; //fix after attack
    }
    
    public void ability2(){
        attackPower *= 1.5;
        
    }
    
    public void ability3(){
        System.out.println("SHADOWWWW");
    }
}
