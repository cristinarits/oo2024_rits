public class SimpleAdder implements Adder {
    protected int sum;

    public SimpleAdder() {
        sum = 0; // alustame summat nulliga
    }

    public void add(int nr) {
        sum += nr;
    }

    public int getSum() {
        return sum;
    }
}
