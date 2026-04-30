package rpgame;

import java.awt.Point;

public interface GUICallback {
    
    public void setGUIState(GUIState state, Point location);
    
    //MAIN SCREEN GUI
    public void setPlayerCount(int playerCount);
    
    //COMBAT GUI
    public void combatWin();
    
    //PLAYER SELECT GUI
    public void addPlayer(PlayerClass player);
}
