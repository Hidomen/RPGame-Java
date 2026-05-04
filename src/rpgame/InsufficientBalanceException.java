/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgame;

import javax.swing.JOptionPane;

/**
 *
 * @author ALİ EVREN
 */
public class InsufficientBalanceException extends RuntimeException{
    private javax.swing.JFrame currentWindow;
    private String itemName;
    public InsufficientBalanceException(javax.swing.JFrame currentWindow , String itemName)
    {
        this.currentWindow = currentWindow;
        this.itemName = itemName;
    }
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Balance is insufficient to buy the item : " + itemName, "BALANCE EXCEPTION", JOptionPane.WARNING_MESSAGE);
    }    
}
