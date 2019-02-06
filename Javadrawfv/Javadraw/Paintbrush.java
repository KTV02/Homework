import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Punkt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paintbrush extends Actor
{
    /**
     * Act - do whatever the Punkt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    enum Zustand{inactive,waiting,following,active};
    Zustand zustand;
    String punktImage;
     MouseInfo m;
    int color;
    boolean active;
    Paintbrush(String image,Zustand z){
        zustand=z;
        punktImage=image;
        setImage("paintbrush.png");
        getImage().scale(60,30);
    }
    public void act() 
    {
         m = Greenfoot.getMouseInfo();
        // Add your action code here.
        
        if(zustand==Zustand.active){
            paint();
        }
         if(Greenfoot.isKeyDown("DOWN")){
            zustand=Zustand.waiting;
            
        }
         if(Greenfoot.isKeyDown("UP")){
            zustand=Zustand.inactive;
            
        }
         if(zustand==Zustand.waiting&&Math.abs(m.getX()-getX())<10&&Math.abs(m.getY()-getY())<10){
            zustand=Zustand.following;          
        }
         if(zustand==Zustand.active&&Greenfoot.isKeyDown("space")){
            zustand=Zustand.following;           
            Greenfoot.delay(100);
        }
         if(zustand==Zustand.following&&Greenfoot.isKeyDown("space")){
            zustand=Zustand.active;
            Greenfoot.delay(100);
        }
        if(zustand==Zustand.following){
            folgen();
        }
        if(Greenfoot.isKeyDown("RIGHT")){
            color++;
            color%=8;
            punktImage=color+".png";
            System.out.println(punktImage);
            Greenfoot.delay(50);
        }
    }    
    public void paint(){
       
        //zustand=Zustand.inactive;
        getWorld().addObject(new Punkt(punktImage),m.getX(),m.getY());
        folgen();
       
    }
    public void folgen(){
         setLocation(m.getX()+19,m.getY()-7);
    }
}
