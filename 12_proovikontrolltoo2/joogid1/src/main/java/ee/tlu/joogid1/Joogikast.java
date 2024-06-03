package ee.tlu.joogid1;

import java.util.ArrayList;
import java.util.List;

public class Joogikast {
    private String kastityyp;
    private double kastihind;
    private double kastimass;
    private int pesadeArv; // Mitu pudelit mahub kasti
    private List<Joogipudel> pudelid;

    public Joogikast(String kastityyp, double kastihind, double kastimass, int pesadeArv) {
        this.kastityyp = kastityyp;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesadeArv = pesadeArv;
        this.pudelid = new ArrayList<>();
    }

    public String getKastityyp() {
        return kastityyp;
    }

    public double getKastihind() {
        return kastihind;
    }

    public double getKastimass() {
        return kastimass;
    }

    public int getPesadeArv() {
        return pesadeArv;
    }

    public List<Joogipudel> getPudelid() {
        return pudelid;
    }

    public void lisaPudel(Joogipudel pudel) {
        if (pudelid.size() < pesadeArv) {
            pudelid.add(pudel);
        } else {
            throw new IllegalArgumentException("Kast on täis.");
        }
    }

    public double arvutaKastiMass() {
        double kogumass = kastimass;
        for (Joogipudel pudel : pudelid) {
            kogumass += pudel.getMassKoosJoogiga();
        }
        return kogumass;
    }

    public double arvutaKastiOmahind() {
        double omahind = kastihind;
        for (Joogipudel pudel : pudelid) {
            omahind += pudel.getOmahindKoosJoogiga();
        }
        return omahind;
    }

    public void villiKastJoogivaadist(Joogivaat vaat) {
        for (Joogipudel pudel : pudelid) {
            if (vaat.getKogus() >= pudel.getMaht()) {
                vaat.taidaPudel(pudel);
            } else {
                throw new IllegalArgumentException("Joogivaadis ei ole piisavalt jooki kasti kõigi pudelite täitmiseks.");
            }
        }
    }
}
