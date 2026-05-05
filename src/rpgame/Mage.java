package rpgame;
import java.util.Random;
import javax.swing.JOptionPane;
import static rpgame.Status.*;

public class Mage extends PlayerClass {
    
    private static Ability[] abilityList = {
            
            new Ability(0, "Fireball" , "Deal ability power * 1.5 damage and apply 3 burn to enemy" , 8), 
            new Ability(1, "Electrify" , "Make your enemy shocked for turns equal to ability power * 0.25" , 3), 
            new Ability(2, "Channel" , "Improve your ability power by 1" , 15), 
            new Ability(3, "Blinding Fog" , "Enemy strikes half of the damage to itself with the chance of %50" , 5),
            new Ability(4, "Unlearned Beams" , "Throw light beams that deals ability damage, ability/2 times, %25 chance", 5),
            new Ability(5, "Blood Bending" , "Take 10 damage deal 20 damage", 10)
        };
    
    Mage()
    {
        super(abilityList);
        className = Classes.Mage;

        maxHP           = Config.HEALTH_MULTIPLIER * 10;
        maxMana         = Config.MANA_MULTIPLIER * 10;
        attackPower     = Config.ATTACK_MULTIPLIER * 5;
        abilityPower    = Config.ABILITY_MULTIPLIER * 8;

        HP = maxHP;
    }

    @Override
    public void ability0(Entity target){
        giveDamage((int)(abilityPower * 1.5) , target);
        addStatus(Burn, 3 ,target);
    }
    
    @Override
    public void ability1(Entity target){
        addStatus(Shock , (int)(abilityPower * 0.25) , target);
    }

    @Override
    public void ability2(Entity target){
        abilityPower += 1;
    }
    
    @Override
    public void ability3(Entity target)
    {
        addStatus(Fog, 1, target);
    }
    
    @Override
    public void ability4(Entity target)
    {
        int chance, missedBeams = 0;
        int beamCount = (int)(abilityPower / 2);
        
        for (int i = 0; i < beamCount; i++) {
            
            Random rand = new Random();
            chance = rand.nextInt(4);
            
            if (chance == 2) { // 1/4 şans 2yi seçtim çünkü en sevdiğim asal.
                giveDamage(abilityPower , target);
            }
            else
                missedBeams++;
                
        }
        
        if(missedBeams == beamCount){
            
            JOptionPane.showMessageDialog(null, "You missed them all.", "Unlearned Beams", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(missedBeams > 0){
            
            JOptionPane.showMessageDialog(null, "You missed " + missedBeams + " beams.", "Unlearned Beams", JOptionPane.INFORMATION_MESSAGE);
        } 
        
        
    }
    
    @Override
    public void ability5(Entity target)
    {

        giveDamage(20, target);
        takeDamage(10);
    }
 
}