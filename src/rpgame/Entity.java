package rpgame;

public abstract class Entity implements EntityFeatures {
    
    protected String className;
        
    protected double HP;
    protected double maxHP;
    
    protected double mana;
    protected double attackPower;
    protected double abilityPower;
    
    protected AbilityManager abilityManager;
    
    
    public Ability getAbility(int index){
        return abilityManager.getAbility(index);
    }

    public void useAbility(Ability a , Entity target){
        
        System.out.println(a.name);
        
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
    
    public void damageAbility(double damage , Entity target)
    {
        target.takeDamage((int)damage);
    }
    
    public void statusAbility(String Status, int forTurns ,Entity target)
    {
        
    }
}


