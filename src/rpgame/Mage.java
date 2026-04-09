package rpgame;

public class Mage extends PlayerClass {
    //Bigger mana and skill pool.
    
    static Ability[] abilityList = {
            //6 skill (MAGE SKILLSET DONE)
            new Ability(0, "Fireball" , "Deal ability power * 1.5 and apply 3 burn to enemy" , 8), //Burn: Take damage equal to burn at the start of your turn.
            new Ability(1, "Electrify" , "Make your enemy shocked for turns equal to ability power * 0.25" , 3), // Shocked: Deal half damage
            new Ability(2, "Channel" , "Improve your ability power by 1" , 1),
            new Ability(3, "Blinding Fog" , "Enemy strikes half of the damage to itself with the chance of %50" , 5), //If happens player take no damage
            new Ability(4, "Unlearned Beams" , "Attack with light beams that deals ability power damage , ability power/2 times , Every beam has a %25 chance to hit", 5),
            new Ability(5, "Blood Bending" , "Take 10 damage deal 20 damage", 10)            
        };
    
    Mage()
    {
        super(abilityList,5);
        className = "Mage";

        maxHP = mult.health * 10;
        mana = mult.mana * 10;
        attackPower = mult.attack * 5;
        HP = maxHP;
        abilityPower = mult.ability * 8;
        
        
    }

    
    @Override
    public void ability1(){
        
        System.out.println("YOUR BALLS IS ON FIRE. ");
    }
    
    
    public void ability2(){
        System.out.println("YOU STUNNED THE ENEMY SUCCESFULLY. BUT THEY FALL ON YOU. YOU TAKE 5 DAMAGE");
        takeDamage(5);
    }

    public void ability3(){
        
    }
 
}
