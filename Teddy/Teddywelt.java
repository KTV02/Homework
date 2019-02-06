import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Teddywelt extends World
{    
    public Teddywelt()
    {    
        super(14, 12, 50);
        Greenfoot.setSpeed(30);
        setPaintOrder(Spieler.class, Teddy.class, Kleber.class);
        addObject(new Spieler(), getWidth() / 2, getHeight() / 2);
        for(int i = 0; i < 5; i++)
            addObject(new Teddy(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        for(int i = 0; i < 25; i++)
            addObject(new Kleber(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));

    }
}
