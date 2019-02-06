
/**
 * Beschreiben Sie hier die Klasse Schweinebauer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bauer
{
    Sauartig[] schweine;
    Huhnartig[] hühner;
    Kuhartig[] kühe;
    Schafartig[] schafe;
    public Bauer(){    
        schweine=new Sauartig[10];
        hühner=new Huhnartig[10];
        kühe=new Kuhartig[10];
        schafe= new Schafartig[10];
        for(int i=0;i<=(schweine.length-1);i++){
            if(Math.random() < 0.5)
                schweine[i]=new Schwein();
            else
                schweine[i]=new EierlegendeWollMilchSau();
        }
        for(int i=0;i<=(hühner.length-1);i++){
            if(Math.random() < 0.5)
                hühner[i]=new Huhn();
            else
                hühner[i]=new EierlegendeWollMilchSau();
        }
        for(int i=0;i<=(kühe.length-1);i++){
            if(Math.random() < 0.5)
                kühe[i]=new Kuh();
            else
                kühe[i]=new EierlegendeWollMilchSau();
        }
        for(int i=0;i<=(schafe.length-1);i++){
            if(Math.random() < 0.5)
                schafe[i]=new Schaf();
            else
                schafe[i]=new EierlegendeWollMilchSau();
        }

    }

    public void schweineGrunzen(){
        for(Sauartig x:schweine){
            x.grunzen();
        }
    }

    public void hühnerGackern(){
        for(Huhnartig x:hühner){
            x.gackern();    
        }
    }

    public void küheMuhen(){
        for(Kuhartig x:kühe){
            x.muhMachen();
        }
    }

    public void schafeMähen(){
        for(Schafartig x:schafe){
            x.mähMachen();
        }
    }

}
