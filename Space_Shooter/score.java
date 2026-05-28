import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score=0;
    public score(){
        setImage(new GreenfootImage("SCORE:",50,Color.GREEN,Color.BLACK));
    }
    public void act()
    {
       setImage(new GreenfootImage("SCORE:"+score,50,Color.GREEN,Color.BLACK));
    }
    public void addscore(){
        score++;
    }
}
