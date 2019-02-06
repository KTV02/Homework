/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speichertypen;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author KrempLen
 */
public class User {

    Scanner s = new Scanner(System.in);
    String content;
    String author;
    String header;
    LocalDate date;
    Speichertyp st;

    public User() {
        setAuthor();
        setHeader();
        setContent();
        setDate();
        getUserInput();
        speichern();

    }

    public void getUserInput() {
        System.out.println("Schreiben sie html oder txt");
        String option = s.nextLine();
        if (option.equals("html")) {
            setSpeichertyp(new HTML());
        } else if (option.equals("txt")) {
            setSpeichertyp(new TXT());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        User u = new User();
    }

    public void setContent() {
        System.out.println("Was möchtst du schreiben");
        content = s.nextLine();
    }

    public void setAuthor() {
        System.out.println("Wer ist der Autor");
        author = s.nextLine();
    }

    public void setHeader() {
        System.out.println("Was ist die Überschrift");
        header = s.nextLine();
    }

    public void setDate() {
        date = LocalDate.now();

    }

    public void setSpeichertyp(Speichertyp s) {
        st = s;
    }

    public void speichern() {
        st.speichern(date, content, author, header);
    }
}
