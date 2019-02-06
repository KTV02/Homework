import greenfoot.*;

class Spieler extends Actor
{
    private int punkte;

    public Spieler() {
        punkte = 0;
    }

    public void act() {
        laufen();
        treffeTeddies();

        punkte--;
        getWorld().showText("Punkte: " + punkte, 2, 0);
    }

    public void treffeTeddies() {        
        Teddy f = (Teddy) getOneIntersectingObject(Teddy.class);
        if(f != null) {
            f.verringereLeben(1);
            if(f.leben < 1) {
                removeTouching(Teddy.class);

                if(f.hatWert())
                    punkte += f.getWert();
            }
            else {
                f.springen();
            }
        }

        if(getWorld().getObjects(Teddy.class).size() == 0)
            Greenfoot.stop();
    }

    public void laufen() {
        if(Greenfoot.isKeyDown("left"))
            setLocation(getX()-1, getY());
        if(Greenfoot.isKeyDown("right"))
            setLocation(getX()+1, getY());
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY()-1);
        if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY()+1);
    }
}