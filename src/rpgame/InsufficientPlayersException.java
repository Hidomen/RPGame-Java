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
public class InsufficientPlayersException extends RuntimeException {
    private javax.swing.JFrame currentWindow;
    private int playerCount;
    public InsufficientPlayersException(javax.swing.JFrame currentWindow , int playerCount)
    {
        this.playerCount = playerCount;
        this.currentWindow = currentWindow;
    }
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "In order to start the game you must fulfill the group. Group must contain " + playerCount + " players. ", "Insufficient Players Exception", JOptionPane.WARNING_MESSAGE);
    }        
}
