import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    private int delay=0;
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean coins_collected=false;
    int collect=0;
    public Mario(){
        getImage().scale(getImage().getWidth(),getImage().getHeight());
    }
    public void collect(){
        Actor coin=getOneIntersectingObject(coin.class);
        if (coin!=null){
            getWorld().removeObject(coin);
            collect++;
        }
        if(collect==10 && coins_collected==false){
            
            getWorld().addObject(new portal(),1950,450);
            coins_collected=true;
            
        
        }
    }
    public void level2(){
        Actor portal=getOneIntersectingObject(portal.class);
        if (portal!=null){
            Greenfoot.setWorld(new backgroun2());;
        }
        if(collect==10 && coins_collected==false){
            
            getWorld().addObject(new portal(),1950,450);
            coins_collected=true;
            
        
        }
    }
    public void act(){
        
        move();
        check_gravitation();
        collect();
        if (getY()>=599){
            World MyWorld=getWorld();
            MyWorld.removeObject(this);
            Greenfoot.stop();
        }
        level2();
        
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
        
        
        
        
    
        if (Greenfoot.isKeyDown("space"))
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
            if (Greenfoot.isKeyDown("up"))
            {
                World myworld=getWorld();
                myworld.addObject(new bullet(),getX(),getY());
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
