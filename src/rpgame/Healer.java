package rpgame;
import static rpgame.Status.*;

public class Healer extends PlayerClass{
    //Passively heal urself/urgroup every turn.
    
    static Ability[] abilityList = {
            
            new Ability(0,"Massive Heal" , "Gain health equal to your ability power * 1.5 " , 5),
            new Ability(1,"Holy Sword" , "Increase your attack power by quarter of your ability power" , 3),
            new Ability(2,"Tiny Heal" , "Gain health equal to your ability power * 0.5" , 3),
            new Ability(3,"Hand Of God" , "Attack with a mighty power of attack power + ability power" , 7),
            new Ability(4, "Light Binding" , "Stun your enemy for 1 turn" , 5),//Working
    };
    
    Healer()
    {
        super(abilityList,5);
        className = Classes.Healer;
        
        maxHP = Config.health * 15;
        mana = Config.mana * 7;
        attackPower = Config.attack * 6;
        HP = maxHP;
        abilityPower = Config.ability * 6;
        
    }
    
    @Override
    public void ability0(Entity target){
        target.heal((int)(abilityPower * 1.5));
    }
    
    @Override
    public void ability1(Entity target){
        this.attackPower += (0.25 * abilityPower);
    }
    
    @Override
    public void ability2(Entity target){
        target.heal((int)(abilityPower * 0.5));
    }
    
    @Override
    public void ability3(Entity target){
        target.takeDamage(abilityPower + attackPower);
    }
    
    @Override
    public void ability4(Entity target){
        addStatus(Stun , 1 , target);
    }
    
    @Override
    public void ability5(Entity target){
        System.err.println("Healer does not have ability5");
    }
    
}
