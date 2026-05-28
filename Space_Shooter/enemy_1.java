import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_1 extends enemy
{
    /**
     * Act - do whatever the enemy_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemy_1(){
        setRotation(90);
    }
    public void act()
    {
        setLocation(getX(),getY()+2);
        
        
        if (getY() <680){
            hit();
        }
        else{
            remove_enemy();
        }
    }
    public void hit(){
    Actor projectile=getOneIntersectingObject(projectile.class);
        if (projectile != null){
            getWorld().removeObject(projectile);
            
            World world=getWorld();
            MyWorld myWorld=(MyWorld)world;
            score score=myWorld.getscore();
            score.addscore();
            getWorld().removeObject(this);
        }
        
        
    }
}
