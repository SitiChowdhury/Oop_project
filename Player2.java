
package project_oop;

public class Player2  extends Player1{
     
    private int health;
    private boolean red_locket;

    public Player2(String name,String weapon,int health, boolean armour) {
        super(name,weapon,health);
        this.health = health;
        this.red_locket = red_locket;
    }
    @Override
    public void damageByGun1() {
        if(red_locket){
            this.health -= 20;
            if(this.health <=0) this.health = 0;
            System.out.println("Red_locket is on. Got hit by gun 1. Health is reduced by 20." +
                    "New health is "+ this.health);
        } if(!red_locket){
            this.health -= 30;
            if(this.health <=0) this.health = 0;
            System.out.println("Red_locket is off. Got hit by gun 1. Health is reduced by 30." +
                    "New health is "+ this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead");
        }
    }
    @Override
    public void damageByGun2() {
        if(red_locket){
            this.health -= 40;
            if(this.health <=0) this.health = 0;
            System.out.println("Red_locket is on. Got hit by gun 1. Health is reduced by 40." +
                    "New health is "+ this.health);
        } if(!red_locket){
            this.health -= 50;
            if(this.health <=0) this.health = 0;
            System.out.println("Red_locket is off. Got hit by gun 1. Health is reduced by 50." +
                    "New health is "+ this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead");
        }
    }
     @Override
    public void heal() {
        super.heal();
    }
    
    
    
}

