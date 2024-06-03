public class Main {
    public static void main(String[] args) {
        // arvutan koguhinna funktsiooni väljakutsed
        System.out.println(arvutaKoguhind(100.0, 10, 22.0));
        System.out.println(arvutaKoguhind(200.0, 20, 22.0));

        //  kasutaja andmete funktsiooni väljakutsed
        System.out.println(formaadiKasutajaAndmed("Jaano Jaanuar", 30, 'M', true));
        System.out.println(formaadiKasutajaAndmed("Maali Maasikas", 25, 'F', false));

        // loon kohandatud ID funktsiooni väljakutsed
        System.out.println(looKohandatudID("JJ", 1990, 123456789L));
        System.out.println(looKohandatudID("MM", 1995, 987654321L));
    }

    public static double arvutaKoguhind(double algneHind, int allahindlusProtsent, double maksuMaar) {
        return (algneHind - (algneHind * allahindlusProtsent / 100)) +
                ((algneHind - (algneHind * allahindlusProtsent / 100)) * maksuMaar / 100);
    }

    public static String formaadiKasutajaAndmed(String nimi, int vanus, char sugu, boolean onTellitud) {
        return "Nimi: " + nimi + ", Vanus: " + vanus + ", Sugu: " + sugu + ", Tellitud: " + (onTellitud ? "Jah" : "Ei");
    }

    public static String looKohandatudID(String initsiaalid, int synniAasta, long unikaalneID) {
        return initsiaalid + synniAasta + "-" + unikaalneID;
    }
}