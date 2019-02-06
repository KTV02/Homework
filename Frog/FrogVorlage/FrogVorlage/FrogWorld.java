import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FrogWorld  extends World
{

    public FrogWorld()
    {    
        // Erzeuge eine Welt mit 8x8 Feldern. Jedes Feld ist 60x60 Pixel groﬂ.
        super(8, 8, 60);
        addObject(new Frosch("froschgruen.png"),Greenfoot.getRandomNumber(8),Greenfoot.getRandomNumber(8));
        addObject(new Frosch("froschblau.png"),Greenfoot.getRandomNumber(8),Greenfoot.getRandomNumber(8));

        for( int i = 0; i < 3; i++){
            int xStorch = Greenfoot.getRandomNumber(getWidth());
            int yStorch = Greenfoot.getRandomNumber(getHeight());
            addObject(new Storch(), xStorch, yStorch);
        }
        for( int i = 0; i < 5; i++){
            int xFliege = Greenfoot.getRandomNumber(getWidth());
            int yFliege = Greenfoot.getRandomNumber(getHeight());
            addObject(new Fliege(), xFliege, yFliege);
        }

    }

}
