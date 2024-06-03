package ee.tlu.joogid1;

public class Joogipudel {
    private double maht;
    private String pudelityyp;
    private double mass;
    private double taaraMaksumus;
    private Jook jook;

    public Joogipudel(double maht, String pudelityyp, double mass, double taaraMaksumus) {
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
        this.jook = null;
    }

    public void lisaJook(Jook jook) {
        this.jook = jook;
    }

    public double getMassKoosJoogiga() {
        if (jook != null) {
            return mass + (maht * jook.getErikaal());
        } else {
            return mass;
        }
    }

    public double getOmahindKoosJoogiga() {
        if (jook != null) {
            return taaraMaksumus + (maht * jook.getOmahind());
        } else {
            return taaraMaksumus;
        }
    }

    public double getMaht() {
        return maht;
    }

    public String getPudelityyp() {
        return pudelityyp;
    }

    public double getMass() {
        return mass;
    }

    public double getTaaraMaksumus() {
        return taaraMaksumus;
    }

    public Jook getJook() {
        return jook;
    }
}
