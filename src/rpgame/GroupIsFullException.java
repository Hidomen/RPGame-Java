package rpgame;

import javax.swing.JOptionPane;

public class GroupIsFullException extends RuntimeException {
    
    private static javax.swing.JFrame currentWindow;
    
    public GroupIsFullException(javax.swing.JFrame currentWindow)
    {
        this.currentWindow = currentWindow;
    }
    public void message()
    {
        JOptionPane.showMessageDialog(currentWindow, "Group is full, player couldn't add.", "GROUP EXCEPTION", JOptionPane.WARNING_MESSAGE);
    }
}
