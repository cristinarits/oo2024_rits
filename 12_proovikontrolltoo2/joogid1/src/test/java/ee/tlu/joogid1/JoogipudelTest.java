package ee.tlu.joogid1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JoogipudelTest {
    private Jook limonaad;
    private Joogipudel pudel;

    @BeforeEach
    public void setUp() {
        limonaad = new Jook("Limonaad", 1.5, 1.0);
        pudel = new Joogipudel(1.0, "Plastik", 0.1, 0.2);
    }

    @Test
    public void testPudeliOmahindIlmaJoogita() {
        assertEquals(0.2, pudel.getOmahindKoosJoogiga());
    }

    @Test
    public void testPudeliOmahindKoosJoogiga() {
        pudel.lisaJook(limonaad);
        assertEquals(1.7, pudel.getOmahindKoosJoogiga());
    }

    @Test
    public void testPudeliMassIlmaJoogita() {
        assertEquals(0.1, pudel.getMassKoosJoogiga());
    }

    @Test
    public void testPudeliMassKoosJoogiga() {
        pudel.lisaJook(limonaad);
        assertEquals(1.1, pudel.getMassKoosJoogiga());
    }
}
