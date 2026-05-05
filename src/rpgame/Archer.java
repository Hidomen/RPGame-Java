package rpgame;
import static rpgame.Status.*;

public class Archer extends PlayerClass {
    
    private static Ability[] abilityList = {
            
            new Ability(0,"Tripwire","Stun the enemy for 2 turns",6),
            new Ability(1,"Practice", "Permanently increase your attack power",5),
            new Ability(2,"Infuse Posion", "Infuse poison which deals 2 damage per turn for ability power turn", 1),
            new Ability(3,"Sta-Stab", "Apply bleed for ability power * 3 turns" , 4)
    };

    Archer()
    {
        super(abilityList);
        className = Classes.Archer;
        
        maxHP = Config.HEALTH_MULTIPLIER * 13;
        maxMana = Config.MANA_MULTIPLIER * 6;
        attackPower = Config.ATTACK_MULTIPLIER * 17;
        
        HP = maxHP;

        abilityPower = Config.ABILITY_MULTIPLIER * 6;

    }

    @Override
    public void ability0(Entity target){
        addStatus(Stun , 2 , target);
    }
    
    @Override
    public void ability1(Entity target){
        attackPower *= 1.5;
    }
    
    @Override
    public void ability2(Entity target){
        addStatus(Poison , abilityPower , target); 
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
