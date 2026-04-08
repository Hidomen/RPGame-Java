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
    
    
    
    public void initCombat(){
        
        while(p.HP > 0 && e.HP > 0){
            turn = EntityType.values()[(turn.ordinal() + 1) % 2];
            
            switch(turn){
                case Player -> {
                    System.out.println("PLAYER TURN");
                }
                case Enemy ->{
                    System.out.println("ENEMY TURN");
                    e.turn();
                }
            }        
        }
    }
}
