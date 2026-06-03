import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    String name;
    public button(String name){
        this.name=name;
        setImage(new GreenfootImage(name,30,Color.BLACK,Color.WHITE));
    }
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage(name,30,Color.BLACK,Color.WHITE));
    }
}
