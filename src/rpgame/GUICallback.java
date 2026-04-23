package rpgame;


public interface GUICallback {
    
    public void setGUIState(GUIState state);
    
    //MAIN SCREEN GUI
    public void setPlayerCount(int playerCount);
    
    //COMBAT GUI
    public void gameOver();
    public void combatWin();
    
    //PLAYER SELECT GUI
    public void addPlayer(PlayerClass player);
}
