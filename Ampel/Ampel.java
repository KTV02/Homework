import java.util.concurrent.*;
class Ampel {
    Zustand az;
    enum Zustand{
        DEAKTIVIERT,ROT,GRÜN}        
    ScheduledThreadPoolExecutor timer;
    
    public Ampel() {
        az=Zustand.DEAKTIVIERT;     
        System.out.println("Abgeschaltet");
    }

    public void anschalten(){
        if(az==Zustand.DEAKTIVIERT){
        timer = new ScheduledThreadPoolExecutor(1);
        rot();   
    }
    }

    private void rot() {
        System.out.println("rot");
        az=Zustand.ROT;
        timer.schedule(() -> grün(), 2, TimeUnit.SECONDS);
    }

    private void grün() {
        System.out.println("grün");
        az=Zustand.GRÜN;
        timer.schedule(() -> rot(), 2, TimeUnit.SECONDS);
    }

    public void anhalten() {
        if(az==Zustand.ROT){
            System.out.println("Abgeschaltet");
            az=Zustand.DEAKTIVIERT;
            timer.shutdownNow();
        }
    }
}
