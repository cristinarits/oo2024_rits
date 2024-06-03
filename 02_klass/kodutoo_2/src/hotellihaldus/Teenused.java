package hotellihaldus;

public class Teenused {
    private String teenuseNimi;
    private double hind;

    // Konstruktor
    public Teenused(String teenuseNimi, double hind) {
        this.teenuseNimi = teenuseNimi;
        this.hind = hind;
    }

    // Getterid
    public String getTeenuseNimi() {
        return teenuseNimi;
    }

    public double getHind() {
        return hind;
    }

    // Võimalik lisada teenuseid käsitlevaid üldisi meetodeid
    public void näitaTeenuseInfo() {
        System.out.println("Teenuse nimi: " + teenuseNimi + ", Hind: " + hind);
    }
}
