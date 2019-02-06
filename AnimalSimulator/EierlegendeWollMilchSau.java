
public class EierlegendeWollMilchSau implements Sauartig,Schafartig,Kuhartig,Huhnartig
{
    Huhn huhn=new Huhn();
    Schwein schwein=new Schwein();
    Kuh kuh=new Kuh();
    Schaf schaf=new Schaf();
    public void eierLegen(){
        System.out.print("Juhu, ich bin eine EWMS");
        huhn.eierLegen();
    }

    public void gackern(){
        System.out.print("Juhu, ich bin eine EWMS");
        huhn.gackern();

    }

    public void milchGeben(){
        System.out.print("Juhu, ich bin eine EWMS");
        kuh.milchGeben();
    }

    public void muhMachen(){
        System.out.print("Juhu, ich bin eine EWMS");
        kuh.muhMachen();   
    }

    public void grunzen(){
        System.out.print("Juhu, ich bin eine EWMS");
        schwein.grunzen();
    }

    public void fleischGeben(){
        System.out.print("Juhu, ich bin eine EWMS");
        schwein.fleischGeben();    
    }

    public void mähMachen(){
        System.out.print("Juhu, ich bin eine EWMS");
        schaf.mähMachen();
    }

    public void wolleGeben(){
        System.out.print("Juhu, ich bin eine EWMS");
        schaf.mähMachen();   
    }

}
