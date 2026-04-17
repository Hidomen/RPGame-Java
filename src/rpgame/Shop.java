package rpgame;

import static rpgame.Classes.*;

public class Shop {
    
Item[] goodies = {

    // WEAPONS
    new WeaponItem(1.3 , 1.0 , "Long Sword" , 90 , new Classes[] {Warrior}),
    new WeaponItem(1.1 , 1.2 , "Blessed Mace" , 95 , new Classes[] {Healer}),
    new WeaponItem(0.9 , 1.6 , "Arcane Wand" , 100 , new Classes[] {Mage}),
    new WeaponItem(1.4 , 0.8 , "Crossbow" , 85 , new Classes[] {Archer}),
    new WeaponItem(1.2 , 1.1 , "Battle Axe" , 110 , new Classes[] {Warrior}),
    new WeaponItem(1.0 , 1.3 , "Divine Staff" , 105 , new Classes[] {Healer , Mage}),
    new WeaponItem(1.5 , 0.7 , "Dual Daggers" , 80 , new Classes[] {Archer}),
    new WeaponItem(0.8 , 1.7 , "Crystal Orb" , 120 , new Classes[] {Mage}),
    new WeaponItem(1.3 , 0.9 , "War Hammer" , 115 , new Classes[] {Warrior , Healer}),
    new WeaponItem(1.2 , 1.0 , "Hunter Bow" , 95 , new Classes[] {Archer}),

    // ARMORS
    new ArmorItem(1.2 , "Iron Armor" , 100 , new Classes[] {Warrior}),
    new ArmorItem(1.05 , "Cloth Robe" , 60 , new Classes[] {Mage}),
    new ArmorItem(1.1 , "Holy Vestments" , 75 , new Classes[] {Healer}),
    new ArmorItem(1.1 , "Leather Armor" , 70 , new Classes[] {Archer}),
    new ArmorItem(1.4 , "Dragon Scale Armor" , 150 , new Classes[] {Warrior}),
    new ArmorItem(1.2 , "Mystic Robe" , 110 , new Classes[] {Mage , Healer}),
    new ArmorItem(1.1 , "Shadow Cloak" , 95 , new Classes[] {Archer , Mage}),
    new ArmorItem(1.3 , "Knight Plate" , 130 , new Classes[] {Warrior , Healer}),
    new ArmorItem(1.2 , "Ranger Vest" , 85 , new Classes[] {Archer}),
    new ArmorItem(1.3 , "Enchanted Armor" , 140 , new Classes[] {Warrior , Mage , Healer , Archer})
};
    
    
    int itemCount = 20;

    public Shop() {
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
