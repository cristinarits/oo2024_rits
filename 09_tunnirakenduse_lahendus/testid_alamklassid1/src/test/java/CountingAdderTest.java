import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountingAdderTest {

    @Test
    public void testCountingAdder() {
        CountingAdder adder = new CountingAdder();
        assertEquals(5, adder.add(2, 3));
        assertEquals(0, adder.add(-2, 2));
        assertEquals(-5, adder.add(-2, -3));
        assertEquals(3, adder.getCount());
    }
}