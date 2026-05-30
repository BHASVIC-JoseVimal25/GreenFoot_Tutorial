import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class day here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class day extends Actor
{
    /**
     * Act - do whatever the day wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    public day(MyWorld world){
        getImage().scale(100,100);
        getImage().clear();
        this.world=world;
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)&& world.color!=null){
            getImage().setColor(world.color);
            getImage().fillRect(0,0,100,100);
    }
}
}
