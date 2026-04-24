package rpgame;

public class WeaponItem extends Item{
    protected double attackModify;
    protected double abilityModfiy;
    
    public WeaponItem(double attackModify, double abilityModfiy, String name, int price, Classes[] compability) {
        super(name, price, compability);
        this.attackModify = attackModify;
        this.abilityModfiy = abilityModfiy;
    }
}
