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
    
    private String getCompability()
    {
        String a = "";
        for (Classes c : getCompabilities()) {
            a += c + " ";
        }
        return a;
    }
    
    @Override
    public String toString(){
        
        StringBuilder s = new StringBuilder("Compability: " + getCompability() + "|| Modifiers => ");
        
        int healthModifier  = modifiers[Config.HEALTH_M_INDEX];
        int attackModifier  = modifiers[Config.ATTACK_M_INDEX];
        int abilityModifier = modifiers[Config.ABILITY_M_INDEX];
        int manaModifier    = modifiers[Config.MAXMANA_M_INDEX];
        
        
        if(0 != healthModifier){    s.append(" Health: ").append(healthModifier);}
        if(0 != attackModifier){    s.append(" Attack: ").append(attackModifier);}
        if(0 != abilityModifier){   s.append(" Ability: ").append(abilityModifier);}
        if(0 != manaModifier){      s.append(" Mana: ").append(manaModifier);}
        
        return s.toString();
    }
}
