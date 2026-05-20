import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends Actor
{
    /**
     * Act - do whatever the King wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=1;
    public void act()
    {
        // Add your action code here.
    
        if (Greenfoot.isKeyDown("right")){
            turn(2);
        }
        if (Greenfoot.isKeyDown("left")){
            turn(-2);
        }
        if (Greenfoot.isKeyDown("space")){
            move(speed);
            speed=speed +1;
            
        }
        else{
            speed=1;
        }
        hitEnemy();
        youWin();
    }
    public void hitEnemy(){
        if (isTouching(enemy.class)){
            getWorld().addObject(new youLose(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin(){
        if (getY()>=680){
            getWorld().addObject(new youwin(),getX(),getY());
            Greenfoot.stop();
            
        }
    }
}
