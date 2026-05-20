import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        King king = new King();
        addObject(king,273,12);
        enemy enemy = new enemy();
        addObject(enemy,517,173);
        enemy enemy2 = new enemy();
        addObject(enemy2,457,126);
        enemy enemy3 = new enemy();
        addObject(enemy3,476,317);
        enemy enemy4 = new enemy();
        addObject(enemy4,172,146);
        enemy enemy5 = new enemy();
        addObject(enemy5,213,301);
        enemy.setLocation(312,210);
        enemy5.setLocation(172,314);
        king.setLocation(192,40);
        king.setLocation(95,43);
        enemy3.setLocation(595,435);
        enemy5.setLocation(134,650);
        enemy.setLocation(139,391);
        enemy4.setLocation(360,276);
        enemy2.setLocation(426,521);
        enemy enemy6 = new enemy();
        addObject(enemy6,651,263);
        enemy enemy7 = new enemy();
        addObject(enemy7,852,451);
        enemy enemy8 = new enemy();
        addObject(enemy8,713,608);
        enemy enemy9 = new enemy();
        addObject(enemy9,148,192);
        enemy enemy10 = new enemy();
        addObject(enemy10,780,103);
        enemy5.setLocation(158,535);
        enemy9.setLocation(160,153);
        enemy4.setLocation(360,229);
        enemy.setLocation(206,343);
        enemy2.setLocation(440,449);
        enemy5.setLocation(239,475);
        enemy8.setLocation(504,591);
        enemy2.setLocation(425,379);
        enemy3.setLocation(672,429);
        enemy5.setLocation(232,533);
        enemy7.setLocation(863,506);
        enemy10.setLocation(792,144);
        enemy10.setLocation(821,236);
        enemy9.setLocation(121,220);
    }
}
