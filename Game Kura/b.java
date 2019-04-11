import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class b extends World
{

    /**
     * Constructor for objects of class b.
     * 
     */
    public b()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kura kura = new kura();
        addObject(kura,134,193);
        banana banana = new banana();
        addObject(banana,503,54);
        banana banana2 = new banana();
        addObject(banana2,399,223);
        banana banana3 = new banana();
        addObject(banana3,88,125);
        score score = new score();
        addObject(score,145,47);
        bola bola = new bola();
        addObject(bola,400,27);
        bola.setRotation(90);
    }
}
