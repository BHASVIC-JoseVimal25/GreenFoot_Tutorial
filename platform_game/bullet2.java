import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet2 extends Actor
{
    
    /**
     * Act - do whatever the bullet2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bullet2(){
        
        
        
    }
    
    public void act()
    {
        
        move(-5);
        Actor actor = getOneIntersectingObject(Mario.class);
            if (actor != null)
            {
                World myWorld = getWorld();
                myWorld.removeObject(this);
                myWorld.removeObject(actor);
            }else{
                int Xcoord=getX();
                if (Xcoord <= 1 ){
            
                World myWorld = getWorld();
                myWorld.removeObject(this);
            }
            
            }
        }
    }
            
            
    

        
      

      



