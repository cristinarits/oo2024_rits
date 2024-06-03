package hotellihaldus;
public class Tuba {
    private int number; // Toa number
    private String tüüp; // näiteks ühekohaline, kahekohaline
    private boolean onVaba; // Kas tuba on hetkel vaba

    // Konstruktor
    public Tuba(int number, String tüüp) {
        this.number = number;
        this.tüüp = tüüp;
        this.onVaba = true; // Vaikimisi on kõik toad alguses vabad
    }

    // Getterid
    public int getNumber() {
        return number;
    }

    public String getTüüp() {
        return tüüp;
    }

    public boolean isOnVaba() {
        return onVaba;
    }

    // Setterid
    public void setOnVaba(boolean onVaba) {
        this.onVaba = onVaba;
    }
}
