/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speichertypen;

import java.time.LocalDate;

/**
 *
 * @author lkrem
 */
public interface Speichertyp {

    public void speichern(LocalDate date,String content,String author,String header);

}
