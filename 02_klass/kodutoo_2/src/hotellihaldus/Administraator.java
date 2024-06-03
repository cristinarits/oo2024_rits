package hotellihaldus;

public class Administraator extends Töötaja {
    private String osakond;

    // Konstruktor
    public Administraator(String nimi, String ametinimetus, String osakond) {
        super(nimi, ametinimetus); // Kutsume üles Töötaja klassi konstruktori
        this.osakond = osakond; // Lisame uue välja, mis on unikaalne Administraatorile
    }

    // Getter osakonna jaoks
    public String getOsakond() {
        return osakond;
    }

    // Administraatori spetsiifilised meetodid
    public void käsitleBroneeringut() {
        // Siia võib lisada loogika broneeringute käsitlemiseks
        System.out.println("Broneering on käsitletud.");
    }

    // Võimalik lisada veel administraatori ülesannetega seotud meetodeid
}
