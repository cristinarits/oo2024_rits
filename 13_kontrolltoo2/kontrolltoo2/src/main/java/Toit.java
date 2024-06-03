import java.util.ArrayList;
import java.util.List;

public class Toit {
    private String nimetus;
    private List<Toidukomponent> komponendid;

    public Toit(String nimetus) {
        this.nimetus = nimetus;
        this.komponendid = new ArrayList<>();
    }

    public void lisaKomponent(Toidukomponent komponent) {
        komponendid.add(komponent);
    }

    // toiduaine kogus toidus
    public double getTotalRasv() {
        double totalRasv = 0;
        for (Toidukomponent komponent : komponendid) {
            totalRasv += komponent.arvutaRasvakogus();
        }
        return totalRasv;
    }

    public double getTotalValgud() {
        double totalValgud = 0;
        for (Toidukomponent komponent : komponendid) {
            totalValgud += komponent.arvutaValgudKogus();
        }
        return totalValgud;
    }

    public double getTotalSysivesikud() {
        double totalSysivesikud = 0;
        for (Toidukomponent komponent : komponendid) {
            totalSysivesikud += komponent.arvutaSysivesikudKogus();
        }
        return totalSysivesikud;
    }

    // komponentide kogused toidukoguse jaoks
    public List<Toidukomponent> arvutaKogused(double kogus) {
        List<Toidukomponent> vajalikudKogused = new ArrayList<>();
        for (Toidukomponent komponent : komponendid) {
            double uusKogus = komponent.getKogus() * kogus / 1000;
            vajalikudKogused.add(new Toidukomponent(uusKogus, komponent.getToiduaine()));
        }
        return vajalikudKogused;
    }
}