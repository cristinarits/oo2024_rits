package hotellihaldus;

public class Klient {
    private String nimi;
    private String email;

    // Konstruktor
    public Klient(String nimi, String email) {
        this.nimi = nimi;
        this.email = email;
    }

    // Getterid
    public String getNimi() {
        return nimi;
    }

    public String getEmail() {
        return email;
    }
}

