public class LibisevKeskmine {
    // arvutan massiivi libiseva keskmise
    public static double[] leiaLibisevKeskmine(int[] sisend) {
        int pikkus = sisend.length;
        if (pikkus < 3) {
            throw new IllegalArgumentException("Sisendmassiiv peab olema vähemalt kolme elemendiga.");
        }

        double[] libisevKeskmine = new double[pikkus - 2];

        // iga elemendi ja kahe järgmise elemendi keskmine
        for (int i = 0; i < pikkus - 2; i++) {
            libisevKeskmine[i] = (sisend[i] + sisend[i + 1] + sisend[i + 2]) / 3.0;
        }

        return libisevKeskmine;
    }

    public static void main(String[] args) {
        int[] sisendMassiiv = {1, 2, 3, 4, 5, 6, 7};
        double[] tulemus = leiaLibisevKeskmine(sisendMassiiv);

        System.out.print("Libisev keskmine: ");
        for (double arv : tulemus) {
            System.out.print(arv + " ");
        }
    }
}