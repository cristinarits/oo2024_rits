package hotellihaldus;

import java.time.LocalDate;

public class HotelliSimulaator {
    public static void main(String[] args) {

        Hotell minuHotell = new Hotell("Minik Hotel");

        minuHotell.lisaTuba(new Tuba(101, "Ühekohaline"));
        minuHotell.lisaTuba(new Tuba(102, "Kahekohaline"));

        Klient klient = new Klient("Darina ÖÖ", "darina@gmail.com");
        Broneering broneering = new Broneering(minuHotell.getToad().get(0), klient, LocalDate.now(), LocalDate.now().plusDays(3));
        minuHotell.teeBroneering(broneering);

        minuHotell.lisaTeenus(new Spa(250.0, 5));
        minuHotell.lisaTeenus(new Restoran(75.0, 50));

        System.out.println("Broneeringud:");
        minuHotell.kuvaBroneeringud();

        System.out.println("\nSaadaolevad teenused:");
        minuHotell.kuvaTeenused();
    }
}
