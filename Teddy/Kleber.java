import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kleber extends Actor
{
    public void act() 
    {
        Teddy t = (Teddy) getOneIntersectingObject(Teddy.class);
        if(t != null)
            t.verringereLeben(5);
    }    
}
