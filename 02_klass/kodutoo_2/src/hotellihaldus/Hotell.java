package hotellihaldus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotell {
    private String hotelliNimi;
    private List<Tuba> toad;
    private List<Broneering> broneeringud;
    private List<Teenused> teenused;

    // Konstruktor
    public Hotell(String hotelliNimi) {
        this.hotelliNimi = hotelliNimi;
        this.toad = new ArrayList<>();
        this.broneeringud = new ArrayList<>();
        this.teenused = new ArrayList<>();
    }

    // Meetod toa lisamiseks
    public void lisaTuba(Tuba tuba) {
        toad.add(tuba);
    }

    // Meetod broneeringu lisamiseks
    public void teeBroneering(Broneering broneering) {
        broneeringud.add(broneering);
        broneering.getTuba().setOnVaba(false);
    }

    //vaabd toad
    public List<Tuba> getVabadToad() {
        return toad.stream().filter(Tuba::isOnVaba).collect(Collectors.toList());
    }

    //broneeringute kuvamiseks
    public void kuvaBroneeringud() {
        for (Broneering broneering : broneeringud) {
            System.out.println("Broneering: Tuba nr " + broneering.getTuba().getNumber() +
                    ", Klient: " + broneering.getKlient().getNimi() +
                    ", Algus: " + broneering.getAlgusKuupäev() +
                    ", Lõpp: " + broneering.getLõppKuupäev());
        }
    }

    //teenuste lisamine
    public void lisaTeenus(Teenused teenus) {
        teenused.add(teenus);
    }

    //kuva teenuste info
    public void kuvaTeenused() {
        teenused.forEach(teenus -> teenus.näitaTeenuseInfo());
    }
    public String getHotelliNimi() {
        return hotelliNimi;
    }

    // getter toade nimekirja jaoks
    public List<Tuba> getToad() {
        return new ArrayList<>(toad); // tagastab toade koopia, et vältida otsest muutmist
    }

    // getter broneeringute nimekirja jaoks
    public List<Broneering> getBroneeringud() {
        return new ArrayList<>(broneeringud); // Tagastab broneeringute koopia
    }

    // getter teenuste nimekirja jaoks
    public List<Teenused> getTeenused() {
        return new ArrayList<>(teenused); // Tagastab teenuste koopia
    }
}