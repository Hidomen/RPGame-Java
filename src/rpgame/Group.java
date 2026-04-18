package rpgame;

import java.util.ArrayList;

public class Group {
    
    private int money;
    private int size;
    
    private ArrayList<Classes> classes;
    
    private ArrayList<Item> inventory;
    private int invLimit;
    
    public Group(int money, ArrayList<Classes> classes){
        
        this.money = money;
        this.size = classes.size();
        this.classes = classes;
        
        
        inventory = new ArrayList<Item>();
        invLimit = size * 4;
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
        if (inventory.size() >= invLimit) {
            System.out.println("Inventory is full. You can't add another item");
            return;
        }
        inventory.add(i);
    }
    
    public void deleteFromInventory(int ind)
    {
        if (ind >= inventory.size() || ind < 0) {
            System.out.println("Invalid item index");
            return;
        }
        inventory.remove(ind);
        /*
        for (;  ind < inventory.size()-1; ind++) {
            inventory[ind] = inventory[ind+1];
        }
        inventory[ind] = null;
        itemCount--;
        */
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
