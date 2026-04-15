package rpgame;
import static rpgame.Status.*;

public class Warrior extends PlayerClass {
    //More health and basic attack power
    
    static Ability[] abilityList = {
            
            new Ability(0,"Rage","Empower your attack power by 0.25",3),
            new Ability(1,"Bleeding Cut","Apply 6 bleed", 4), //Working
            new Ability(2,"Stand Proud","Gain 4 * ability power temporary health",2) 
    };
    
    
    Warrior()
    {
        super(abilityList,3);
        className = "Warrior";

        maxHP = Config.health * 20;
        mana = Config.mana * 3;
        attackPower = Config.attack * 12;
        HP = maxHP;
        abilityPower = Config.ability * 3;

    }
    
    

    
    public void ability0(Entity target){
        this.attackPower *= 1.25;
    }
    
    public void ability1(Entity target){
        addStatus(Bleed , 6 , target);
    }
    
    public void ability2(Entity target){
        addStatus(TemporaryHealth , (int)(4*abilityPower) , target);
    }
    
    public void ability3(Entity target){
    }
    
    public void ability4(Entity target){
    }
    
    public void ability5(Entity target){
    }
    
}
