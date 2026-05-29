import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud extends Actor
{
    /**
     * Act - do whatever the cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cloud(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("Left")){
            move(1);
        }
        if(Greenfoot.isKeyDown("Right")){
            move(-1);
        }
        
        if(getX()==0){
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(170)+30);
        }
    }
}
