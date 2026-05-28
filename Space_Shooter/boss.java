import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss extends enemy
{
    int lives=10;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+1);
        
        hitByProjectile();
        
    }
    public void hitByProjectile(){
        Actor projectile=getOneIntersectingObject(projectile.class);
        if (projectile!=null){
            getWorld().removeObject(projectile);
            lives--;
            
        }
        if(lives==0 || getY()>680){
            
             World world=getWorld();
            MyWorld myWorld=(MyWorld)world;
            score score=myWorld.getscore();
            if (getY()<680){
                score.addscore();
            }
            
            health health=myWorld.gethealth();

            health.losehealth();
            
            getWorld().removeObject(this);
        }
    }
}
