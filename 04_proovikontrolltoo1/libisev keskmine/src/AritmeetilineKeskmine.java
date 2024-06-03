public class AritmeetilineKeskmine {
    public static double leiaKeskmine(int arv1, int arv2, int arv3) {
        return (arv1 + arv2 + arv3) / 3.0;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 12;
        int number3 = 8;

        double keskmine = leiaKeskmine(number1, number2, number3);
        System.out.println("Arvude " + number1 + ", " + number2 + " ja " + number3 + " aritmeetiline keskmine on: " + keskmine);
    }
}
