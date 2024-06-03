public class Main {
    public static void main(String[] args) {

        Toiduaine kartul = new Toiduaine("Kartul", 2.0, 0.1, 17.0);
        Toiduaine hapukoor = new Toiduaine("Hapukoor", 5.0, 20.0, 3.0);
        Toiduaine vorst = new Toiduaine("Vorst", 12.0, 30.0, 2.0);
        Toiduaine majonees = new Toiduaine("Majonees", 1.0, 99.0, 0.0);
        Toiduaine porgand = new Toiduaine("Porgand", 8.0, 4.0, 88.0);

        // 1kg kartulisalatit
        Toidukomponent kartuliKomponent = new Toidukomponent(500, kartul);
        Toidukomponent hapukooreKomponent = new Toidukomponent(120, hapukoor);
        Toidukomponent vorstiKomponent = new Toidukomponent(150, vorst);
        Toidukomponent majoneesiKomponent = new Toidukomponent(130, majonees);
        Toidukomponent porgandiKomponent = new Toidukomponent(100, porgand);

        // kartulisalat
        Toit kartulisalat = new Toit("Kartulisalat");
        kartulisalat.lisaKomponent(kartuliKomponent);
        kartulisalat.lisaKomponent(hapukooreKomponent);
        kartulisalat.lisaKomponent(vorstiKomponent);
        kartulisalat.lisaKomponent(majoneesiKomponent);
        kartulisalat.lisaKomponent(porgandiKomponent);

        // prindin valja kogused
        System.out.println("Kogu rasv: " + kartulisalat.getTotalRasv() + " g");
        System.out.println("Kogu valgud: " + kartulisalat.getTotalValgud() + " g");
        System.out.println("Kogu süsivesikud: " + kartulisalat.getTotalSysivesikud() + " g");

        // kogused 5kg jaoks
        double kogusKg = 5;
        System.out.println("\nVajalikud kogused " + kogusKg + " kg kartulisalati jaoks:");
        for (Toidukomponent komponent : kartulisalat.arvutaKogused(kogusKg * 1000)) {
            System.out.println(komponent.getToiduaine().getNimetus() + ": " + komponent.getKogus() + " g");
        }
    }
}
