import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class smart_enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class smart_enemy extends Actor
{
    /**
     * Act - do whatever the smart_enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public smart_enemy(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    int speed=2;
    public void act()
    {
        setLocation(getX()+speed,getY());
        if (isTouching(wall.class)== true){
            speed=-speed;
            GreenfootImage img=getImage();
            img.mirrorHorizontally();
            setImage(img);
        }
    }
    
}
