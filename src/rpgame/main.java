package rpgame;

public class main {
    public static void main(){
        
        Mage p0 = new Mage();
        
        // Creating a mage here with empty or not filled ability list results with an arror. //
        // Should convert our array ability lists to vectors. //
        
        Enemy e = new Enemy(1);
        Combat c = new Combat(p0,e);
        c.combatLoop();
                
        
        
        
    }
    
    public static void test(){
        
        Mage p1 = new Mage();

        p1.abilityManager.ListAbilities();

        System.out.println("The chosen ability name is : " + p1.abilityManager.pickAbility(0).name);
        System.out.println("The chosen ability description is : " + p1.abilityManager.pickAbility(0).description);
        System.out.println("The chosen ability cost is : " + p1.abilityManager.pickAbility(0).cost);
    
        System.out.println(p1.HP);

        
        p1.useAbility(p1.abilityManager.pickAbility(0));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        
        System.out.println(p1.HP);

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
