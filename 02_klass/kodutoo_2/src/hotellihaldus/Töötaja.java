package hotellihaldus;

public class Töötaja {
    private String nimi;
    private String ametinimetus;

    // Konstruktor
    public Töötaja(String nimi, String ametinimetus) {
        this.nimi = nimi;
        this.ametinimetus = ametinimetus;
    }

    // Getterid
    public String getNimi() {
        return nimi;
    }

    public String getAmetinimetus() {
        return ametinimetus;
    }
}
