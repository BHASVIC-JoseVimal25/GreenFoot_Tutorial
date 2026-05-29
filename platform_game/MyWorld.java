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
        super(3000, 600, 1); 

        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100)<=0){
            addObject(new coin(),getWidth()-1,Greenfoot.getRandomNumber(400-139)+139);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        platform platform = new platform();
        addObject(platform,922,229);
        platform platform2 = new platform();
        addObject(platform2,884,395);
        platform platform3 = new platform();
        addObject(platform3,661,316);
        platform platform4 = new platform();
        addObject(platform4,280,321);
        platform platform5 = new platform();
        addObject(platform5,92,240);
        platform platform6 = new platform();
        addObject(platform6,59,380);
        Mario mario = new Mario();
        addObject(mario,304,268);
        mario.setLocation(263,294);
        Mario_2 mario_2 = new Mario_2();
        addObject(mario_2,914,184);
        cloud cloud = new cloud();
        addObject(cloud,147,76);
        cloud.setLocation(65,35);
        cloud.setLocation(81,40);
        cloud cloud2 = new cloud();
        addObject(cloud2,320,51);
        cloud2.setLocation(240,43);
        cloud cloud3 = new cloud();
        addObject(cloud3,486,59);
        cloud3.setLocation(400,39);
        cloud cloud4 = new cloud();
        addObject(cloud4,636,49);
        cloud4.setLocation(560,40);
        cloud cloud5 = new cloud();
        addObject(cloud5,742,55);
        cloud5.setLocation(724,41);
        cloud cloud6 = new cloud();
        addObject(cloud6,912,52);
        cloud6.setLocation(889,42);
        cloud2.setLocation(263,121);
        cloud2.setLocation(279,110);
        cloud2.setLocation(314,143);
        cloud4.setLocation(568,168);
        cloud5.setLocation(652,63);
        cloud4.setLocation(617,112);
        removeObject(cloud5);
        cloud3.setLocation(492,47);
        cloud4.setLocation(685,122);
        removeObject(cloud6);
        cloud4.setLocation(763,72);
        cloud2.setLocation(267,88);
        cloud3.setLocation(570,45);
        cloud4.setLocation(744,97);
        cloud2.setLocation(404,116);
        cloud2.setLocation(326,114);
        tree tree = new tree();
        addObject(tree,865,520);
        tree tree2 = new tree();
        addObject(tree2,656,433);
        tree tree3 = new tree();
        addObject(tree3,713,529);
        tree tree4 = new tree();
        addObject(tree4,525,504);
        tree tree5 = new tree();
        addObject(tree5,132,519);
        tree tree6 = new tree();
        addObject(tree6,267,504);
        tree tree7 = new tree();
        addObject(tree7,5,476);
        mountain mountain = new mountain();
        addObject(mountain,401,463);
        mountain.setLocation(396,472);
        tree4.setLocation(543,477);
        tree6.setLocation(211,459);
        tree7.setLocation(22,488);
        mountain.setLocation(410,516);
        mountain.setLocation(395,555);
        tree4.setLocation(547,510);
        tree6.setLocation(248,533);
        tree3.setLocation(769,494);
        tree.setLocation(928,499);
        tree3.setLocation(784,524);
        tree3.setLocation(779,517);
        removeObject(mario_2);
        mountain mountain2 = new mountain();
        addObject(mountain2,886,573);
        mountain2.setLocation(817,594);
        tree3.setLocation(627,476);
        tree2.setLocation(633,510);
        tree2.setLocation(639,447);
        tree2.setLocation(608,528);
        tree2.setLocation(675,490);
        tree4.setLocation(540,429);
        tree.setLocation(943,462);
        tree.setLocation(948,483);
        tree6.setLocation(208,496);
        platform platform7 = new platform();
        addObject(platform7,461,227);
        platform platform8 = new platform();
        addObject(platform8,725,202);
        platform platform9 = new platform();
        addObject(platform9,420,383);
        platform platform10 = new platform();
        addObject(platform10,708,369);
        platform3.setLocation(642,284);
        mario.setLocation(277,258);
        platform platform11 = new platform();
        addObject(platform11,1165,335);
        platform platform12 = new platform();
        addObject(platform12,1380,477);
        platform12.setLocation(1484,421);
        platform platform13 = new platform();
        addObject(platform13,1564,194);
        platform platform14 = new platform();
        addObject(platform14,1785,326);
        platform platform15 = new platform();
        addObject(platform15,2044,200);
        platform platform16 = new platform();
        addObject(platform16,2104,416);
        cloud cloud7 = new cloud();
        addObject(cloud7,1120,83);
        cloud cloud8 = new cloud();
        addObject(cloud8,1411,81);
        cloud7.setLocation(868,143);
        cloud8.setLocation(1110,60);
        cloud cloud9 = new cloud();
        addObject(cloud9,1398,72);
        cloud9.setLocation(1444,79);
        cloud cloud10 = new cloud();
        addObject(cloud10,1864,71);
        cloud cloud11 = new cloud();
        addObject(cloud11,2126,68);
        cloud10.setLocation(1820,72);
        tree tree8 = new tree();
        addObject(tree8,2172,549);
        tree tree9 = new tree();
        addObject(tree9,2044,471);
        tree9.setLocation(2052,471);
        tree tree10 = new tree();
        addObject(tree10,1936,548);
        tree tree11 = new tree();
        addObject(tree11,1710,463);
        tree tree12 = new tree();
        addObject(tree12,1160,463);
        tree12.setLocation(1246,549);
        tree tree13 = new tree();
        addObject(tree13,1496,489);
        tree13.setLocation(1388,538);
        mountain mountain3 = new mountain();
        addObject(mountain3,1585,471);
        mountain3.setLocation(1522,634);
        mountain3.setLocation(1646,481);
        mountain3.setLocation(1517,600);
        mountain3.setLocation(1532,576);
        mountain mountain4 = new mountain();
        addObject(mountain4,2290,540);
        mountain4.setLocation(2194,516);
        tree8.setLocation(2336,533);
        mountain mountain5 = new mountain();
        addObject(mountain5,1149,506);
        mountain5.setLocation(1215,647);
        mountain5.setLocation(1254,615);
        tree12.setLocation(1071,445);
        tree12.setLocation(1078,473);
        platform platform17 = new platform();
        addObject(platform17,2324,325);
        platform platform18 = new platform();
        addObject(platform18,2484,139);
        platform platform19 = new platform();
        addObject(platform19,2590,400);
        platform platform20 = new platform();
        addObject(platform20,2787,180);
        platform platform21 = new platform();
        addObject(platform21,2986,295);
        platform21.setLocation(2940,293);
        tree tree14 = new tree();
        addObject(tree14,2968,520);
        tree tree15 = new tree();
        addObject(tree15,2514,513);
        tree tree16 = new tree();
        addObject(tree16,2774,453);
        mountain mountain6 = new mountain();
        addObject(mountain6,2704,527);
        mountain6.setLocation(2736,604);
        mountain6.setLocation(2772,598);
        tree16.setLocation(2882,410);
        cloud cloud12 = new cloud();
        addObject(cloud12,2532,42);
        cloud cloud13 = new cloud();
        addObject(cloud13,2830,72);
        cloud cloud14 = new cloud();
        addObject(cloud14,2333,50);
        platform16.setLocation(2044,488);
        platform16.setLocation(2064,365);
        tree9.setLocation(2058,468);
        tree9.setLocation(2009,525);
        removeObject(platform16);

        platform3.setLocation(1232,155);
        platform3.setLocation(1213,198);

        removeObject(platform9);
        platform platform22 = new platform();
        addObject(platform22,493,407);
        platform9.setLocation(484,403);
        coin coin = new coin();
        addObject(coin,453,197);
        coin coin2 = new coin();
        addObject(coin2,712,353);
        coin coin3 = new coin();
        addObject(coin3,1196,183);
        coin coin4 = new coin();
        addObject(coin4,1568,188);
        coin coin5 = new coin();
        addObject(coin5,2315,311);
        coin coin6 = new coin();
        addObject(coin6,2580,379);
        coin5.setLocation(2044,182);
        portal portal = new portal();
        addObject(portal,460,164);
        removeObject(portal);
    }
}
