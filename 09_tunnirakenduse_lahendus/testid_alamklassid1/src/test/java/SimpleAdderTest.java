import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleAdderTest {

    @Test
    public void testAddition() {
        Adder adder = new SimpleAdder();
        assertEquals(5, adder.add(2, 3));
        assertEquals(0, adder.add(-2, 2));
        assertEquals(-5, adder.add(-2, -3));
    }
}
