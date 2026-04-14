package rpgame;



public class Combat {
    
    EntityType turn;
    boolean stunned = false;
    PlayerClass p;
    Enemy e;
    
    Combat(PlayerClass p, Enemy e){
        turn = EntityType.Player;
        
        this.p = p;
        this.e = e;
    }
    
    
    //every turn one member is focused and others will be entity vector.
    //focused.turn(entityVector). Thus, focused can be attack or heal etc. any others
    //visual stuff can show which member is targeted for that attack/sth
    public void combatLoop(){
        
        while(p.HP > 0 && e.HP > 0){
            turn = EntityType.values()[(turn.ordinal() + 1) % 2];
            
            System.out.println("=======================================");
            
            System.out.print("PLAYER'S HEALTH: " + p.HP);
            System.out.println(" ENEMY'S HEALTH: " + e.HP);
            
            
            switch(turn){
                case Player -> {
                    System.out.println("PLAYER TURN");
                    System.out.println("Checking Status");
                    p.useAbility(p.abilityManager.getAbility(4), e);
                }
                case Enemy ->{
                    System.out.println("ENEMY TURN");
                    
                    e.turn(p); 

                }
            }        
            
            
            System.out.println("=======================================");
        }
        System.out.println("combat loop ended");
    }
}
