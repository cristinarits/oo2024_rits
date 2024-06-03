import java.util.ArrayList;
import java.util.List;

public class LibisevKeskmine2 {
    private List<Integer> arvud;
    private List<Double> libisevKeskmine;

    public LibisevKeskmine2() {
        this.arvud = new ArrayList<>();
        this.libisevKeskmine = new ArrayList<>();
    }

    // meetod arvu lisamiseks
    public void lisaArv(int arv) {
        arvud.add(arv);
        int suurus = arvud.size();
        // kui arvude arv on vähemalt 3, arvutan uue libiseva keskmise ja lisan selle nimekirja
        if (suurus >= 3) {
            double keskmine = (arvud.get(suurus - 3) + arvud.get(suurus - 2) + arvud.get(suurus - 1)) / 3.0;
            libisevKeskmine.add(keskmine);
        }
    }

    // meetod libiseva keskmise massiivi saamiseks
    public double[] saaLibisevKeskmine() {
        double[] tulemus = new double[libisevKeskmine.size()];
        // kopeerin libiseva keskmise nimekirja massiivi
        for (int i = 0; i < libisevKeskmine.size(); i++) {
            tulemus[i] = libisevKeskmine.get(i);
        }
        return tulemus;
    }

    public static void main(String[] args) {
        LibisevKeskmine2 lk = new LibisevKeskmine2();

        // lisan arve ja testin libiseva keskmise funktsiooni
        lk.lisaArv(1);
        lk.lisaArv(2);
        lk.lisaArv(3);
        lk.lisaArv(4);
        lk.lisaArv(5);
        lk.lisaArv(6);
        lk.lisaArv(7);

        double[] tulemus = lk.saaLibisevKeskmine();

        System.out.print("Libisev keskmine: ");
        for (double arv : tulemus) {
            System.out.print(arv + " ");
        }
    }
}