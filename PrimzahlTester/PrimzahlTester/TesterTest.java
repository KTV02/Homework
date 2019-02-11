
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

    @Test
    public void teste1(){
        t=new Tester();
        assertEquals(false,t.primzahl(1));
    }

    @Test
    public void teste2(){
        t=new Tester();
        assertEquals(true, t.primzahl(2));
    }

    @Test
    public void teste3(){
        t=new Tester();
        assertEquals(true, t.primzahl(3));
    }

    @Test
    public void teste4(){
        t=new Tester();
        assertEquals(false,t. primzahl(4));
    }

    @Test
    public void teste0()
    {
        t=new Tester();
        boolean illegalArgument = false;
        try {
            t.primzahl(0);
        }
        catch(IllegalArgumentException e) {
            illegalArgument = true;
        }
        assertTrue(illegalArgument);
    }

    @Test
    public void testeMinus1(){

        t=new Tester();
        boolean illegalArgument = false;
        try {
            t.primzahl(-1);
        }
        catch(IllegalArgumentException e) {
            illegalArgument = true;
        }
        assertTrue(illegalArgument);
    }

}

