package hotellihaldus;

import java.time.LocalDate;

public class Broneering {
    private Tuba tuba;
    private Klient klient;
    private LocalDate algusKuupäev;
    private LocalDate lõppKuupäev;

    // Konstruktor
    public Broneering(Tuba tuba, Klient klient, LocalDate algusKuupäev, LocalDate lõppKuupäev) {
        this.tuba = tuba;
        this.klient = klient;
        this.algusKuupäev = algusKuupäev;
        this.lõppKuupäev = lõppKuupäev;
    }

    // Getterid
    public Tuba getTuba() {
        return tuba;
    }

    public Klient getKlient() {
        return klient;
    }

    public LocalDate getAlgusKuupäev() {
        return algusKuupäev;
    }

    public LocalDate getLõppKuupäev() {
        return lõppKuupäev;
    }
}

