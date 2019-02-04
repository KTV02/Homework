
/**
 * Beschreiben Sie hier die Klasse FakultätRechner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FakultätRechner
{
    public int fakultät(int grenze) {
        int wert = 1;
        for(int i = 1; i <= grenze; i++) {
            wert *= i;
        }
        return wert;
    }
}
