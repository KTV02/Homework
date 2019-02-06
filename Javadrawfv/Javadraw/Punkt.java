import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Punkt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punkt extends Actor
{
    /**
     * Act - do whatever the Punkt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String image;
    Punkt(String i){
      this.image=i;
      setImage(i);
      
    }
    public void act() 
    {
        // Add your action code here.
        getWorld().setPaintOrder(Paintbrush.class);
    }    
}
