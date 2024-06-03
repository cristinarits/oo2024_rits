public class Toidukomponent {
    private double kogus; // grammides
    private Toiduaine toiduaine;

    public Toidukomponent(double kogus, Toiduaine toiduaine) {
        this.kogus = kogus;
        this.toiduaine = toiduaine;
    }

    public double getKogus() {
        return kogus;
    }

    public Toiduaine getToiduaine() {
        return toiduaine;
    }

    // toiduaine koguse arvutamine antud koguse kohta
    public double arvutaRasvakogus() {
        return (kogus * toiduaine.getRasvadProtsent()) / 100;
    }

    public double arvutaValgudKogus() {
        return (kogus * toiduaine.getValgudProtsent()) / 100;
    }

    public double arvutaSysivesikudKogus() {
        return (kogus * toiduaine.getSysivesikudProtsent()) / 100;
    }
}
