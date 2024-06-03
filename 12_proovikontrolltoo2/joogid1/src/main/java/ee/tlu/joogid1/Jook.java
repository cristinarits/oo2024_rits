package ee.tlu.joogid1;

public class Jook {
    private String nimetus;
    private double omahind;
    private double erikaal;

    public Jook(String nimetus, double omahind, double erikaal) {
        this.nimetus = nimetus;
        this.omahind = omahind;
        this.erikaal = erikaal;
    }

    public String getNimetus() {
        return nimetus;
    }

    public double getOmahind() {
        return omahind;
    }

    public double getErikaal() {
        return erikaal;
    }
}
