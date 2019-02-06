import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Tester.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tester
{
  public void primzahl(int p){
      int wurzelp = (int) Math.sqrt(p); 
      int[] array = new int[wurzelp];
      boolean s = false;
      for(int i=0; i<Math.sqrt(p); i++){
          array[i]=i;
        }
      for (int x: array){
          if(p%x==0){
              s = true;
            }
          else{
              s = false;
            }
        }
        if(s==true)
          System.out.println("Ja, " + p + " ist eine Primzahl.");
          else
          System.out.println("Nein, " + p + " ist keine Primzahl.");
    }
}
