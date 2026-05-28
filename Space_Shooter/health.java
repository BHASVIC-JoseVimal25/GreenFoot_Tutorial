import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health extends Actor
{
    /**
     * Act - do whatever the health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health=20;
    int healthBarWidth=80;
    int healthBarHeight=10;
    int pixelsPerHealthPoint=(int)healthBarWidth/health;
    public health(){
        update();
    }
    public void act()
    {
        // Add your action code here.
        update();
        youLose();
    }
    public void update(){
        setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
        GreenfootImage myImage=getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
    }
    public void losehealth(){
        health--;
    }
    public void youLose(){
        if (health==0){
            getWorld().addObject(new youlose(),350,350);
            Greenfoot.stop();
    }
}
}
