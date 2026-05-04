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
public class ClassIsNotSelectedException extends RuntimeException {
    private javax.swing.JFrame currentWindow;
    public ClassIsNotSelectedException(javax.swing.JFrame currentWindow)
    {
        this.currentWindow = currentWindow;
    }
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "In order to create a character a class must be seletected.", "Class Is Not Selected Exception", JOptionPane.WARNING_MESSAGE);
    }
}
