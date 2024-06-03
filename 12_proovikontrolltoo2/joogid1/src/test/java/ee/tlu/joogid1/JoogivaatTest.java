package ee.tlu.joogid1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JoogivaatTest {
    private Jook limonaad;
    private Joogivaat vaat;
    private Joogipudel pudel1;
    private Joogipudel pudel2;

    @BeforeEach
    public void setUp() {
        limonaad = new Jook("Limonaad", 1.5, 1.0);
        vaat = new Joogivaat(10.0, 10.0); // Joogivaat, milles on 10 liitrit jooki
        pudel1 = new Joogipudel(1.0, "Plastik", 0.1, 0.2);
        pudel2 = new Joogipudel(1.0, "Plastik", 0.1, 0.2);
    }

    @Test
    public void testPudeliTäitmine() {
        pudel1.lisaJook(limonaad);
        vaat.taidaPudel(pudel1);
        assertEquals(9.0, vaat.getKogus());
        assertNotNull(pudel1.getJook());
    }

    @Test
    public void testJoogivaadiTäitminePudelitesse() {
        Joogipudel[] pudelid = {pudel1, pudel2};
        pudel1.lisaJook(limonaad);
        pudel2.lisaJook(limonaad);
        vaat.villiPudelitesse(pudelid);
        assertEquals(8.0, vaat.getKogus());
        assertNotNull(pudel1.getJook());
        assertNotNull(pudel2.getJook());
    }
}
