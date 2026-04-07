package rpgame;

public abstract class PlayerClass {
    protected double hp;
    protected double maxHP;
    
    protected double mana;
    protected double attackPower;
    
    protected int level;
    protected int xp;
    protected final int xpCap;
    
    protected int money;
    
    PlayerClass(){
        xpCap = 100;
        level = 1;
        xp = 0;
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
        hp -= damage;
        
        if(hp <= 0){
            die();
        }
    }
    
    public void heal(int heal){

        hp += heal;

        if(hp > maxHP) {hp = maxHP;}
    }
    
    public void gainXP(int xp){
        this.xp += xp;
        
        if(this.xp >= xpCap){
            levelUp();
            
            this.xp -= xpCap;
        }
        
    }
    
    
    
}
