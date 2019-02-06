/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speichertypen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lkrem
 */
public class TXT implements Speichertyp{

    public void speichern(LocalDate date,String content,String author,String header) {
        try (PrintWriter out = new PrintWriter("F.txt")) {
            out.println("Dieses Dokument wurde am "+date+" von "+author+" verfasst!"+header+":"+content);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

