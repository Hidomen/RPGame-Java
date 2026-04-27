package rpgame;
import static rpgame.Status.*;

public class Archer extends PlayerClass {
    
    private static Ability[] abilityList = {
            
            new Ability(0,"Ultimate Dodge","Next Attack will be definitely dodged",3),
            new Ability(1,"Headshot", "Next attack will be critic damage (%150)",5),
            new Ability(2,"ShadowMode", "For three turns you are completely invisible", 10), //meeh
            new Ability(3,"Infuse Poison", "Make your enemy take 2 damage for turns equal to your ability power" , 4),//Working
    };

    Archer()
    {
        super(abilityList);
        className = Classes.Archer;
        
        maxHP = Config.HEALTH_MULTIPLIER * 14;
        maxMana = Config.MANA_MULTIPLIER * 5;
        attackPower = Config.ATTACK_MULTIPLIER * 10;
        
        HP = maxHP;
        
        //statusList[Config.DODGE_INDEX] = 0.1;
        abilityPower = Config.ABILITY_MULTIPLIER * 5;

    }

    @Override
    public void ability0(Entity target){
        addStatus(Dodge , 1 , this);
    }
    
    @Override
    public void ability1(Entity target){ //Look for this.
        attackPower *= 1.5; //fix after attack
    }
    
    @Override
    public void ability2(Entity target){
        addStatus(Dodge , 3 , this); 
    }
    
    @Override
    public void ability3(Entity target){
        System.out.println("poison added");
        addStatus(Poison , (int)abilityPower , target);
    }
    
    @Override
    public void ability4(Entity target){
        System.err.println("Archer does not have ability4");
    }
    
    @Override
    public void ability5(Entity target){
        System.err.println("Archer does not have ability5");
    }
    
}
