import java.util.*;
import java.io.*;
/**
 * Beschreiben Sie hier die Klasse Tester.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tester
{

  public boolean primzahl(int p){
      int wurzelp = (int) Math.sqrt(p); 
      int[] array = new int[wurzelp];
      boolean s = false;
      for(int i=0; i<(Math.sqrt(p)-1); i++){
          array[i]=i+1;
        }
      for (int x: array){
          if(p%x==0){
              s = false;
            }
          else{
              s = true;
            }
        }
        if(s==true){
          System.out.println("Ja, " + p + " ist eine Primzahl.");
          return true;
        }
          else{
          System.out.println("Nein, " + p + " ist keine Primzahl.");
          return false;
        }

    }
}

