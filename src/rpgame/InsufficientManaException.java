/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ALİ EVREN
 */
public class InsufficientManaException extends RuntimeException{
    private javax.swing.JFrame currentWindow;
    private int mana;
    private int spellCost;
    public InsufficientManaException(JFrame currentWindow , int mana, int spellCost) {
        this.currentWindow = currentWindow;
        this.mana = mana;
        this.spellCost = spellCost;
        
    }
    
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Mana is not enough to cast this spell \nMana : " + mana +" \nSpell Cost : " + spellCost , "Insufficient Mana Exception" , JOptionPane.WARNING_MESSAGE);
    }
}
