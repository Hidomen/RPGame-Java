package rpgame;
import javax.swing.JOptionPane;


public class InvalidNameException extends RuntimeException{
    
    private final javax.swing.JFrame currentWindow;
    
    public InvalidNameException(javax.swing.JFrame currentWindow)
    {
        this.currentWindow = currentWindow;
    }
    
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Name is not valid, please enter a valid name.", "Invalid Name Exception", JOptionPane.WARNING_MESSAGE);
    }    
}
