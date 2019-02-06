import java.util.*;
public abstract class Zufall
{
    protected ArrayList<Spiel> observer=new ArrayList<Spiel>();

    public void abmelden(Spiel s){
        observer.remove(s);
    }

    public void anmelden(Spiel s){
        observer.add(s);
    }

    public abstract void alleBenachrichtigen();
}
