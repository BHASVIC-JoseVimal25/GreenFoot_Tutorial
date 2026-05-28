import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    score score=new score();
    health health=new health();
    boolean boss_level=false;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public score getscore(){
        return score;
    }
    public health gethealth(){
        return health;
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        prepare();
                                                 
    }
    public void act(){
        if(Greenfoot.getRandomNumber(120)<1){
            addenemy_1();
            
        }
        if(Greenfoot.getRandomNumber(120)<1){
            addenemy_2();
            
        }
        addboss();
    }
    public void addenemy_1(){
        addObject(new enemy_1(),Greenfoot.getRandomNumber(700),0);
    
    }
    public void addenemy_2(){
        addObject(new enemy_2(),Greenfoot.getRandomNumber(700),0);
    
    }
    public void addboss(){
        if(score.score==25 || score.score==26 ){
            if(boss_level==false){
            addObject(new boss(),Greenfoot.getRandomNumber(700),0);
            boss_level=true;
        }
        }
    }
    
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        rocket rocket = new rocket();
        addObject(rocket,185,323);
        addObject(score,79,26);
        rocket.setLocation(345,660);

        score score = new score();

        
        addObject(health,645,23);
    }
}
