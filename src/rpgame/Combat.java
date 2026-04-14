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
    
    
    
    public EntityType getTurn(){
        return turn;
    }
    
    public void nextTurn(){
        
        if(EntityType.Player == turn){
            
            p.mana++;
        }

        if(EntityType.Enemy == turn){
            
            e.mana++;
        }
        
        turn = EntityType.values()[(turn.ordinal() + 1) % 2];
    }
    
    //every turn one member is focused and others will be entity vector.
    //focused.turn(entityVector). Thus, focused can be attack or heal etc. any others
    //visual stuff can show which member is targeted for that attack/sth
    public void combatLoop(){
        
        //if(p.HP <= 0 || e.HP <= 0) return;
        /*
        System.out.println("=======================================");

        System.out.print("PLAYER'S HEALTH: " + p.HP);
        System.out.println(" ENEMY'S HEALTH: " + e.HP);
        */

        switch(turn){
            
            case Player -> {
                System.out.println("PLAYER TURN");
                
                p.checkStatus();
                p.turn(e);
                p.statusFix();
                
                nextTurn();
            }

            case Enemy ->{
                System.out.println("ENEMY TURN");
                
                e.checkStatus();
                e.turn(p); 
                e.statusFix();
                
                nextTurn();
            }

        }        

        /*
        System.out.println("=======================================");
        */
    }
}
