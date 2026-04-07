/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgame;

/**
 *
 * @author HP
 */


public class Archer extends PlayerClass {
    
    
    Archer(){ //can 20, mana 5, attack 10
        super();
        
        maxHP = healthMulti * 14;
        mana = manaMulti * 5;
        attackPower = attackMulti * 10;
        
        HP = maxHP;

    }
    
    //dodge ability
}
