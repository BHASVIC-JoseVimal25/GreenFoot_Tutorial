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
    int time=0;

    public void act(){
        time++;
        if(time%1500==0){
            addObject(new long_time(),100,100);
            addObject(new took_long(),450,100);
        }
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        enemy enemy=new enemy();
        addObject(enemy,Greenfoot.getRandomNumber(451)+100,Greenfoot.getRandomNumber(501)+150);
        enemy enemy2=new enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(451)+100,Greenfoot.getRandomNumber(501)+150);

        brick_long brick_long = new brick_long();
        addObject(brick_long,127,306);
        brick_long.setLocation(82,235);
        wall wall = new wall();
        addObject(wall,109,180);
        wall.setLocation(106,181);
        wall wall2 = new wall();
        addObject(wall2,337,186);
        wall wall3 = new wall();
        addObject(wall3,488,180);
        wall wall4 = new wall();
        addObject(wall4,473,240);
        wall wall5 = new wall();
        addObject(wall5,425,340);
        wall wall6 = new wall();
        addObject(wall6,530,335);
        wall wall7 = new wall();
        addObject(wall7,473,393);
        wall wall8 = new wall();
        addObject(wall8,434,502);
        wall wall9 = new wall();
        addObject(wall9,324,550);
        wall wall10 = new wall();
        addObject(wall10,269,499);
        wall wall11 = new wall();
        addObject(wall11,64,605);
        wall wall12 = new wall();
        addObject(wall12,168,235);
        wall wall13 = new wall();
        addObject(wall13,216,232);
        wall13.setLocation(224,232);
        wall13.setLocation(221,235);
        wall wall14 = new wall();
        addObject(wall14,323,604);
        wall wall15 = new wall();
        addObject(wall15,479,604);
        wall wall16 = new wall();
        addObject(wall16,273,288);
        wall wall17 = new wall();
        addObject(wall17,382,445);
        brick_long brick_long2 = new brick_long();
        addObject(brick_long2,310,221);
        removeObject(brick_long2);
        removeObject(brick_long);
        wall_vertical wall_vertical = new wall_vertical();
        addObject(wall_vertical,43,185);
        wall_vertical.setLocation(39,172);
        removeObject(wall_vertical);
        vertical_long vertical_long = new vertical_long();
        addObject(vertical_long,560,232);
        vertical_long.setLocation(561,234);
        vertical_long vertical_long2 = new vertical_long();
        addObject(vertical_long2,564,416);
        vertical_long2.setLocation(564,444);
        vertical_long vertical_long3 = new vertical_long();
        addObject(vertical_long3,562,604);
        vertical_long3.setLocation(561,548);
        vertical_long vertical_long4 = new vertical_long();
        addObject(vertical_long4,43,209);
        vertical_long4.setLocation(39,231);
        brick_long brick_long3 = new brick_long();
        addObject(brick_long3,331,136);
        brick_long3.setLocation(456,135);
        brick_long3.setLocation(461,131);
        brick_long3.setLocation(463,133);
        wall wall18 = new wall();
        addObject(wall18,328,132);
        wall18.setLocation(352,132);

        addObject(wall_vertical,100,577);
        wall_vertical.setLocation(94,573);
        vertical_long vertical_long5 = new vertical_long();
        addObject(vertical_long5,34,431);
        vertical_long5.setLocation(43,443);
        wall_vertical wall_vertical2 = new wall_vertical();
        addObject(wall_vertical2,193,588);
        vertical_long vertical_long6 = new vertical_long();
        addObject(vertical_long6,36,600);
        vertical_long6.setLocation(40,553);
        wall_vertical wall_vertical3 = new wall_vertical();
        addObject(wall_vertical3,142,637);
        vertical_long vertical_long7 = new vertical_long();
        addObject(vertical_long7,285,238);
        vertical_long7.setLocation(299,394);
        vertical_long vertical_long8 = new vertical_long();
        addObject(vertical_long8,513,491);
        vertical_long8.setLocation(508,500);
        vertical_long vertical_long9 = new vertical_long();
        addObject(vertical_long9,452,329);
        vertical_long9.setLocation(451,346);
        vertical_long vertical_long10 = new vertical_long();
        addObject(vertical_long10,244,568);
        vertical_long10.setLocation(532,544);
        removeObject(vertical_long10);
        wall_vertical wall_vertical4 = new wall_vertical();
        addObject(wall_vertical4,405,211);
        wall_vertical wall_vertical5 = new wall_vertical();
        addObject(wall_vertical5,514,308);
        wall_vertical wall_vertical6 = new wall_vertical();
        addObject(wall_vertical6,506,208);
        wall_vertical wall_vertical7 = new wall_vertical();
        addObject(wall_vertical7,354,264);
        wall_vertical wall_vertical8 = new wall_vertical();
        addObject(wall_vertical8,354,320);
        wall_vertical wall_vertical9 = new wall_vertical();
        addObject(wall_vertical9,298,211);
        wall_vertical wall_vertical10 = new wall_vertical();
        addObject(wall_vertical10,191,204);
        wall_vertical wall_vertical11 = new wall_vertical();
        addObject(wall_vertical11,143,199);
        wall wall19 = new wall();
        addObject(wall19,56,240);
        wall_vertical11.setLocation(145,215);
        wall19.setLocation(84,235);
        wall19.setLocation(61,240);
        brick_long brick_long4 = new brick_long();
        addObject(brick_long4,120,128);
        brick_long4.setLocation(132,137);
        wall wall20 = new wall();
        addObject(wall20,233,130);
        wall20.setLocation(232,135);
        wall wall21 = new wall();
        addObject(wall21,329,134);
        wall18.setLocation(338,129);
        removeObject(wall21);
        brick_long brick_long5 = new brick_long();
        addObject(brick_long5,202,443);
        brick_long5.setLocation(169,446);
        brick_long brick_long6 = new brick_long();
        addObject(brick_long6,319,233);

        addObject(wall21,148,292);
        wall21.setLocation(183,287);
        wall21.setLocation(147,288);
        brick_long brick_long7 = new brick_long();
        addObject(brick_long7,473,659);
        wall_vertical wall_vertical12 = new wall_vertical();
        addObject(wall_vertical12,250,632);
        wall_vertical12.setLocation(295,581);
        brick_long brick_long8 = new brick_long();
        addObject(brick_long8,199,657);
        brick_long8.setLocation(223,655);
        brick_long8.setLocation(205,656);
        wall wall22 = new wall();
        addObject(wall22,80,660);
        wall22.setLocation(76,656);
        wall_vertical3.setLocation(140,623);
        wall_vertical3.setLocation(140,627);
        wall wall23 = new wall();
        addObject(wall23,396,288);
        wall wall24 = new wall();
        addObject(wall24,431,284);
        wall24.setLocation(395,287);
        wall23.setLocation(451,286);
        wall23.setLocation(371,288);
        vertical_long9.setLocation(451,285);
        vertical_long9.setLocation(459,363);
        vertical_long9.setLocation(457,350);
        wall24.setLocation(419,287);
        brick_long brick_long9 = new brick_long();
        addObject(brick_long9,112,395);
        brick_long9.setLocation(167,393);
        removeObject(brick_long9);
        wall21.setLocation(159,283);
        wall21.setLocation(163,284);
        wall21.setLocation(148,293);
        medium medium = new medium();
        addObject(medium,134,396);
        medium.setLocation(131,393);
        medium medium2 = new medium();
        addObject(medium2,357,397);
        medium2.setLocation(345,397);
        medium medium3 = new medium();
        addObject(medium3,203,550);
        medium medium4 = new medium();
        addObject(medium4,187,338);
        medium4.setLocation(186,345);
        medium medium5 = new medium();
        addObject(medium5,409,657);
        brick_long7.setLocation(387,650);
        medium5.setLocation(387,658);
        medium medium6 = new medium();
        addObject(medium6,122,492);
        medium6.setLocation(108,502);
        wall_vertical wall_vertical13 = new wall_vertical();
        addObject(wall_vertical13,350,639);
        wall_vertical wall_vertical14 = new wall_vertical();
        addObject(wall_vertical14,451,527);
        wall_vertical wall_vertical15 = new wall_vertical();
        addObject(wall_vertical15,403,476);
        wall_vertical wall_vertical16 = new wall_vertical();
        addObject(wall_vertical16,197,483);
        wall_vertical wall_vertical17 = new wall_vertical();
        addObject(wall_vertical17,196,312);
        wall_vertical17.setLocation(190,316);
        wall21.setLocation(167,288);
        wall_vertical wall_vertical18 = new wall_vertical();
        addObject(wall_vertical18,195,266);
        wall_vertical wall_vertical19 = new wall_vertical();
        addObject(wall_vertical19,251,253);
        wall_vertical19.setLocation(250,284);
        wall_vertical19.setLocation(249,264);
        wall_vertical wall_vertical20 = new wall_vertical();
        addObject(wall_vertical20,247,165);
        wall_vertical wall_vertical21 = new wall_vertical();
        addObject(wall_vertical21,91,418);
        wall_vertical wall_vertical22 = new wall_vertical();
        addObject(wall_vertical22,88,354);
        wall_vertical22.setLocation(88,360);
        medium6.setLocation(65,499);
        medium6.setLocation(88,496);
        medium6.setLocation(91,497);
        wall_vertical wall_vertical23 = new wall_vertical();
        addObject(wall_vertical23,405,588);
        wall_vertical23.setLocation(403,576);
        wall_vertical wall_vertical24 = new wall_vertical();
        addObject(wall_vertical24,408,628);
        wall_vertical24.setLocation(402,627);
        wall_vertical wall_vertical25 = new wall_vertical();
        addObject(wall_vertical25,355,465);
        wall_vertical25.setLocation(353,476);
        wall_vertical wall_vertical26 = new wall_vertical();
        addObject(wall_vertical26,352,522);
        wall_vertical wall_vertical27 = new wall_vertical();
        addObject(wall_vertical27,243,363);
        wall_vertical27.setLocation(245,367);
        wall_vertical wall_vertical28 = new wall_vertical();
        addObject(wall_vertical28,252,416);
        wall_vertical28.setLocation(248,416);
        wall_vertical wall_vertical29 = new wall_vertical();
        addObject(wall_vertical29,242,544);
        wall_vertical29.setLocation(247,536);
        wall_vertical wall_vertical30 = new wall_vertical();
        addObject(wall_vertical30,251,592);
        wall_vertical30.setLocation(247,585);
        wall_vertical29.setLocation(243,539);
        wall_vertical wall_vertical31 = new wall_vertical();
        addObject(wall_vertical31,250,628);
        wall_vertical31.setLocation(240,624);
        wall_vertical31.setLocation(239,618);
        wall_vertical31.setLocation(243,627);
        wall_vertical30.setLocation(244,585);
        wall_vertical29.setLocation(243,526);
        wall wall25 = new wall();
        addObject(wall25,119,286);
        wall25.setLocation(109,287);
        brick_long7.setLocation(547,656);
        brick_long7.setLocation(480,659);
        runner runner = new runner();
        addObject(runner,231,101);
        wall18.setLocation(347,132);
        vertical_long5.setLocation(41,362);
        teleporter teleporter = new teleporter();
        addObject(teleporter,536,155);
        teleporter teleporter2 = new teleporter();
        addObject(teleporter2,62,632);
        food food = new food();
        addObject(food,79,154);
        food.setLocation(80,161);
        food food2 = new food();
        addObject(food2,516,632);
        food food3 = new food();
        addObject(food3,142,420);
        food food4 = new food();
        addObject(food4,299,259);
        vertical_long8.setLocation(503,412);
        vertical_long8.setLocation(505,498);
        vertical_long8.setLocation(496,495);
        vertical_long8.setLocation(500,495);
        vertical_long8.setLocation(501,503);
        vertical_long8.setLocation(503,498);
        wall2.setLocation(335,187);
        wall2.setLocation(327,188);
        wall18.setLocation(355,136);
        wall18.setLocation(348,133);
        wall_vertical4.setLocation(402,192);
        wall_vertical4.setLocation(407,208);
        food.setLocation(71,152);
        food.setLocation(83,159);
        wall_vertical30.setLocation(242,564);
        wall_vertical30.setLocation(242,573);
        wall_vertical2.setLocation(181,570);
        wall_vertical2.setLocation(183,580);
        wall_vertical2.setLocation(190,580);
        wall22.setLocation(100,656);
        wall22.setLocation(85,656);
        wall22.setLocation(79,655);
        wall_vertical13.setLocation(354,624);
        wall_vertical13.setLocation(350,629);
        wall_vertical12.setLocation(297,574);
        wall_vertical28.setLocation(249,426);
        wall_vertical28.setLocation(249,426);
        wall_vertical28.setLocation(252,420);
        wall_vertical27.setLocation(252,376);
        medium4.setLocation(235,350);
        medium4.setLocation(211,346);
        wall_vertical22.setLocation(93,364);
        wall_vertical21.setLocation(90,398);
        wall_vertical21.setLocation(85,439);
        wall_vertical21.setLocation(87,402);
        wall_vertical21.setLocation(81,417);
        wall_vertical21.setLocation(81,417);
        wall_vertical22.setLocation(85,368);
        teleporter.setLocation(377,259);
        wall.setLocation(120,180);
        wall.setLocation(116,184);
        smart_enemy smart_enemy = new smart_enemy();
        addObject(smart_enemy,68,524);
        smart_enemy smart_enemy2 = new smart_enemy();
        addObject(smart_enemy2,275,168);
        smart_enemy2.setLocation(275,161);
    }
}
