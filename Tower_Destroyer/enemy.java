import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int health=5;
    public enemy(int level){
        setRotation(90);
        if(level==1){
            setImage("spider.png");
        }
        else{
            setImage("snake2.png");
        }
    }
    public void act()
    {
        // Add your action code here.
        move_along();
        hit();
        remove();
    }
    MyWorld game;
    public void move_along(){
        move(2);
        List<road>road90=getObjectsAtOffset(-30,0,road.class);
        for( road roads:road90){
            if(roads.straight==false && getRotation()==0){
                setRotation(roads.turn);
            }
        }
        List<road>road0=getObjectsAtOffset(0,-30,road.class);
        for( road roads:road0){
            if(roads.straight==false && getRotation()==90){
                setRotation(roads.turn);
            }
        }
        List<road>road180=getObjectsAtOffset(-0,30,road.class);
        for( road roads:road180){
            if(roads.straight==false && getRotation()==270){
                setRotation(roads.turn);
            }
        }
        List<road>road270=getObjectsAtOffset(30,0,road.class);
        for( road roads:road270){
            if(roads.straight==false && getRotation()==180){
                setRotation(roads.turn);
            }
        }
    }
    public void hit(){
        Actor projectile=getOneIntersectingObject(projectile.class);
        if(projectile!=null){
            health--;
            getWorld().removeObject(projectile);
            
        }
    }
    public void remove(){
        if(health==0){
            game.money+=50;
            getWorld().removeObject(this);
            
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
