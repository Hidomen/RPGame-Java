package rpgame;

public class Item {
    private String name;
    private int price;
    private Classes [] compability;

    private double[] modifiers = {0, 0, 0, 0};
    
    private static final int HEALTH_M_INDEX = 0;
    private static final int ATTACK_M_INDEX = 1;
    private static final int ABILITY_M_INDEX = 2;
    private static final int MAXMANA_M_INDEX = 3;
    
    public Item(String name, int price, Classes[] compability, double[] modifiers) {
        this.name = name;
        this.price = price;
        this.compability = compability;
        this.modifiers = modifiers;
    }

    public double getHealthModifier(){
        return modifiers[HEALTH_M_INDEX];
    }

    public double getAttackModifier(){
        return modifiers[ATTACK_M_INDEX];
    }

    public double getAbilityModifier(){
        return modifiers[ABILITY_M_INDEX];
    }

    public double getMaxManaModifier(){
        return modifiers[MAXMANA_M_INDEX];
    }
}
