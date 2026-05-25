import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner extends Actor
{
    /**
     * Act - do whatever the runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=2;
    public runner(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        youWin();
        hit_food();
        teleport();
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
            if (hit_wall()==true){
               setLocation(getX()-speed,getY()); 
            }
            if (hit_enemy()==true){
                getWorld().addObject(new youLose(),getX(),getY());
               getWorld().removeObject(this);
               Greenfoot.stop();
            }
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
            if (hit_wall()==true){
               setLocation(getX()+speed,getY()); 
            }
            if (hit_enemy()==true){
                getWorld().addObject(new youLose(),getX(),getY());
               getWorld().removeObject(this);
               Greenfoot.stop();
            }
        }
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
            if (hit_wall()==true){
               setLocation(getX(),getY()+speed); 
            }
            if (hit_enemy()==true){
               getWorld().addObject(new youLose(),getX(),getY());
               getWorld().removeObject(this);
               Greenfoot.stop();
            }
            
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
            if (hit_wall()==true){
               setLocation(getX(),getY()-speed); 
            }
            if (hit_enemy()==true){
               getWorld().addObject(new youLose(),getX(),getY());
               getWorld().removeObject(this);
               Greenfoot.stop();
            }
            
        }
        
    }
    public boolean hit_wall(){
        if(isTouching(wall.class)){
            return true;
        }
        else{
            return false;
        }
    
    }
    public boolean hit_enemy(){
        if(isTouching(enemy.class) || isTouching(smart_enemy.class)){
            return true;
        }
        else{
            return false;
        }
    
    }
    public void hit_food(){
        if (getOneIntersectingObject(food.class)!=null){
            getWorld().removeObject(getOneIntersectingObject(food.class));
            speed++;
        }
    }
    public void teleport(){
        if (getOneIntersectingObject(teleporter.class)!=null){
            this.setLocation(218,261);
            getWorld().removeObject(getOneIntersectingObject(teleporter.class));
            
        }
    }
    
    public void youWin(){
        if (getY()>=650){
            getWorld().addObject(new youwin(),getX(),getY());
            Greenfoot.stop();
            
        }
    }
    
}
