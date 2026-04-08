package rpgame;

public class Healer extends PlayerClass{
    //Passively heal urself/urgroup every turn.
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Massive Heal" , "Pray the God for health." , 4),
            new Ability("Holy Sword" , "Infuse your sword with the holy of God" , 2),
            new Ability("Tiny Heal" , "Make your wounds hurt less" , 2),
            new Ability("Hand Of God" , "Grasp your enemies with the hand of God" , 6)
    };
    
    Healer()
    {
        super(abilityList,1);
        maxHP = healthMulti * 15;
        mana = manaMulti * 7;
        attackPower = attackMulti * 6;
        HP = maxHP;
        abilityPower = abilityMulti * 6;
        
    }
    
    public void useAbility(Ability a/*,ENEMY*/){
        useAbilityManaControl(a);
        
        switch(a.name){
        }
    }
}
