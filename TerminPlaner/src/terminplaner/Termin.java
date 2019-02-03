package terminplaner;

public class Termin {

    private int starttime;
    private int endtime;
    private String description;

    public Termin(String d, int a, int e) {
        starttime = a;
        endtime = e;
        description = d;
    }

    public int getSTime() {
        return starttime;
    }

    public int getETime() {
        return endtime;
    }

    public String getDescription() {
        return description;
    }

}
