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
    int world_time=0;
    public static int money =100;
    int basictowerprice=50;
    int waveNumber=1;
    int map[][]={
            {1,0,0,0,0,0,0,0,0,0},
            {1,0,0,0,0,0,0,0,0,0},
            {3,1,2,0,0,0,0,0,0,0},
            {0,0,3,2,0,0,0,0,0,0},
            {0,0,0,1,0,0,3,1,1,2},
            {0,0,0,1,0,0,1,0,0,1},
            {0,0,0,1,0,0,1,0,0,1},
            {0,0,0,3,1,1,4,0,0,1},
            {0,0,0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,1},
        };

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1); 
        menu menu = new menu();
        addObject(menu,720,300);
        addObject(new MoneyDisplay(),720,30);
        level1();

        prepare();
    }

    public void act(){
        addInTowers();

        money++;
        world_time++;
        spawnWave();
    }
    public void spawnWave(){
        if(world_time%20==0){
            addObject(new enemy(waveNumber),1,1);
        }
        
        if(world_time%400==399){
            waveNumber++;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void level1()
    {
        for(int i=0;i<10;i++)
            for(int j =0;j<10;j++){
                if(map[j][i]==1){
                    addObject(new road(true),30+ i *60,30+ j *60);
                }
                if(map[j][i]==2){
                    addObject(new road(90),30+ i *60,30+ j *60);
                }
                if(map[j][i]==3){
                    addObject(new road(0),30+ i *60,30+ j *60);
                }
                if(map[j][i]==4){
                    addObject(new road(270),30+ i *60,30+ j *60);
                }
                if(map[j][i]==5){
                    addObject(new road(180),30+ i *60,30+ j *60);
                }
            }
    }

    public void addInTowers(){
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && money>=basictowerprice){
            addObject(new tower(),Greenfoot.getMouseInfo().getX()/60 *60 +30,Greenfoot.getMouseInfo().getY()/60 *60 +30); 
            money=money-basictowerprice;
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        enemy enemy = new enemy(waveNumber);
        addObject(enemy,11,29);
    }
}
