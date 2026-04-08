package rpgame;

public final class Ability {
    public int ID;
    public String name;
    public String description;
    public int cost;

    public Ability(int ID, String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

}
