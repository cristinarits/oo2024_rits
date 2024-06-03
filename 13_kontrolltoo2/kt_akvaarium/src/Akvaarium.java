public class Akvaarium {
    private int pikkus;
    private int laius;
    private int kõrgus;
    private int veeKogus;

    // Konstruktor
    public Akvaarium(int pikkus, int laius, int kõrgus) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.kõrgus = kõrgus;
        this.veeKogus = 0;
    }

    // Ruumala
    public int arvutaRuumala() {
        return pikkus * laius * kõrgus;
    }

    // Lisan vett
    public void lisaVett(int kogus) {
        int ruumala = arvutaRuumala();
        if (this.veeKogus + kogus <= ruumala) {
            this.veeKogus += kogus;
        } else {
            System.out.println("Ei saa enam vett lisada, sest vesi valaks üle ääre.");
        }
    }

    // Kysin vee kogust
    public int kysiVeeKogus() {
        return this.veeKogus;
    }

    // Vala vett ühest akvaariumist teise
    public void valaVett(Akvaarium sihtAkvaarium, int kogus) {
        if (this.veeKogus < kogus) {
            System.out.println("Pole piisavalt vett..");
            return;
        }

        int sihtAkvaariumiRuumala = sihtAkvaarium.arvutaRuumala();
        int sihtAkvaariumiVabaRuum = sihtAkvaariumiRuumala - sihtAkvaarium.kysiVeeKogus();

        if (sihtAkvaariumiVabaRuum < kogus) {
            System.out.println("Sihtakvaariumisse ei mahu nii palju vett");
            return;
        }

        this.veeKogus = this.veeKogus - kogus;
        sihtAkvaarium.lisaVett(kogus);

        // Vaba ruum akvaariumis
        kontrolliVabaRuumiHoiatus(this, "Algakvaariumisse");
        kontrolliVabaRuumiHoiatus(sihtAkvaarium, "Sihtakvaariumisse");
    }

    // 2cm
    private void kontrolliVabaRuumiHoiatus(Akvaarium akvaarium, String akvaariumiNimi) {
        int akvaariumiRuumala = akvaarium.arvutaRuumala();
        int akvaariumiKogusPärast = akvaarium.kysiVeeKogus();
        int kõrguseSentimeetrites = akvaarium.pikkus * akvaarium.laius * 2;
        if (akvaariumiKogusPärast > (akvaariumiRuumala - kõrguseSentimeetrites)) {
            System.out.println("Hoiatus: " + akvaariumiNimi + " jääb vähem kui kaks sentimeetrit vaba ruumi!");
        }
    }

    public static void main(String[] args) {
        int pikkus1 = 9;
        int laius1 = 5;
        int kõrgus1 = 4;

        // Akvaarium 1
        Akvaarium akvaarium1 = new Akvaarium(pikkus1, laius1, kõrgus1);
        int ruumala1 = akvaarium1.arvutaRuumala();
        System.out.println("Akvaarium 1 ruumala on: " + ruumala1 + " kuupsentimeetrit.");

        // Akvaarium 2
        int pikkus2 = 8;
        int laius2 = 6;
        int kõrgus2 = 4;
        Akvaarium akvaarium2 = new Akvaarium(pikkus2, laius2, kõrgus2);
        int ruumala2 = akvaarium2.arvutaRuumala();
        System.out.println("Akvaarium 2 ruumala on: " + ruumala2 + " kuupsentimeetrit.");

        // Lisan vett akvaariumisse 1
        akvaarium1.lisaVett(180);
        System.out.println("Akvaarium 1 veekogus: " + akvaarium1.kysiVeeKogus() + " kuupsentimeetrit.");

        // Lisan vett akvaariumisse 2
        akvaarium2.lisaVett(50);
        System.out.println("Akvaarium 2 veekogus: " + akvaarium2.kysiVeeKogus() + " kuupsentimeetrit.");

        // valan vee esimesest teise
        akvaarium1.valaVett(akvaarium2, 180);
        System.out.println("Akvaarium 1 veekogus pärast valamist: " + akvaarium1.kysiVeeKogus() + " kuupsentimeetrit.");
        System.out.println("Akvaarium 2 veekogus pärast valamist: " + akvaarium2.kysiVeeKogus() + " kuupsentimeetrit.");
    }
}