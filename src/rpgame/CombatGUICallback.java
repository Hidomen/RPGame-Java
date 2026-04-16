package rpgame;


public interface CombatGUICallback {
    
    
    public CombatState getCombatState();
    public void setCombatState(CombatState combatState);
    
    public void useAbility(PlayerClass player, int abilityIndex, Entity target);
    
    public void enemyTurn(int index);
}
