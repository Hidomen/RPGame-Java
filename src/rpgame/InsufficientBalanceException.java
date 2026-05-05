package rpgame;

import javax.swing.JOptionPane;

public class InsufficientBalanceException extends RuntimeException{
    
    private final javax.swing.JFrame currentWindow;
    private final String itemName;
    
    public InsufficientBalanceException(javax.swing.JFrame currentWindow , String itemName)
    {
        this.currentWindow = currentWindow;
        this.itemName = itemName;
    }
    
    
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Balance is insufficient to buy the item : " + itemName, "Insufficient Balance Exception", JOptionPane.WARNING_MESSAGE);
    }    
}
