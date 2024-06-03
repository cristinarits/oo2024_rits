package ee.tlu.joogid1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JookTest {

    @Test
    public void testJookLoomine() {
        Jook limonaad = new Jook("Limonaad", 1.5, 1.0);

        assertEquals("Limonaad", limonaad.getNimetus());
        assertEquals(1.5, limonaad.getOmahind());
        assertEquals(1.0, limonaad.getErikaal());
    }
}
