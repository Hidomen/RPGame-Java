package rpgame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InsufficientManaException extends RuntimeException{
    
    private final javax.swing.JFrame currentWindow;
    private final int mana;
    private final int spellCost;
    
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
