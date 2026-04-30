package rpgame;

import java.util.ArrayList;

public class Group {
    
    private int money;
    private int size;
    
    private ArrayList<PlayerClass> players;
    
    private ArrayList<Item> inventory;

    private int level;
    private int XP;
    private final int xpCap;
    
    public Group(ArrayList<PlayerClass> players){
        
        this.players = players;
        
        money = 100;
        xpCap = 100;
        level = 1;
        XP = 0;
        
        inventory = new ArrayList<Item>();
    }
    
    private void levelUp(){
        level++;
        
        for(PlayerClass p : players){
            
            p.HP            *= Config.LEVEL_UP_HP_MULTIPLIER;
            p.abilityPower  *= Config.LEVEL_UP_ABILITY_MULTIPLIER;
            p.attackPower   *= Config.LEVEL_UP_ATTACK_MULTIPLIER;
            
        }
    }

    
    public void gainXP(int xp){
        this.XP += xp;
        
        if(this.XP >= xpCap){
            levelUp();
            
            this.XP -= xpCap;
        }
        
    }
    
    public void setMoney(int money){
        this.money = money;
    }
    
    public int getMoney(){
        System.out.println(money + "MONEY");
        return money;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isInGroup(Classes c){
        
        for(PlayerClass p : players){
            if(c == p.className){
                return true;
            }
        }
        
        return false;
    }
    
    // INVENTORY
    public void addToInventory(Item i)
    {
        inventory.add(i);
        
        for(PlayerClass p : players){
            p.maxHP         += i.getHealthModifier();
            p.abilityPower  += i.getAbilityModifier();
            p.attackPower   += i.getAttackModifier();
            p.maxMana       += i.getMaxManaModifier();
        }
        
    }
    
    public ArrayList<Item> getInventory()
    {
        return inventory;
    }
}
