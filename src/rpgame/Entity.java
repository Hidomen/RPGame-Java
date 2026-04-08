package rpgame;

public abstract class Entity {
    
    protected double HP;
    protected double maxHP;
    
    protected double mana;
    protected double attackPower;
    protected double abilityPower;
    
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
}


