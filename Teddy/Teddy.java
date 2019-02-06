import greenfoot.*; // Wird in Greenfoot benötigt, um z.B. Actor-Klasse zu benutzen.

public class Teddy extends Actor
{
    // Attribute
    // ...
    int alter;
    int leben;
    // Konstruktor(en)
    // ...
       public Teddy() {
        leben = 5;
        alter = 0;
    }


    // Methoden    
    public void springen() {
        // wie die Methode genau funktioniert, musst Du nicht verstehen.
        int dx = 0;
        int dy = 0;
        if(new java.util.Random().nextBoolean())
            dx = new java.util.Random().nextBoolean() ? 1 : -1;
        else
            dy = new java.util.Random().nextBoolean() ? 1 : -1;
        setLocation(getX() + dx, getY() + dy);
    }
    
      public void act() {
      
      alter++;    
    }
    
        public void verringereLeben(int betrag) {
        
       leben = leben - betrag;
    }
    
        public int getWert() {
        return 100 - alter;
    }
    
    public boolean hatWert() {
        return getWert() > 0;
    }



}