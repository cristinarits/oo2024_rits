package ee.tlu.joogid1;

public class Joogivaat {
    private double ruumala; // Ruumala liitrites
    private double kogus; // Jooki kogus liitrites

    public Joogivaat(double ruumala, double kogus) {
        this.ruumala = ruumala;
        this.kogus = kogus;
    }

    public double getRuumala() {
        return ruumala;
    }

    public double getKogus() {
        return kogus;
    }

    public void taidaPudel(Joogipudel pudel) {
        if (kogus >= pudel.getMaht()) {
            pudel.lisaJook(new Jook(pudel.getJook().getNimetus(), pudel.getJook().getOmahind(), pudel.getJook().getErikaal()));
            kogus -= pudel.getMaht();
        } else {
            throw new IllegalArgumentException("Joogivaadis ei ole piisavalt jooki pudeli täitmiseks.");
        }
    }

    public void villiPudelitesse(Joogipudel[] pudelid) {
        for (Joogipudel pudel : pudelid) {
            if (kogus >= pudel.getMaht()) {
                pudel.lisaJook(new Jook(pudel.getJook().getNimetus(), pudel.getJook().getOmahind(), pudel.getJook().getErikaal()));
                kogus -= pudel.getMaht();
            } else {
                break; // Kui joogivaadis ei ole piisavalt jooki, lõpetame villimise
            }
        }
    }
}
