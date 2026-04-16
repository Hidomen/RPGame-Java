package rpgame;
import static rpgame.Status.*;

public class Archer extends PlayerClass {
    //Dodge ability, have a chance to dodge attack
    
    static Ability[] abilityList = {
            
            new Ability(0,"Ultimate Dodge","Next Attack will be definitely dodged",3),
            new Ability(1,"Headshot", "Next attack will be critic damage (%150)",5),
            new Ability(2,"ShadowMode", "For three turns you are completely invisible", 10), //meeh
            new Ability(3,"Infuse Poison", "Make your enemy take 2 damage for turns equal to your ability power" , 4),//Working
    };
      
    double dodgePossibility;

    Archer()
    {
        super(abilityList,4);
        className = "Archer";
        
        maxHP = Config.health * 14;
        mana = Config.mana * 5;
        attackPower = Config.attack * 10;
        
        HP = maxHP;

        
        dodgePossibility = 0.1;
        abilityPower = Config.ability * 5;

    }

    @Override
    public void ability0(Entity target){
        dodgePossibility += 1; //-1 after attack
    }
    
    @Override
    public void ability1(Entity target){
        attackPower *= 1.5; //fix after attack
    }
    
    @Override
    public void ability2(Entity target){
        dodgePossibility += 3; //-1 after attack
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
