/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminplaner;

import java.util.*;
import java.time.*;

/**
 *
 * @author KrempLen
 */
public class TerminPlaner {

    GUI g;
    LinkedList<Termin> l = new LinkedList<>();

    public static void main(String[] args) {
        new TerminPlaner();
    }

    public TerminPlaner() {
        g = new GUI(this);
        g.setVisible(true);

    }

    public void add(String s, int a, int e) {
        if (l.size() > 0) {
            for (Termin x : l) {
                //check wether event intersects with another event or if starttime>endtime
                if ((x.getSTime() <= a && x.getETime() >= a) || (x.getSTime() <= e && x.getETime() >= e) || (x.getSTime() >= a && x.getETime() <= e) || (x.getSTime() <= a && x.getETime() >= e) || (a > e)) {
                    System.out.println("Check your inputs");
                } else {
                    l.add(new Termin(s, a, e));
                    //breaks so it doesnt check itself
                    break;
                }
            }
        } else {
            //if l empty
            if (a < e) {
                l.add(new Termin(s, a, e));
            }
            // System.out.println(l.get(0).getETime());
        }
    }

   

    public Termin[] getNext() {
        LocalTime time = LocalTime.now();
        //Termin n=new Termin("testklein",10,12);
        //Termin f=new Termin("testgroß",13,15);
        LinkedList<Termin> st = new LinkedList<>();
        //st.add(n);
        //st.add(f);
        //check if event is in the future
        for (Termin x : l) {
            if (time.getHour() <= x.getSTime()) {
                st.add(x);
            }
        }

        // System.out.println(d[0].getSTime()+" "+d[1].getSTime());
        //sort events by starttime
        //  System.out.println(st.get(0));
        return sort(st);

    }

    public void bubbleSort(Termin[] unsorted) {
        //algorithm to sort the startime from low to high
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length; j++) {
                if (unsorted[i].getSTime() < unsorted[j].getSTime()) {
                    Termin temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }

    }

    public Termin[] sort(LinkedList st) {
        //casts from linked list to array
        Object[] t = st.toArray();
        Termin[] d = new Termin[t.length];
        for (int i = 0; i < t.length; i++) {
            d[i] = (Termin) t[i];
        }
        bubbleSort(d);
        return d;
    }

}
