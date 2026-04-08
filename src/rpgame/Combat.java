package rpgame;



public class Combat {
    
    EntityType turn;
    
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
            
            switch(turn){
                case Player -> {
                    System.out.println("PLAYER TURN");
                    
                    p.turn();
                }
                case Enemy ->{
                    System.out.println("ENEMY TURN");
                    
                    e.turn();
                }
            }        
        }
    }
}
