import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SnakeWorld  extends World
{
    public SnakeWorld()
    {    
        super(30, 20, 20); 
        addObject(new Kopf(), getWidth()/2, getHeight()/2);
        
        // Erzeuge z.B. 5 Äpfel an zufälliger Position in der Welt
        for(int i=0;i<5;i++){
            addObject(new Apple(),Greenfoot.getRandomNumber(28)+1,Greenfoot.getRandomNumber(18)+1);
        }

    }    
}
