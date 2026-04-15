package rpgame;

import static rpgame.Classes.*;

public class Shop {
    
    Item[] itemLib = {
      
        new WeaponItem(1.2 , 1 , "Sword" , 85 , new Classes[] {Warrior , Healer}),
        new WeaponItem(1.5 , 1 , "Bow" , 80 , new Classes[] {Archer}),
        new WeaponItem(1 , 1.4 , "Magic Staff" , 90 , new Classes[] {Mage}),
        new ArmorItem(1.1 , "Leather Boots" , 25 , new Classes[] {Warrior , Healer , Archer , Mage}),
        new ArmorItem(1.5 , "Steel Plate" , 105 , new Classes[] {Warrior , Healer})
    };
    
    Item [] goodies = {/*ITEMS ARE GOING TO BE SETTED HERE*/
    
    
    
    
    };
    
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
        else {
            System.out.println("Shop is full. Can not add another item.");
        }
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
