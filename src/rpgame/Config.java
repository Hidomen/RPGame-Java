package rpgame;

import java.awt.Font;
import javax.swing.*;

enum Classes {Archer, Healer, Mage, Warrior};
enum Status {Bleed, Burn, Dodge, Fog, Poison, Shock, Stun, TemporaryHealth};
enum EntityType {Player, Enemy};    
enum GUIState {MAIN_SCREEN, PLAYER_SELECTION, START_GAME, LOBBY, COMBAT, SHOP, INVENTORY, GAME_OVER, EXIT};
enum CombatState {PLAYER_TURN, ENEMY_TURN};

enum Colors {YELLOW, BLACK};


public class Config {
    
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    
    public static final double LEVEL_UP_HP_MULTIPLIER       = 1.3;
    public static final double LEVEL_UP_ATTACK_MULTIPLIER   = 1.4;
    public static final double LEVEL_UP_ABILITY_MULTIPLIER  = 1.4;

    public static final int HEALTH_MULTIPLIER   = 3;
    public static final int MANA_MULTIPLIER     = 2;
    public static final int ATTACK_MULTIPLIER   = 1;
    public static final int ABILITY_MULTIPLIER  = 1;

    public static final int HEALTH_M_INDEX  = 0;
    public static final int ATTACK_M_INDEX  = 1;
    public static final int ABILITY_M_INDEX = 2;
    public static final int MAXMANA_M_INDEX = 3;
    
    
    public static final int BLEED_INDEX     = 0; //At the start of the enemy's turn take damage equal to bleed. Then decrease bleed by one.
    public static final int BURN_INDEX      = 1; //Take damage equal to burn at the start of your turn.
    public static final int DODGE_INDEX     = 2; 
    public static final int FOG_INDEX       = 3; //Enemy strikes half of the damage to itself with the chance of %50
    public static final int POISON_INDEX    = 4; //Make your enemy take 2 damage for turns equal to your ability power
    public static final int SHOCK_INDEX     = 5; //Deal half damage
    public static final int STUN_INDEX      = 6; //Pass turn
    public static final int TEMP_H_INDEX    = 7; //TemporaryHealth : Lasts until enemy's turn end
    
    
    public static final java.awt.Color[] colors = {
    
        new java.awt.Color(255, 255, 0),
        new java.awt.Color(70, 70, 70),
        new java.awt.Color(180, 255, 180), //wtf is that color
        new java.awt.Color(51, 51, 51) //other black
    };
    
    
    public static final int COLOR_YELLOW = 0;
    public static final int COLOR_BLACK = 1;
    
    public static Font getFont(int size, boolean isBold){
        
        return (isBold ? new Font("Arial", Font.BOLD, size) : new Font("Arial", Font.PLAIN, size) );
    }
}    
