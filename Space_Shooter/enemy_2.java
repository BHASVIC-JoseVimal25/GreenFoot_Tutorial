import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_2 extends enemy
{
    /**
     * Act - do whatever the enemy_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int lives=2;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+2);
        
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

