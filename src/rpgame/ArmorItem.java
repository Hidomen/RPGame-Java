package rpgame;

public class ArmorItem extends Item{
    private double protectionModify;

    public ArmorItem(double protectionModify, String name, int price, Classes[] compability) {
        super(name, price, compability);
        this.protectionModify = protectionModify;
    }
    
    
    //adds hp, getters setters
}
