public class CountingAdder extends SimpleAdder {
    private int count = 0;

    @Override
    public int add(int a, int b) {
        count++;
        return super.add(a, b);
    }

    public int getCount() {
        return count;
    }
}