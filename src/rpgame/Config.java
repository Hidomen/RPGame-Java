package rpgame;

enum Classes {Archer , Healer , Mage , Warrior};
enum Status {Bleed , Burn , Dodge , Fog , Poison , Shock , Stun , TemporaryHealth};
enum EntityType {Player , Enemy};


class Config{
    public static int health = 3;
    public static int mana = 2;
    public static int attack = 1;
    public static int ability = 1;
}    