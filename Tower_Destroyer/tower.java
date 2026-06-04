import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tower extends Actor
{
    /**
     * Act - do whatever the tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int fire=0;
    public void act()
    {
        // Add your action code here.
        enemyDetector();
        fire++;
    }
    public void enemyDetector(){
        List<enemy>enemies=getObjectsInRange(100,enemy.class);
        for(enemy eachEnemy:enemies){
            if (fire>9){
                fire=0;
                projectile projectile =new projectile();
            getWorld().addObject(projectile,getX(),getY());
            projectile.turnTowards(eachEnemy.getX(),eachEnemy.getY());
            }
            
        }
    }
}
