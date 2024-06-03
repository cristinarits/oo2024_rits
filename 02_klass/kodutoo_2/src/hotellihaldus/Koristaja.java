package hotellihaldus;

public class Koristaja extends Töötaja {
    private String vahetus; // Näiteks "hommikune" või "õhtune" vahetus

    // Konstruktor
    public Koristaja(String nimi, String ametinimetus, String vahetus) {
        super(nimi, ametinimetus); // Kutsume üles Töötaja klassi konstruktori
        this.vahetus = vahetus; // Lisame välja, mis on unikaalne Koristajale
    }

    // Getter vahetuse jaoks
    public String getVahetus() {
        return vahetus;
    }

    // Koristaja spetsiifilised meetodid
    public void koristaTuba() {
        // Siia võib lisada loogika tubade koristamiseks
        System.out.println("Tuba on koristatud.");
    }

    // Võimalik lisada veel koristaja ülesannetega seotud meetodeid
}
