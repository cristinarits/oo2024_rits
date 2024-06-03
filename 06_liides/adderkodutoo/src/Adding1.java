public class Adding1 {
    public static void main(String[] args) {
        Adder adder1 = new SimpleAdder(); // loome SimpleAdder objekti

        adder1.add(3); // lisame 3 summale
        adder1.add(5); // lisame 5 summale

        // prindime summa, peaks olema 8
        System.out.println(adder1.getSum());
    }
}
