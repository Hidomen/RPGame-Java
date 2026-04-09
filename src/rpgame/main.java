package rpgame;


import java.util.Scanner;

import static rpgame.Classes.*;


public class main {
    public static void main(){
        
        PlayerClass p = new Mage();
        p.abilityManager.addEquippedAbility(p.abilityManager.getAbility(1));
        p.abilityManager.ListEqAbilities();                
    }

    public static void test2() {
        //==============================================
        
        PlayerClass p;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Pick your class");
        System.out.println("1. Mage");
        System.out.println("2. Archer");
        System.out.println("3. Healer");
        System.out.println("4. Warrior");
        
        int ci = sc.nextInt();
        
        switch(ci){
            case 1 -> p = new Mage();
            case 2 -> p = new Archer();
            case 3 -> p = new Healer();
            case 4 -> p = new Warrior();
            default -> p = new Mage();
        }
        //==============================================
        
        Enemy e = new Enemy(1);
        Combat c = new Combat(p,e);
        c.combatLoop();

        test();

    }
    
    public static void test(){
        
        Mage p1 = new Mage();

        p1.abilityManager.ListAbilities();

        System.out.println("The chosen ability name is : " + p1.abilityManager.getAbility(0).name);
        System.out.println("The chosen ability description is : " + p1.abilityManager.getAbility(0).description);
        System.out.println("The chosen ability cost is : " + p1.abilityManager.getAbility(0).cost);
    
        System.out.println(p1.HP);

        
        p1.useAbility(p1.abilityManager.getAbility(0));
        p1.useAbility(p1.abilityManager.getAbility(1));
        p1.useAbility(p1.abilityManager.getAbility(1));
        p1.useAbility(p1.abilityManager.getAbility(1));
        p1.useAbility(p1.abilityManager.getAbility(1));
        p1.useAbility(p1.abilityManager.getAbility(1));
        p1.useAbility(p1.abilityManager.getAbility(1));
        p1.useAbility(p1.abilityManager.getAbility(1));
        
        System.out.println(p1.HP);

        Shop merchant = new Shop(5);
        Item i1 = new WeaponItem(1.2 , 1 , "Sword" , 85 , new Classes[] {Warrior , Healer});
        Item i2 = new WeaponItem(1.5 , 1 , "Bow" , 80 , new Classes[] {Archer});
        Item i3 = new WeaponItem(1 , 1.4 , "Magic Staff" , 90 , new Classes[] {Mage});
        Item i4 = new ArmorItem(1.1 , "Leather Boots" , 25 , new Classes[] {Warrior , Healer , Archer , Mage});
        Item i5 = new ArmorItem(1.5 , "Steel Plate" , 105 , new Classes[] {Warrior , Healer});
   
        merchant.AddItem(i1);
        merchant.AddItem(i2);
        merchant.AddItem(i3);
        merchant.AddItem(i4);
        merchant.AddItem(i5);
        
        merchant.ListItems();
    }
    
}
