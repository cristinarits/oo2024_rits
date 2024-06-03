package hotellihaldus;
public class Restoran extends Teenused {
    // Lisaväljad, kui on vaja spetsiifilisemaid omadusi Restoranile
    private int istekohtadeArv; // Näiteks spetsiifiline väli ainult Restoranile

    // Konstruktor
    public Restoran(double hind, int istekohtadeArv) {
        super("Restoran", hind); // Kutsub esile ülemklassi konstruktori
        this.istekohtadeArv = istekohtadeArv; // Määrab istekohtade arvu
    }

    // Getter istekohtade arvu jaoks
    public int getIstekohtadeArv() {
        return istekohtadeArv;
    }

    // Restorani-spetsiifiline meetod, näiteks menüü kuvamine
    public void näitaMenüüd() {
        System.out.println("Näitab restorani menüüd");
    }

    // Ülekirjutatud meetod, et lisada Restorani spetsiifilist teavet
    @Override
    public void näitaTeenuseInfo() {
        super.näitaTeenuseInfo(); // Kutsub esile baasklassi meetodi
        System.out.println("Istekohtade arv: " + getIstekohtadeArv());
    }
}
