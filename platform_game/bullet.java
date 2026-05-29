import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bullet(){
        
        
        
    }
    public void act()
    {
        move(5);
        
        Actor actor = getOneIntersectingObject(Mario_2.class);
        if (actor != null )
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            myWorld.removeObject(actor);
            
        }
        else{
            int Xcoord=getX();
                if (Xcoord >= 999 ){
            
                World myWorld = getWorld();
                myWorld.removeObject(this);
            }
            
            }
        }
    }
            
            
    

        
      

      



