package rpgame;

public class main {
    
    public static void main(){

        
        Mage p1 = new Mage();
        
        // Creating a mage here with empty or not filled ability list results with an arror. //
        // Should convert our array ability lists to vectors. //
        
        
        
        p1.abilityManager.ListAbilities();

        System.out.println("The chosen ability name is : " + p1.abilityManager.pickAbility(0).name);
        System.out.println("The chosen ability description is : " + p1.abilityManager.pickAbility(0).description);
        System.out.println("The chosen ability cost is : " + p1.abilityManager.pickAbility(0).cost);
    
        System.out.println(p1.HP);

        
        p1.useAbility(p1.abilityManager.pickAbility(0));
        p1.useAbility(p1.abilityManager.pickAbility(1));
        
        System.out.println(p1.HP);
        
    }
    
}
