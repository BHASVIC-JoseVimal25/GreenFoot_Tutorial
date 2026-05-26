import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class croc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class croc extends Actor
{
    /**
     * Act - do whatever the croc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int image_num;
    int speed;
    public croc(int rotate,int sped){
        setRotation(rotate);
        speed=sped;
        image_num=Greenfoot.getRandomNumber(4);
        
    }
    public void act()
    {
        // Add your action code here.
        move_around();
        
    }
    public void move_around(){
        move(speed);
        if (getX()>690){
            
            change_image();
            turn(150);
            
        }
        if (getX()<10){
            turn(150);
            change_image();
        }if (getY()>690){
            turn(150);
            change_image();
        }if (getY()<10){
            turn(150);
            change_image();
        }
    }
    public void change_image(){
        image_num++;
        if(image_num==1){
            setImage("dolphin.png");
            
        }
        if(image_num==2){
            setImage("ant3.png");
            
        }
        if(image_num==3){
            setImage("alligator.png");
            
        }
        if(image_num==4){
            setImage("bee.png");
            
        }
        if(image_num==5){
            setImage("spider.png");
            image_num=0;
        }
    }
}
