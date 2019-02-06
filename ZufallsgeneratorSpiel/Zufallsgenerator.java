import java.util.*;
public class Zufallsgenerator extends Zufall
{
    int zufallszahl;
    int zufallszeit;
    public int zufallszahl(){
        zufallszeit = new Random().nextInt(6000);
        zufallszahl = new Random().nextInt(3);
        try{
            Thread.sleep(zufallszeit);
        }
        catch(InterruptedException e){
            System.out.println("Main thread error");
        }
      return zufallszahl + 1;
    }
    public void alleBenachrichtigen(){     
        for(Spiel x:observer){
            x.aktualisieren(zufallszahl());  
        }     
    }
}
