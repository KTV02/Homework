
public class Starter
{
    public Starter(){
        start();
    }

    public void start(){
        Mensch m=new Mensch();
        System.out.println("Der Mensch gruesst Freundlich: ");
        m.setGruesse( new FreundlichesGruessverhalten());
        m.gruessen();
        System.out.println("Der Mensch gruesst Ignorant: ");
        m.setGruesse(new IgnorantesGruessverhalten());
        m.gruessen();
        System.out.println("Der Mensch gruesst Sauer");
        m.setGruesse(new SauresGruessverhalten());
        m.gruessen();
    }
}
