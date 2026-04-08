package rpgame;

public class Mage extends PlayerClass {
    //Bigger mana and skill pool.
    
    static Ability[] abilityList = { //we can do this with sth called 'record'
            new Ability("Fireball" , "Throw a huge fireball to the enemy. Be carefull you may hurt your loved ones." , 7),
            new Ability("Stun'em" , "With using electric make your opponents studder" , 3),
            new Ability("PlaceHolder" , "This place is being hold by this ability" , 1)
        };
    
    Mage()
    {
        super(abilityList,5);
        
        maxHP = mult.health * 10;
        mana = mult.mana * 10;
        attackPower = mult.attack * 5;
        HP = maxHP;
        abilityPower = mult.ability * 8;
        
    }
    

    
    public void useAbility(Ability a/*,ENEMY*/){
        useAbilityManaControl(a);
        
        switch(a.name){
            case "Fireball" -> fireball();
            case "Stun'em" -> stunthem();
        }
    }
    
    
    public void fireball(){
        
        System.out.println("YOUR BALLS IS ON FIRE. ");
    }
    
    
    public void stunthem(){
        System.out.println("YOU STUNNED THE ENEMY SUCCESFULLY. BUT THEY FALL ON YOU. YOU TAKE 5 DAMAGE");
        getDamage(5);
    }
   
    
 
}
