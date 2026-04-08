package rpgame;


public abstract class PlayerClass {
    protected double HP;
    protected double maxHP;
    
    protected double mana;
    protected double attackPower;
    protected double abilityPower;
    
    protected int money;
    
    protected int level;
    protected int xp;
    protected final int xpCap;
    
    
    protected final int healthMulti = 3;
    protected final int attackMulti = 1;
    protected final int abilityMulti = 1;
    protected final int manaMulti = 2;
    
    
    AbilityManager abilityManager;
    
    int abilityCap;
    
    PlayerClass(Ability[] abilityList, int abilityCap){
        
        xpCap = 100;
        level = 1;
        xp = 0;
        money = 0;
        
        this.abilityCap = abilityCap;
        
        abilityManager = new AbilityManager(abilityList, abilityCap);
    }
    
    
    public void useAbility(Ability a){
        if(a.name == "Fireball"){
            abilityManager.fireball();

        }
        if(a.name == "Stun'em"){
            abilityManager.hitthem(this);
        }
    }
    
    
    private void levelUp(){
        level++;
    }
    
    
    public double attack(){
        return attackPower;
    }
    
    
    private void die(){
        System.out.println("YOU DIED");
    }
    
    public void getDamage(int damage){
        HP -= damage;
        
        if(HP <= 0){
            die();
        }
    }
    
    public void heal(int heal){

        HP += heal;

        if(HP > maxHP) {HP = maxHP;}
    }
    
    public void gainXP(int xp){
        this.xp += xp;
        
        if(this.xp >= xpCap){
            levelUp();
            
            this.xp -= xpCap;
        }
        
    }
    
    
    
}
