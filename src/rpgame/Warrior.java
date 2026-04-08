package rpgame;

public class Warrior extends PlayerClass {
    //More health and basic attack power
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("","",0),
            new Ability("","",0),
            new Ability("","",0)
    };
    
    Warrior()
    {
        super(abilityList,1);
        maxHP = mult.health * 20;
        mana = mult.mana * 3;
        attackPower = mult.attack * 15;
        HP = maxHP;
        abilityPower = mult.ability * 3;

    }
    
    
    public void useAbility(Ability a/*,ENEMY*/){
        useAbilityManaControl(a);
        
        switch(a.name){
        }
        
        ability1();
    }
    
    
    private void ability1(){
        
    }
    
    private void ability2(){
        
    }
    
    private void ability3(){
        
    }
}
