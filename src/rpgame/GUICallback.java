package rpgame;


public interface GUICallback {
    
    
    //COMBAT GUI
    public void combatGUIEnded();
    public void gameOver();
    
    //PLAYER SELECT GUI
    public void playerSelectGUIEnded();
    public void addPlayer(PlayerClass player , String playerName);
    
    //SHOP GUI
    public void shopGUIEnded();
}
