package hotellihaldus;

public class Spa extends Teenused {
    private int protseduurideArv; // Lisaväli, näiteks saadaolevate protseduuride arv

    // Konstruktor
    public Spa(double hind, int protseduurideArv) {
        super("Spa", hind); // Kutsub esile ülemklassi konstruktori, määrates teenuse nimeks "Spa"
        this.protseduurideArv = protseduurideArv; // Määrab protseduuride arvu
    }

    // Getter protseduuride arvu jaoks
    public int getProtseduurideArv() {
        return protseduurideArv;
    }

    // Spa-spetsiifiline meetod, näiteks protseduuride kuvamine
    public void näitaProtseduure() {
        System.out.println("Näitab spa protseduuride nimekirja");
    }

    // Ülekirjutatud meetod, et lisada Spa spetsiifilist teavet
    @Override
    public void näitaTeenuseInfo() {
        super.näitaTeenuseInfo(); // Kutsub esile baasklassi meetodi
        System.out.println("Protseduuride arv: " + getProtseduurideArv());
    }
}
