import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public rocket(){
        setRotation(270);
    }
    int delay=0;
    public void act()
    {
        // Add your action code here.
        movearound();
        fire();
        delay--;
    }
    private void movearound(){
        if(Greenfoot.isKeyDown("Left")){
            setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+3,getY());
        }
    }
    private void fire(){
        if(Greenfoot.isKeyDown("Space") && delay<=0){
            
            getWorld().addObject(new projectile(),getX(),getY()-30);
            delay=30;
        }
    }
}


