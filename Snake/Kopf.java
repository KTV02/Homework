import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kopf  extends Actor
{
    int richtung; // 0 für hoch, 1 für rechts, 2 für ab, 3 für links
    Koerper first;
    int scorecounter;
    public Kopf()
    {
        // Anfangsrichtung nach oben
        richtung = 0;
    }

    public void act() 
    {
        // Bin ich an der Wand oder treffe auf meinen Koerper? -> anhalten

        if(isTouching(Apple.class)){
            essen();

        }
        if(first!=null){
            first.bewegen(getX(),getY());
        }
        // Habe ich ein Koerper-Elemnt?
        // -> das Element soll mir folgen
        getWorld().showText("Score: "+scorecounter,2,0);
        turn();
        move();
        if(isAtEdge()){
            gameover();           
        }
        if(isTouching(Koerper.class)){
            gameover();
        }
    }

    public void gameover(){
        getWorld().showText("Gameover",getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();
    }

    public void wachsen()
    {
        // Ist die Schlange noch Koerper-los?
        if(first==null){
            first=new Koerper();
            getWorld().addObject(first,getX(),getY());
        }else{
            Koerper letztesElement=first;    
            while(letztesElement.next!=null){
                letztesElement=letztesElement.next;
            }
            letztesElement.next=new Koerper();
            letztesElement=letztesElement.next;
            getWorld().addObject(letztesElement,1,1);

        }

    }

    public void turn()
    {
        // Ändere Richtung, falls keine Wende
        if(Greenfoot.isKeyDown("left") && richtung != 1)
        {
            richtung = 3;
        }
        if(Greenfoot.isKeyDown("right") && richtung != 3)
        {
            richtung = 1;
        }
        if(Greenfoot.isKeyDown("up") && richtung != 2)
        {
            richtung = 0;
        }
        if(Greenfoot.isKeyDown("down") && richtung != 0)
        {
            richtung = 2;
        }
    }

    public void essen(){
        removeTouching(Apple.class); 
        getWorld().addObject(new Apple(),Greenfoot.getRandomNumber(30),Greenfoot.getRandomNumber(20));
        scorecounter++;
        wachsen();
    }

    public void move()
    {
        // Gehe in aktuelle Richtung weiter
        if(richtung == 0)
        {
            setLocation(getX(), getY()-1);
        }
        else if(richtung == 1)
        {
            setLocation(getX() + 1, getY());
        }
        else if(richtung == 2)
        {
            setLocation(getX(), getY() + 1);
        }
        else
        {
            setLocation(getX() - 1, getY());
        }
    }
}
