package rpgame;

import java.util.Scanner;

public abstract class PlayerClass extends Entity{

    protected int money;
    
    protected int level;
    protected int xp;
    protected final int xpCap;

    
    int abilityCap;
    
    
    PlayerClass(Ability[] abilityList, int abilityCap){
        
        xpCap = 100;
        level = 1;
        xp = 0;
        money = 0;
        
        this.abilityCap = abilityCap;
        
        abilityManager = new AbilityManager(abilityList, abilityCap);
    }

    
    public void turn(Enemy e){
        
        if(checkStatus()) return;
        
        //for debug
        System.out.println("PLAYER ATTACKED THE ENEMY, gives " + attackPower + " damage.");
        attack(e);
        
        
        /*
        int input; //for console version
        Scanner sc = new Scanner(System.in);
        
        System.out.println("0 for ability 1, 1 for 2, 2 for 3");
        //print action options
        
        
        
        input = sc.nextInt();
        
        Entity target = new Enemy(1); //TEMPORARY
        System.out.println(input);

        useAbility(getAbility(input));
        */

    }

    
    private void levelUp(){
        level++;
    }

    
    public void gainXP(int xp){
        this.xp += xp;
        
        if(this.xp >= xpCap){
            levelUp();
            
            this.xp -= xpCap;
        }
        
    }
    
    
    
}
