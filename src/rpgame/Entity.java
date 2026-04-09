package rpgame;

public abstract class Entity implements EntityFeatures {
    
    protected String className;
        
    protected double HP;
    protected double maxHP;
    
    protected double mana;
    protected double attackPower;
    protected double abilityPower;
    
    protected AbilityManager abilityManager;
    
    public void chooseAbility(int id){
        
    }
    
    
    public Ability getAbility(int index){
        return abilityManager.getAbility(index);
    }

    
    public void useAbility(Ability a/*,ENEMY*/){
        
        System.out.println(a.name);
        
        if(mana < a.cost){
            System.out.println("Your mana cannot enough for the " + a.name);
            return;
        }

        mana -= a.cost;
        
        
        switch(a.ID){
            case 0 -> ability0();
            case 1 -> ability1();
            case 2 -> ability2();
        }
    }
    
    public double attack(){
        return attackPower;
    }
    
    
    private void die(){
        System.out.println("YOU DIED");
    }
    
    public void takeDamage(int damage){
        HP -= damage;
        
        if(HP <= 0){
            die();
        }
    }
    
    public void heal(int heal){

        HP += heal;

        if(HP > maxHP) {HP = maxHP;}
    }
}


