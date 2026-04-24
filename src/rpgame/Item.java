package rpgame;

public class Item {
    protected String name;
    protected int price;
    protected Classes [] compability;

    
    public Item(String name, int price, Classes[] compability) {
        this.name = name;
        this.price = price;
        this.compability = compability;
    }
}
