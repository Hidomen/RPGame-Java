package rpgame;

public abstract class Abilities {
    protected String abilityName;
    protected String abilityDescription;
    protected int abilityCost;


    public void ListAbilities(Abilities [] abArr)
    {
        for (Abilities abArr1 : abArr) {
            System.out.println("\n Ability Name");
            System.out.println("== " + abArr1.abilityName + " == ¨\n");
            System.out.println(" Ability Description");
            System.out.println(abArr1.abilityDescription + "\n");
            System.out.println("Ability Cost : " + abArr1.abilityCost);
        }
    }
}
