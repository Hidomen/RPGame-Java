package rpgame;
import static rpgame.Status.*;

public class Warrior extends PlayerClass {
    
    private static Ability[] abilityList = {
            
            new Ability(0,"Rage","Empower your attack power by 0.25",3),
            new Ability(1,"Bleeding Cut","Apply 6 bleed", 4), //Working
            new Ability(2,"Stand Proud","Gain 3 * ability power temporary health",2) 
    };
    
    Warrior()
    {
        super(abilityList);
        className = Classes.Warrior;

        maxHP = Config.HEALTH_MULTIPLIER * 20;
        maxMana = Config.MANA_MULTIPLIER * 3;
        attackPower = Config.ATTACK_MULTIPLIER * 12;
        HP = maxHP;
        abilityPower = Config.ABILITY_MULTIPLIER * 3;

    }
    
    @Override
    public void ability0(Entity target){
        this.attackPower *= 1.25;
    }
    
    @Override
    public void ability1(Entity target){
        addStatus(Bleed , 6 , target);
    }
    
    @Override
    public void ability2(Entity target){
        addStatus(TemporaryHealth , (int)(3*abilityPower) , this);
    }
    
    @Override
    public void ability3(Entity target){
        System.err.println("Warrior does not have ability3");
    }
    
    @Override
    public void ability4(Entity target){
        System.err.println("Warrior does not have ability4");
    }
    
    @Override
    public void ability5(Entity target){
        System.err.println("Warrior does not have ability5");
    }
    
}
