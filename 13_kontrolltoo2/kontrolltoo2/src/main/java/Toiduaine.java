// klass toiduaine tarbeks
public class Toiduaine {
    private String nimetus;
    private double valgudProtsent;
    private double rasvadProtsent;
    private double sysivesikudProtsent;

    // toiduaine nimetus ja toitainete kogused protsentides
    public Toiduaine(String nimetus, double valgudProtsent, double rasvadProtsent, double sysivesikudProtsent) {
        // kontrollin, et toitainete summa ei ületaks 100 protsenti
        double summa = valgudProtsent + rasvadProtsent + sysivesikudProtsent;
        if (summa > 100) {
            throw new IllegalArgumentException("toitainete summa ei saa ületada 100 protsenti!");
        }
        this.nimetus = nimetus;
        this.valgudProtsent = valgudProtsent;
        this.rasvadProtsent = rasvadProtsent;
        this.sysivesikudProtsent = sysivesikudProtsent;
    }

    public String getNimetus() {
        return nimetus;
    }

    public double getValgudProtsent() {
        return valgudProtsent;
    }

    public double getRasvadProtsent() {
        return rasvadProtsent;
    }

    public double getSysivesikudProtsent() {
        return sysivesikudProtsent;
    }
}
