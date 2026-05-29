import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario_2 extends Actor
{
    private int delay=0;

    /**
     * Act - do whatever the Mario_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   

    public Mario_2(){
        getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);
    }
    
    public void act(){
        
        move();
        check_gravitation();
        int Ycoord=getY();
        if (Ycoord>=599){
            World MyWorld=getWorld();
            MyWorld.removeObject(this);
            Greenfoot.stop();
            
            
        }
        
        
    }
    private int xspeed=0;
    private int gravity=1;
    private int jumpheight=-6;
    
    

    
    public void gravitation(){
        setLocation(getX(),getY() + xspeed);
        xspeed=xspeed+gravity;
    
    }
    
    public void move()
    {
        
        
        
        if (Greenfoot.isKeyDown("d"))
        {
            move(5);
            
        }
        if (Greenfoot.isKeyDown("a"))
        {
            move(-5);
            
        }
    
        if (Greenfoot.isKeyDown("s"))
        {
            xspeed=jumpheight;
            gravitation();
            
            
        }
        if (delay>0)
        {
            delay=delay-1;
        }
        else
        {
            if (Greenfoot.isKeyDown("w"))
            {
                World myworld=getWorld();
                myworld.addObject(new bullet2(),getX(),getY());
                delay=25;
            
            
            }
        }
        
        
        
    }
    boolean check_on_ground(){
        
        Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2,platform.class);
        return under != null;
        //needed some help from online to get a more reliable way of making actor stay on platform
    }
    public void check_gravitation(){
        if (check_on_ground() ==false){
            gravitation();
        }
    }
    
    
}
