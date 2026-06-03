import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean infected=false;
    
    int recoveryTime=0;
    int infectRadius=20;
    
    
    MyWorld world;
    public person()
    {
        // Add your action code here.
        getImage().scale(40,40);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void movement(){
        move(4);
        turn(Greenfoot.getRandomNumber(19)-9);
        if(isAtEdge()==true){
            turn(30);
        }
    }
    public void infect(){
        getImage().setColor(Color.RED);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(5,0,10,20);
        infected=true;
        world.num_infected++;
    }
    public void healed(){
        getImage().setColor(Color.GREEN);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(5,0,10,20);
        world.numRecovered++;
    }
    public void act(){
        movement();
        contractVirus();
        socialDistance(world.socialDistance);
        
        if(world.maskOn){
            getImage().setColor(Color.WHITE);
            getImage().fillOval(14,5,10,4);
            infectRadius=10;
        }
        if(!world.maskOn){
            getImage().setColor(Color.BLACK);
            getImage().fillOval(14,5,10,4);
        }
    }
    public void socialDistance(boolean enabled){
        if(enabled){
        List<person >people=getObjectsInRange(60,person.class);
        for(person persons :people){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    }
    
    public void contractVirus(){
        List<person >people=getObjectsInRange(infectRadius,person.class);
        for(person persons :people){
            if(persons.infected && infected==false){
                infect();
                infected=true;
                
            }
        }
            if(infected){
        recoveryTime++;
    
    }
    if(recoveryTime==200 && infected==true){
        healed();
        
    }
        }
    }
    

