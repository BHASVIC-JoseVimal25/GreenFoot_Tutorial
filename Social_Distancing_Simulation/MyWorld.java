import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    button popButton=new button("Population: ");
    public static int population=0;
    
    public static int num_infected=0;
    button infectedButton=new button("Infected");
    
    public static int numRecovered=0;
    button recoveredButton=new button("recovered: ");
    
    public static int numVulnerable=0;
    button vulnerableButton=new button("vulnerable: ");
    public static boolean socialDistance=false;
    button socialDistButton=new button("Social Distance: ");
    
    public static boolean maskOn=false;
    button maskButton=new button("Mask: ");
    int time;
      String input;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 500, 1); 
        addObject(popButton,100,50);
        showText(""+ population,200,50);
        addObject(infectedButton,100,100);
        showText(""+ num_infected,200,100);
        addObject(recoveredButton,100,150);
        showText(""+ numRecovered,200,150);
        addObject(vulnerableButton,100,200);
        showText(""+(population-(numRecovered+ num_infected)),200,200);
        addObject(socialDistButton,100,250);
        showText(""+socialDistance,250,250);
        addObject(maskButton,100,300);
        showText(""+maskOn,250,300);
        showText("Time: "+(time/60),600,50);
        setPaintOrder(button.class,person.class);
    }
    public void act(){
        time++;
        if(Greenfoot.mouseClicked(popButton)){
            input=JOptionPane.showInputDialog("How many people in world?");
            population=Integer.parseInt(input);
            populate(population);
        }
        if(Greenfoot.mouseClicked(socialDistButton)){
            socialDistance=!socialDistance;
        }
        if(Greenfoot.mouseClicked(maskButton)){
            maskOn=!maskOn;
        }
        showText(""+ population,200,50);
        showText(""+ num_infected,200,100);
        showText(""+ numRecovered,200,150);
        
        showText(""+(population-(numRecovered+num_infected)),200,200);
        showText(""+socialDistance,250,250);
        showText(""+maskOn,250,300);
        showText("Time: "+(time/60),600,50);
    }
    public void populate(int population){
        this.population=population;
        for(int i =0;i<population;i++){
            addObject(new person(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
    }
}
