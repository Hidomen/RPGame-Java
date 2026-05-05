package rpgame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class InvalidPlayerCountException extends RuntimeException {
    
    private final javax.swing.JFrame currentWindow;

    public InvalidPlayerCountException(JFrame currentWindow) {
        this.currentWindow = currentWindow;
    }
    
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Invalid number of players!", "Invalid Player Count Exception", JOptionPane.WARNING_MESSAGE);

    }
      
}
