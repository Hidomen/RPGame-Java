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
public class InvalidPlayerCountException extends RuntimeException {
    public javax.swing.JFrame currentWindow;

    public InvalidPlayerCountException(JFrame currentWindow) {
        this.currentWindow = currentWindow;
    }
    
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Invalid number of players!", "Invalid Player Count Exception", JOptionPane.WARNING_MESSAGE);

    }
    
}
