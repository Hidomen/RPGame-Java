package rpgame;

public abstract class Entity implements EntityFeatures {
    
    protected String className;
        
    protected double HP;
    protected double maxHP;
    
    protected double mana;
    protected double attackPower;
    protected double abilityPower;
    
    protected AbilityManager abilityManager;
    
    protected int [] haveStatus = {0,0,0,0,0,0,0};
    //Bleed index 0 -> TemporaryHealth index 6
    //Bleed           : At the start of the enemy's turn take damage equal to bleed. Then decrease bleed by one. (Working)
    //Burn            : Take damage equal to burn at the start of your turn.                                     (Working)
    //Fog             : Enemy strikes half of the damage to itself with the chance of %50
    //Poison          : Make your enemy take 2 damage for turns equal to your ability power                      (Working)
    //Shocked         : Deal half damage
    //Stun            : Pass turn                                                                                (Working)
    //TemporaryHealth : Lasts until enemy's turn end.
    public Ability getAbility(int index){
        return abilityManager.getAbility(index);
    }

    public void useAbility(Ability a , Entity target){
        
        //System.out.println(a.name);
        
        if(mana < a.cost){
            System.out.println("Your mana is not enough for the " + a.name);
            return;
        }

        mana -= a.cost;
        
        
        switch(a.ID){
            case 0 -> ability0(target);
            case 1 -> ability1(target);
            case 2 -> ability2(target);
            case 3 -> ability3(target);
            case 4 -> ability4(target);
            case 5 -> ability5(target);
        }
    }
    
    public void attack(Entity target){
        target.takeDamage(attackPower);
    }
    
    
    private void die(){
        System.out.println(className);
        System.out.println("YOU DIED");
    }
    
    public void takeDamage(double damage){
        HP -= damage;
        
        if(HP <= 0){
            die();
        }
    }
    
    public void heal(int heal){

        HP += heal;

        if(HP > maxHP) {HP = maxHP;}
    }
    
    public void activateAbility(double damage , Entity target)
    {
        target.takeDamage((int)damage); //Maybe floor cast
    }

    public void activateAbility(Status status, int forTurns ,Entity target)
    {
            switch(status)
            {
                case Bleed: target.haveStatus[0] += forTurns;break;
                case Burn: target.haveStatus[1] += forTurns;break;
                case Fog: target.haveStatus[2] += forTurns;break;
                case Poison: target.haveStatus[3] += forTurns;break;
                case Shock: target.haveStatus[4] += forTurns;break;
                case Stun: target.haveStatus[5] += forTurns;break;
                case TemporaryHealth: target.haveStatus[6] += forTurns;break;
            }
    }
    
    public boolean checkStatus() //if true pass turn 
    {
        for (int i = 0; i < haveStatus.length; i++) {
            System.out.println(haveStatus[i]);
            if (haveStatus[i] != 0) {
                switch(i)
                {
                    case 0: this.takeDamage(haveStatus[i]--); break;
                    case 1: this.takeDamage(haveStatus[i]); haveStatus[i] = 0; break;
                    case 2: break;
                    case 3: this.takeDamage(2); haveStatus[i]--; break;
                    case 4: break;
                    case 5: System.out.println("STUNNED! Will pass : " + haveStatus[i] + " turn"); haveStatus[i]--; return true;
                    case 6: break;
                }

            }
        }
        return false;
    }
}


