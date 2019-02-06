import java.util.*;
 
class PingPongTimer {
 
    Timer timer;
 
    public PingPongTimer() {
        timer = new Timer();
        ping();
    }
 
    private void ping() {
        System.out.println("Ping");
        timer.schedule(new TimerTask() {
 
            @Override
            public void run() {
                pong();
            }
        }, 2000);
    }
 
    private void pong() {
        System.out.println("Pong");
        timer.schedule(new TimerTask() {
 
            @Override
            public void run() {
                ping();
            }
        }, 2000);
    }
 
    public void anhalten() {
        System.out.println("Stop");
        timer.cancel();
    }
}