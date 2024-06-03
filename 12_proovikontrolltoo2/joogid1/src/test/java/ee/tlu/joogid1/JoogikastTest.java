package ee.tlu.joogid1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JoogikastTest {
    private Jook limonaad;
    private Joogivaat vaat;
    private Joogipudel pudel1;
    private Joogipudel pudel2;
    private Joogikast kast;

    @BeforeEach
    public void setUp() {
        limonaad = new Jook("Limonaad", 1.5, 1.0);
        vaat = new Joogivaat(10.0, 10.0); // Joogivaat, milles on 10 liitrit jooki
        pudel1 = new Joogipudel(1.0, "Plastik", 0.1, 0.2);
        pudel2 = new Joogipudel(1.0, "Plastik", 0.1, 0.2);
        pudel1.lisaJook(limonaad);
        pudel2.lisaJook(limonaad);
        kast = new Joogikast("Plastik", 5.0, 2.0, 2);
        kast.lisaPudel(pudel1);
        kast.lisaPudel(pudel2);
    }

    @Test
    public void testKastiMass() {
        assertEquals(4.2, kast.arvutaKastiMass(), 0.0001);
    }

    @Test
    public void testKastiOmahind() {
        assertEquals(8.4, kast.arvutaKastiOmahind(), 0.0001);
    }

    @Test
    public void testKastiTäitmineJoogivaadist() {
        kast.villiKastJoogivaadist(vaat);
        assertEquals(8.0, vaat.getKogus(), 0.0001);
    }
}
