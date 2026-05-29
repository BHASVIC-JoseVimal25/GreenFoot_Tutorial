import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backgroun2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backgroun2 extends World
{

    /**
     * Constructor for objects of class backgroun2.
     * 
     */
    public backgroun2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        platform platform = new platform();
        addObject(platform,184,458);
        platform platform2 = new platform();
        addObject(platform2,498,217);
        platform platform3 = new platform();
        addObject(platform3,867,431);
        platform platform4 = new platform();
        addObject(platform4,1096,103);
        coin coin = new coin();
        addObject(coin,1104,60);
        Mario mario = new Mario();
        addObject(mario,179,400);
        platform platform5 = new platform();
        addObject(platform5,304,446);
        platform5.setLocation(340,453);
        platform5.setLocation(332,454);
        platform5.setLocation(397,447);
        platform platform6 = new platform();
        addObject(platform6,397,447);
        platform6.setLocation(438,455);
        platform.setLocation(244,455);
        platform.setLocation(192,454);
        platform2.setLocation(578,400);
        platform3.setLocation(762,342);
        platform4.setLocation(1197,172);
        coin.setLocation(1204,136);
        platform5.setLocation(295,448);
        platform5.setLocation(316,462);
        game_over game_over = new game_over();
        addObject(game_over,792,489);
        game_over.setLocation(760,510);
    }
    
}
