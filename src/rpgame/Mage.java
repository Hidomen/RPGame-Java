package rpgame;
import java.util.Random;
import static rpgame.Status.*;

public class Mage extends PlayerClass {
    //Bigger mana and skill pool.
    
    static Ability[] abilityList = {
            
            new Ability(0, "Fireball" , "Deal ability power * 1.5 damage and apply 3 burn to enemy" , 8), //Working
            new Ability(1, "Electrify" , "Make your enemy shocked for turns equal to ability power * 0.25" , 3), 
            new Ability(2, "Channel" , "Improve your or an ally's ability power by 1" , 1), //Working
            new Ability(3, "Blinding Fog" , "Enemy strikes half of the damage to itself with the chance of %50" , 5),
            new Ability(4, "Unlearned Beams" , "Attack with light beams that deals ability power damage , ability power/2 times , Every beam has a %25 chance to hit", 5),//Working
            new Ability(5, "Blood Bending" , "Take 10 damage deal 20 damage", 10)   //Working          
        };
    
    
    Mage()
    {
        super(abilityList);
        className = Classes.Mage;

        maxHP = Config.health * 10;
        mana = Config.mana * 10;
        attackPower = Config.attack * 5;
        HP = maxHP;
        abilityPower = Config.ability * 8;

    }

    @Override
    public void ability0(Entity enemy){
        giveDamage(abilityPower * 1.5 , enemy);
        addStatus(Burn, 3 ,enemy);
    }
    
    @Override
    public void ability1(Entity enemy){
        addStatus(Shock , (int) (abilityPower * 0.25) , enemy);
    }

    @Override
    public void ability2(Entity player){
        abilityPower += 1;
    }
    
    @Override
    public void ability3(Entity enemy)
    {
        System.out.println("FOGGG!!!!");
        addStatus(Fog, 1, enemy);
    }
    
    @Override
    public void ability4(Entity enemy)
    {
        int chance;
        for (int i = 0; i < (int)(abilityPower/2); i++) {
            Random rand = new Random();
            chance = rand.nextInt(4) + 1;
            if (chance == 2) { // 1/4 şans 2yi seçtim çünkü en sevdiğim asal.
                giveDamage(abilityPower , enemy);
            }
            else
                System.out.println("Missed one of the beams!");
        }
    }
    
    @Override
    public void ability5(Entity enemy)
    {

        //damageAbility(20 , enemy);
        takeDamage(10);
    }
 
}
