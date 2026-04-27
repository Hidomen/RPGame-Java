package rpgame;

enum Classes {Archer , Healer , Mage , Warrior};
enum Status {Bleed , Burn , Dodge , Fog , Poison , Shock , Stun , TemporaryHealth};
enum EntityType {Player , Enemy};    
enum GUIState {MAIN_SCREEN, PLAYER_SELECTION, START_GAME, LOBBY, COMBAT, SHOP, INVENTORY, GAME_OVER, EXIT};
enum CombatState {PLAYER_TURN, ENEMY_TURN};



class Config{
    //refactor
    public static final int HEALTH_MULTIPLIER = 3;
    public static final int MANA_MULTIPLIER = 2;
    public static final int ATTACK_MULTIPLIER = 1;
    public static final int ABILITY_MULTIPLIER = 1;

    public static final int HEALTH_M_INDEX = 0;
    public static final int ATTACK_M_INDEX = 1;
    public static final int ABILITY_M_INDEX = 2;
    public static final int MAXMANA_M_INDEX = 3;
}    
