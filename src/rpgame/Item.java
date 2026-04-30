package rpgame;

public class Item {
    private String name;
    private int price;
    public Classes [] compability;
    private int[] modifiers;

    
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
    

    public int getHealthModifier(){
        return modifiers[Config.HEALTH_M_INDEX];
    }

    public int getAttackModifier(){
        return modifiers[Config.ATTACK_M_INDEX];
    }

    public int getAbilityModifier(){
        return modifiers[Config.ABILITY_M_INDEX];
    }

    public int getMaxManaModifier(){
        return modifiers[Config.MAXMANA_M_INDEX];
    }
    
    @Override
    public String toString(){
        
        StringBuilder s = new StringBuilder("Modifiers => ");
        
        int healthModifier  = modifiers[Config.HEALTH_M_INDEX];
        int attackModifier  = modifiers[Config.ATTACK_M_INDEX];
        int abilityModifier = modifiers[Config.ABILITY_M_INDEX];
        int manaModifier    = modifiers[Config.MAXMANA_M_INDEX];
        
        if(0 != healthModifier){    s.append(" Health: ").append(String.format("%+d%n", healthModifier));}
        if(0 != attackModifier){    s.append(" Attack: ").append(String.format("%+d%n", attackModifier));}
        if(0 != abilityModifier){   s.append(" Ability: ").append(String.format("%+d%n", abilityModifier));}
        if(0 != manaModifier){      s.append(" Mana: ").append(String.format("%+d%n", manaModifier));}
        
        return s.toString();
    }
}
