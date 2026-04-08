package rpgame;

public class main {
    public static void main(){
        
        Shop merchant = new Shop(5);
        Item i1 = new WeaponItem(1.2 , 1 , "Sword" , 85 , new Classes[] {Classes.Warrior , Classes.Healer});
        Item i2 = new WeaponItem(1.5 , 1 , "Bow" , 80 , new Classes[] {Classes.Archer});
        Item i3 = new WeaponItem(1 , 1.4 , "Magic Staff" , 90 , new Classes[] {Classes.Mage});
        Item i4 = new ArmorItem(1.1 , "Leather Boots" , 25 , new Classes[] {Classes.Warrior , Classes.Healer , Classes.Archer , Classes.Mage});
        Item i5 = new ArmorItem(1.5 , "Steel Plate" , 105 , new Classes[] {Classes.Warrior , Classes.Healer});
   
        merchant.AddItem(i1);
        merchant.AddItem(i2);
        merchant.AddItem(i3);
        merchant.AddItem(i4);
        merchant.AddItem(i5);
        
        merchant.ListItems();
    }
    
}
