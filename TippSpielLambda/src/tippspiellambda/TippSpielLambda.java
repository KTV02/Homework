package tippspiellambda;

public class TippSpielLambda {

    Zufallszahlengenerator zg;

    TippSpielLambda() {
       
    }
    int simpleZahl(){
        zg=() -> new java.util.Random().nextInt(10);
        return zg.getZahl();
    }
    

    void eineRundeSpielen() {
        int zufallszahl=simpleZahl();
        int tipp = new java.util.Scanner(System.in).nextInt();
        while (tipp != zufallszahl) {
            if(Math.abs(tipp-zufallszahl) > 2)
                System.out.println("Du bist relativ weit weg von der Lösung");
            else
                System.out.println("Nah dran!");
            tipp = new java.util.Scanner(System.in).nextInt();
        }
        System.out.println("Richtig geraten!");
    }

    int testVorbereiten() {
        zg=()->42;
        return zg.getZahl();
    }

  

   

    public static void main(String[] args) {
        TippSpielLambda zahlenspiel = new TippSpielLambda();
        System.out.println("Jetzt eine richtige Runde spielen");
        zahlenspiel.eineRundeSpielen();
    }
}
