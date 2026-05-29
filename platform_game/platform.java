import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platform extends Actor
{
    public platform(){
        getImage().scale(getImage().getWidth()*5,getImage().getHeight()*2);
    }
    /**
     * Act - do whatever the platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("right"))
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move(4);
        }
        if(getX()==0){
            setLocation(getWorld().getWidth()-1,getY());
        }
    }
}
