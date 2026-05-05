package rpgame;

import javax.swing.JOptionPane;

public class ClassIsNotSelectedException extends RuntimeException {
    
    private static javax.swing.JFrame currentWindow;
    
    public ClassIsNotSelectedException(javax.swing.JFrame currentWindow)
    {
        this.currentWindow = currentWindow;
    }
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "In order to create a character a class must be seletected.", "Class Is Not Selected Exception", JOptionPane.WARNING_MESSAGE);
    }
}
