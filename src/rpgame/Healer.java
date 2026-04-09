package rpgame;

public class Healer extends PlayerClass{
    //Passively heal urself/urgroup every turn.
    
    static Ability[] abilityList = { //we can do this with sth called 'record' 
            // Total of 5 skill ( HEALER SKILL SET DONE)
            new Ability(0,"Massive Heal" , "Gain health equal to your ability power * 1.5 " , 5),
            new Ability(1,"Holy Sword" , "Increase your attack power by quarter of your ability power" , 3),
            new Ability(2,"Tiny Heal" , "Gain health equal to your ability power * 0.5" , 3),
            new Ability(3,"Hand Of God" , "Attack with a mighty power of attack power + ability power" , 7),
            new Ability(4, "Light Binding" , "Stun your enemy for 1 turn" , 5)

    };
    
    Healer()
    {
        super(abilityList,1);
        maxHP = mult.health * 15;
        mana = mult.mana * 7;
        attackPower = mult.attack * 6;
        HP = maxHP;
        abilityPower = mult.ability * 6;
        
    }
    
    public void ability1(){
        
    }
    
    public void ability2(){
        
    }
    
    public void ability3(){
        
    }
}
