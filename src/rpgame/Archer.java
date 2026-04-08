package rpgame;

public class Archer extends PlayerClass {
    //Dodge ability, have a chance to dodge attack
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Ultimate Dodge","Next Attack will be definitely dodged",3),
            new Ability("Headshot", "Next attack will be critic damage (%150)",5),
            new Ability("ShadowMode", "For three turns you are completely invisible", 10) //meeh
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
    

    public void useAbility(Ability a/*,ENEMY*/){
        useAbilityManaControl(a);
        
        switch(a.name){
        }
    }
    
    
    private void ultimateDodge(){
        dodgePossibility = 1; //fix after attack
    }
    
    private void headshot(){
        attackPower *= 1.5;
        
    }
    
    private void shadowMode(){
        System.out.println("SHADOWWWW");
    }
}
