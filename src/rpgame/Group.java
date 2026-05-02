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
        
        System.out.println("LEVEL");

        System.out.println(players.get(0).maxHP + " PRE");

        level++;
        
        for(PlayerClass p : players){
            
            p.setMaxHP          ((int)(p.maxHP          + Config.LEVEL_UP_MAXHP_MULTIPLIER  ));
            p.setAbilityPower   ((int)(p.abilityPower   + Config.LEVEL_UP_ABILITY_MULTIPLIER));
            p.setAttackPower    ((int)(p.attackPower    + Config.LEVEL_UP_ATTACK_MULTIPLIER ));
            
        }
        
        System.out.println(players.get(0).maxHP + " POST");
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
            
            p.setMaxHP(p.maxHP                  += i.getHealthModifier());
            p.setAbilityPower(p.abilityPower    += i.getAbilityModifier());
            p.setAttackPower(p.attackPower      += i.getAttackModifier());
            p.setMaxMana(p.maxMana              += i.getMaxManaModifier());
            
        }
        
    }
    
    public ArrayList<Item> getInventory()
    {
        return inventory;
    }
}
