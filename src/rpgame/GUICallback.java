package rpgame;


public interface GUICallback {
    
    
    public void setGUIState(GUIState state);
    
    public void setPlayerCount(int playerCount);
    
    //COMBAT GUI
    public void gameOver();
    
    //PLAYER SELECT GUI
    public void addPlayer(PlayerClass player);

    
    
}
