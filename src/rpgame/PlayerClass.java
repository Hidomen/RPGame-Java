package rpgame;

//import java.util.Scanner;

public abstract class PlayerClass extends Entity{

    protected int money;
    
    protected int level;
    protected int XP;
    protected final int xpCap;

    protected int abilityCap;
    
    
    PlayerClass(Ability[] abilityList, int abilityCap){
        
        super(); //necessary?
        
        xpCap = 100;
        level = 1;
        XP = 0;
        money = 0;
        
        this.abilityCap = abilityCap;
        
        abilityManager = new AbilityManager(abilityList, abilityCap);
    }

    /*
    public void turn(Enemy e){
        
        if(checkStatus()) return;
        
        //for debug
        System.out.println("PLAYER ATTACKED THE ENEMY, gives " + attackPower + " damage.");
        attack(e);
    
        int input; //for console version
        Scanner sc = new Scanner(System.in);
        
        System.out.println("0 for ability 1, 1 for 2, 2 for 3");
        //print action options
        
 
        input = sc.nextInt();
        
        Entity target = new Enemy(1); //TEMPORARY
        System.out.println(input);

        useAbility(getAbility(input));
        
    }
    */


    
    private void levelUp(){
        level++;
    }

    
    public void gainXP(int xp){
        this.XP += xp;
        
        if(this.XP >= xpCap){
            levelUp();
            
            this.XP -= xpCap;
        }
        
    }
    
    
    
}
