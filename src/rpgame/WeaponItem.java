package rpgame;

public class WeaponItem extends Item{
    private double attackModify;
    private double abilityModfiy;
    
    public WeaponItem(double attackModify, double abilityModfiy, String name, int price, Classes[] compability) {
        super(name, price, compability);
        this.attackModify = attackModify;
        this.abilityModfiy = abilityModfiy;
    }
    
    //adds attack, abiility pow., mana; getters, setters
}
