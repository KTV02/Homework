import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Koerper  extends Actor
{
    // Ein Koerper-Element muss seinen Nachfolger kennen
       Koerper next;
    // Ein Koerper-Element muss seinem Vorgänger zu dessen Position folgen können
    public Koerper(){
        int random =Greenfoot.getRandomNumber(5)+1;
        if(random==1){
            setImage("tail.png");
        }
          if(random==2){
            setImage("tail2.png");
        }
          if(random==3){
            setImage("tail3.png");
        }
          if(random==4){
            setImage("tail4.png");
        }
          if(random==5){
            setImage("tail5.png");
        }
    }
        
    public void folgen(int x, int y){
        if(next!=null){
            next.bewegen(getX(),getY());
        }
        // Dann soll der mir zu meiner Position folgen
        
        // In jedem Fall bewege ich mich nach x, y
    }
    public void bewegen(int x , int y){
        folgen(getX(),getY());
        setLocation(x,y);
        
    }
}