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
public class InvalidNameException extends RuntimeException{
    private javax.swing.JFrame currentWindow;
    public InvalidNameException(javax.swing.JFrame currentWindow)
    {
        this.currentWindow = currentWindow;
    }
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Name is not valid, please enter a valid name.", "Invalid Name Exception", JOptionPane.WARNING_MESSAGE);
    }    
}
