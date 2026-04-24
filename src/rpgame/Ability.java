package rpgame;

public final class Ability {
    
    private int ID;
    private String name;
    private String description;
    private int cost;
    

    public Ability(int ID, String name, String description, int cost) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    //==========================================================================
    // Getters
    //==========================================================================
    public int getID(){
        return ID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public int getCost(){
        return cost;
    }
}
