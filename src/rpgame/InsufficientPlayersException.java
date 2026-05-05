package rpgame;

import javax.swing.JOptionPane;

public class InsufficientPlayersException extends RuntimeException {

    private final javax.swing.JFrame currentWindow;
    private final int playerCount;

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
