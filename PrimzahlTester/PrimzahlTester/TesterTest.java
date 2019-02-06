

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse TesterTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TesterTest
{
    Tester t;
    @Test
    public void primzahltrueTest()
    {
        t=new Tester();
        assertEquals(true, t.primzahl(101));
    }
    @Test
    public void primzahlFalseTest(){
        t=new Tester();
        assertEquals(false, t.primzahl(69));
    }
}
