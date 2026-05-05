package rpgame;
import static rpgame.Status.*;

public class Archer extends PlayerClass {
    
    private static Ability[] abilityList = {
            
            new Ability(0,"Ultimate Dodge","Next Attack will be definitely dodged",3),
            new Ability(1,"Practice", "Permanently increase your attack power",5),
            new Ability(2,"ShadowMode", "For three turns you are completely invisible", 10),
            new Ability(3,"Infuse Poison", "Make your enemy take 2 damage for turns equal to your ability power" , 4)
    };

    Archer()
    {
        super(abilityList);
        className = Classes.Archer;
        
        maxHP = Config.HEALTH_MULTIPLIER * 13;
        maxMana = Config.MANA_MULTIPLIER * 6;
        attackPower = Config.ATTACK_MULTIPLIER * 17;
        
        HP = maxHP;
        
        //statusList[Config.DODGE_INDEX] = 0.1;
        abilityPower = Config.ABILITY_MULTIPLIER * 6;

    }

    @Override
    public void ability0(Entity target){
        addStatus(Dodge , 1 , this);
    }
    
    @Override
    public void ability1(Entity target){
        attackPower *= 1.1;
    }
    
    @Override
    public void ability2(Entity target){
        addStatus(Dodge , 3 , this); 
    }
    
    @Override
    public void ability3(Entity target){
        addStatus(Bleed , (int)abilityPower*3 , target);
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
