package rpgame;

public class Shop {
    Item [] goodies;
    int itemCount;

    public Shop(int itemCount) {
        goodies = new Item[itemCount];
        this.itemCount = 0;
    }
    
    public void AddItem(Item item)
    {
        if (itemCount < goodies.length) {
            goodies[itemCount] = item;
            itemCount++;
        }
        else
            System.out.println("Shop is full. Can not add another item.");
    }
    
        public void ListItems()
    {
        for (Item il : goodies) {
            
            
            if (null == goodies){
                System.out.println("1");
                return;
            }
            
            System.out.println("=====================");
            System.out.println("Item Name");
            System.out.println(il.name + "\n");
            System.out.println("Item Price : " + il.price);
            System.out.println("=====================\n");
        }
    }
    
}
