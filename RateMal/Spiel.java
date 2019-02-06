
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

// Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
class Spiel
{
    int punkte1=0;
    int punkte2=0;
    int zeit1;
    int zeit2;
    boolean richtigGerechnet=false;
    int runden=0;
    public Spiel()
    {
    }

    boolean rateEinmal()
    {    
            
        int zahl1= zufallszahl(10);
        int zahl2= zufallszahl(10);
        int zufall= new java.util.Random().nextInt(4);
        if(zufall==1){
            System.out.println("Wie viel ist " + zahl1 + " + " + zahl2 + "?");
            int benutzereingabe=leseZahl();
            System.out.println("Das Ergebnis war " + (zahl1 + zahl2) );
            if(benutzereingabe==(zahl1+zahl2)){
                System.out.println("Suuuuper!!!");
                return true;
            }else{
                System.out.println("Leider falsch");
                return false;
            }

        }

        if(zufall==2){
            System.out.println("Wie viel ist " + zahl1 + " - " + zahl2 + "?");
            int benutzereingabe=leseZahl();
            System.out.println("Das Ergebnis war " + (zahl1 - zahl2) );
            if(benutzereingabe==(zahl1-zahl2)){
                System.out.println("Suuuuper!!!");
                return true;
            }else{
                System.out.println("Leider falsch");
                return false;
            }

        }

        if(zufall==3){
            System.out.println("Wie viel ist " + zahl1 + " * " + zahl2 + "?");
            int benutzereingabe=leseZahl();
            System.out.println("Das Ergebnis war " + (zahl1 * zahl2) );
            if(benutzereingabe==(zahl1*zahl2)){
                System.out.println("Suuuuper!!!");
                return true;
            }else{
                System.out.println("Leider falsch");
                return false;
            }

        }
        else{
            if(zufall==0){
                zufall++;   
            }
            System.out.println("Wie viel ist " + zahl1 + " / " + zahl2 + "?");
            System.out.println("Immer abgerundet!!");
            int benutzereingabe=leseZahl();
            System.out.println("Das Ergebnis war " + (zahl1 / zahl2) );
            if(benutzereingabe==(zahl1/zahl2)){
                System.out.println("Suuuuper!!!");
                return true;
            }else{
                System.out.println("Leider falsch");
                return false;
            }
        }

    }

    public void eineRundeSpielen(){
        while(runden<20&&(punkte1<5 && punkte2<5)){
            gespielteRunden();
             int start = (int)(System.currentTimeMillis() / 1000);
            if(runden%2!=0 && rateEinmal() == true){
             

                punkte1++;
                int ende = (int)(System.currentTimeMillis() / 1000);
                zeit1 = ende - start;
                System.out.println("Du hast "+zeit1+" sekunden braucht");
            }if(runden%2!=0 && rateEinmal() == true){
                punkte2++;
                int ende = (int)(System.currentTimeMillis() / 1000);
                zeit2 = ende - start;
                 System.out.println("Du hast "+zeit2+" sekunden braucht");

            }}
        if(punkte1>punkte2){
            System.out.println("Spieler 1 hat mit "+punkte1+" zu " +punkte2+" gewonnen");
        }if(punkte1<punkte2){
            System.out.println("Spieler 2 hat mit "+punkte2+" zu " +punkte1+" gewonnen");
        }if(punkte1==punkte2){
            System.out.println("Unentschieden "+punkte1+" zu "+punkte2);  
        }

    }

    int zufallszahl(int n)
    {
        return new java.util.Random().nextInt(n);
    }

    int leseZahl()
    {
        return new java.util.Scanner(System.in).nextInt();
    }

    void gespielteRunden(){
        runden++;
    }

    void punkteerhöher(){
        if(runden==1){
            punkte1++;   
        }
        if(runden==2){
            punkte2++;   
        }
    }

}

