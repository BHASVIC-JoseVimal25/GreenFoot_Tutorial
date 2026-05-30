import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    button red=new button(Color.RED,this);
    button blue=new button(Color.BLUE,this);
    button yellow=new button(Color.YELLOW,this);
    public Color color;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        getBackground().setColor(Color.LIGHT_GRAY);
        getBackground().fill();
        drawCalendar();

        addButtons();
        
    }

    public void drawCalendar(){
        GreenfootImage column=new GreenfootImage(2,600);
        GreenfootImage row=new GreenfootImage(700,2);
        column.setColor(Color.BLACK);
        row.setColor(Color.BLACK);
        column.fillRect(0,0,1,599);
        row.fillRect(0,0,699,1);
        for(int i =0;i<6;i++)
            getBackground().drawImage(column,i*100+100,100);
        for(int i =0;i<5;i++)
            getBackground().drawImage(row,0,i*100+100);

        getBackground().setColor(Color.GREEN);
        getBackground().fillRect(0,0,699,100);
        GreenfootImage title=new GreenfootImage("DECEMBER",90,Color.RED,Color.GREEN,Color.BLACK);
        getBackground().drawImage(title,150,0);

        int dayCount=1;
        for(int week=0;week<5;week++)
            for(int daysofweek=0;daysofweek<7;daysofweek++)
            {
                if(dayCount<32){
                    showText(""+dayCount,daysofweek*100 +90 ,week*100 + 110);
                    addObject(new day(this),daysofweek*100+50,week*100+150);
                    dayCount++;
                }

            }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
    public void addButtons(){
        addObject(red,20,20);
         addObject(blue,50,20);
          addObject(yellow,80,20);
    }
}
