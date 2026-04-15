package rpgame;

import java.util.Scanner;

public class main {
    public static void main(){
        
        Game g = new Game(1);
        
        
    }

    
    
    public static void abilityTesting() {
        PlayerClass p = new Mage();
        
        p.abilityManager.addEqAbility(p.abilityManager.getAbility(1));
        p.abilityManager.ListAbilities(p.abilityManager.equippedAbilites);                
        p.abilityManager.addEqAbility(p.abilityManager.getAbility(2));
        p.abilityManager.addEqAbility(p.abilityManager.getAbility(4));
        p.abilityManager.addEqAbility(p.abilityManager.getAbility(5));
        p.abilityManager.ListAbilities(p.abilityManager.equippedAbilites);
        Entity e = new Enemy(2);
        System.out.println("e hp: "+e.HP);
        System.out.println("p hp: "+p.HP);
        System.out.println("p ap: "+p.abilityPower);
        System.out.println("e ap: "+e.abilityPower);
        p.useAbility(p.getAbility(2), p); //Ability listten alıyor btw
        p.useAbility(p.getAbility(2), e); //Ability listten alıyor btw
        System.out.println("p ap: "+p.abilityPower);
        System.out.println("e ap: "+e.abilityPower);        
        p.useAbility(p.getAbility(4), e);
        System.out.println("e hp: "+e.HP);
        p.useAbility(p.getAbility(5), e);
        System.out.println("e hp: "+e.HP);
        System.out.println("p hp: "+p.HP);
        
        
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
    }
    
    public static void test(){
        
        Mage p1 = new Mage();

        p1.abilityManager.ListAbilities(p1.abilityManager.abilityList);

        System.out.println("The chosen ability name is : " + p1.abilityManager.getAbility(0).name);
        System.out.println("The chosen ability description is : " + p1.abilityManager.getAbility(0).description);
        System.out.println("The chosen ability cost is : " + p1.abilityManager.getAbility(0).cost);
    
        System.out.println(p1.HP);
    }
    
}
