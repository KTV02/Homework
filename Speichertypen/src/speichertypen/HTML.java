/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speichertypen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lkrem
 */
public class HTML implements Speichertyp{
    public void speichern(LocalDate date,String content,String author,String header){
        File f=new File("Html.html");
        String html="<h1>Dieses Dokument wurde am "+date+" von "+author+" verfasst</h1><br><h2>"+header+":</h2><br><p>"+content+"</p>";
        try{
           BufferedWriter bw=new BufferedWriter(new FileWriter(f));
           bw.write(html);
           bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

