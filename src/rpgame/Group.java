package rpgame;

import java.util.ArrayList;

public class Group {
    
    private int money;
    private int size;
    
    private ArrayList<Classes> classes;
    
    private ArrayList<Item> inventory;

    private int level;
    private int XP;
    private final int xpCap;
    
    public Group(ArrayList<Classes> classes){
        
        
        this.size = classes.size();
        this.classes = classes;
        
        money = 100;
        xpCap = 100;
        level = 1;
        XP = 0;
        
        
        inventory = new ArrayList<Item>();
    }
    
    private void levelUp(){
        level++;
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
        for(int i = 0; i < size; i++){
            if(c == classes.get(i)){
                return true;
            }
        }
        
        return false;
    }
    // INVENTORY
    public void addToInventory(Item i)
    {
        inventory.add(i);
    }
    
    public void deleteFromInventory(int ind)
    {
        if (ind >= inventory.size() || ind < 0) {
            System.out.println("Invalid item index");
            return;
        }
        inventory.remove(ind);
    }
    
    public void showInventory()
    {
        if (inventory.size() <= 0) {
            System.out.println("Inv is empty!");
            return;
        }
        for (int i = 0 ; i < inventory.size() ; i++) {
            System.out.println("Item name : " + inventory.get(i).name);
            System.out.println("Item compability : " + getCompability(inventory.get(i)));
            System.out.println("---------------------------------");
        }
    }
    
    private String getCompability(Item i)
    {
        String a = "";
        for (Classes c : i.compability) {
            a += c + " ";
        }
        return a;
    }
}
