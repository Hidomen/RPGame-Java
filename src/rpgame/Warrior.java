package rpgame;

public class Warrior extends PlayerClass {
    //More health and basic attack power
    
    static Ability[] abilityList = { //we can do this with sth called 'record' 
            //3 skill (WARRIOR SKILLSET DONE)
            new Ability(0,"Rage","Empower your attack power by 0.25",3),
            new Ability(1,"Bleeding Cut","Apply 6 bleed", 4), //Bleed : At the start of the enemy's turn take damage equal to bleed. Then decrease bleed by one.
            new Ability(2,"Stand Proud","Gain 4 * ability power temporary health",2) //Temporary health : Lasts until enemy's turn end.
    };
    
    
    Warrior()
    {
        super(abilityList,1);
        maxHP = mult.health * 20;
        mana = mult.mana * 3;
        attackPower = mult.attack * 12;
        HP = maxHP;
        abilityPower = mult.ability * 3;

    }
    
    

    
    public void ability1(){
        
    }
    
    public void ability2(){
        
    }
    
    public void ability3(){
        
    }
}
