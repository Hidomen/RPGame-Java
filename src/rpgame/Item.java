package rpgame;

public class Item {
    private String name;
    private int price;
    private Classes [] compability;
    private int[] modifiers = {0, 0, 0, 0};

    
    public Item(String name, int price, Classes[] compability, int[] modifiers) {
        this.name = name;
        this.price = price;
        this.compability = compability;
        this.modifiers = modifiers;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public Classes[] getCompabilities()
    {
        return compability;
    }

    public double getHealthModifier(){
        return modifiers[Config.HEALTH_M_INDEX];
    }

    public double getAttackModifier(){
        return modifiers[Config.ATTACK_M_INDEX];
    }

    public double getAbilityModifier(){
        return modifiers[Config.ABILITY_M_INDEX];
    }

    public double getMaxManaModifier(){
        return modifiers[Config.MAXMANA_M_INDEX];
    }
}
