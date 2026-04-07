package rpgame;

public class main {
    
    public static void main(){
        ClassAbilityList mageList = new ClassAbilityList(3);
        Abilities a1 = new Abilities("Fireball" , "Throw a huge fireball to the enemy. Be carefull you may hurt your loved ones." , 7);
        Abilities a2 = new Abilities("Stun'em" , "With using electric make your opponents studder" , 3);
        Abilities a3 = new Abilities("PlaceHolder" , "This place is being hold by this ability" , 1);
        
        Mage p1 = new Mage(mageList);
        
        // Creating a mage here with empty or not filled ability list results with an arror. //
        // Should convert our array ability lists to vectors. //
        mageList.AddAbility(a1);
        mageList.AddAbility(a2);
        mageList.AddAbility(a3);
        
        mageList.ListAbilities();


        System.out.println("The chosen ability name is : " + mageList.pickAbility(0).name);
        System.out.println("The chosen ability description is : " + mageList.pickAbility(0).description);
        System.out.println("The chosen ability cost is : " + mageList.pickAbility(0).cost);
    }
    
}
