package rpgame;

public class Inventory {
    public static final int PLAYERCOUNT = 2; 
    private Item [] inventory;
    private int invLimit = PLAYERCOUNT * 4;
    private int itemCount = 0;
    
    public Inventory() {
        inventory = new Item[invLimit];
    }
    
    public void addToInventory(Item i)
    {
        if (itemCount >= invLimit) {
            System.out.println("Inventory is full. You can't add another item");
            return;
        }
        inventory[itemCount++] = i;
    }
    
    public void deleteFromInventory(int ind)
    {
        if (ind >= itemCount || ind < 0) {
            System.out.println("Invalid item index");
            return;
        }
        for (;  ind < itemCount-1; ind++) {
            inventory[ind] = inventory[ind+1];
        }
        inventory[ind] = null;
        itemCount--;
    }
    
    public void showInventory()
    {
        if (itemCount <= 0) {
            System.out.println("Inv is empty!");
            return;
        }
        for (int i = 0 ; i < itemCount ; i++) {
            System.out.println("Item name : " + inventory[i].name);
            System.out.println("Item compability : " + getCompability(inventory[i]));
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
