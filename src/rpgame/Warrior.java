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
        maxHP = healthMulti * 20;
        mana = manaMulti * 3;
        attackPower = attackMulti * 15;
        HP = maxHP;
        abilityPower = abilityMulti * 3;

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
