/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package terminplaner;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lkrem
 */
public class TerminPlanerTest {

   

    @Test
    public void addTest() {
        TerminPlaner planer = new TerminPlaner();
        planer.add("Kaffe kochen", 23, 24);
        planer.add("Tisch abräumen", 21, 22);
        assertEquals(2, planer.l.size());
    }

    @Test
    public void searchTest() {
        TerminPlaner planer = new TerminPlaner();
        planer.add("Kaffe kochen", 23, 24);
        planer.add("Tisch abräumen", 21, 22);
        try {
            planer.g.suchen(22);
        } catch (InterruptedException ex) {
            Logger.getLogger(TerminPlanerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(planer.g.set!=null)
        assertEquals(21, planer.g.set.getSTime());
        else
        assertEquals(21, 2);
    }
    
    @Test
    public void deleteTest() {
        TerminPlaner planer = new TerminPlaner();
        planer.add("Kaffe kochen", 23, 24);
        planer.add("Tisch abräumen", 21, 22);
        try {
            planer.g.suchen(21);
        } catch (InterruptedException ex) {
            Logger.getLogger(TerminPlanerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        planer.g.delete();
        assertEquals(1, planer.l.size());
    }  
    @Test
    public void testIntersectingEvents(){
        TerminPlaner planer = new TerminPlaner();
        planer.add("Kaffe kochen", 21, 24);
        planer.add("Tisch abräumen", 21, 22);
        assertEquals(1, planer.l.size());
        
    }
    @Test
    public void notFoundTest() throws InterruptedException{
         TerminPlaner planer = new TerminPlaner();
        planer.add("Kaffe kochen", 21, 22);
        planer.add("Tisch abräumen", 23, 24);
        planer.g.suchen(19);
        assertEquals("No Events found",planer.g.getDisplay().getText());
    }
    @Test
    public void terminAnzeigeTest(){
        TerminPlaner planer = new TerminPlaner();
        planer.add("Kaffe kochen", 21, 22);
         planer.g.fillDisplay();
        assertEquals("1. Kaffe kochen von 21 bis 22\n" +" Anzahl der Termine Insgesamt 1",planer.g.getDisplay().getText());
        
    }
}
    
    
   


