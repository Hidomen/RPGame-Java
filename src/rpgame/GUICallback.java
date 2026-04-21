package rpgame;


public interface GUICallback {
    
    
    public void setGUIState(GUIState state);
    
    //COMBAT GUI
    public void gameOver();
    
    //PLAYER SELECT GUI
    public void addPlayer(PlayerClass player);
    
    
}
