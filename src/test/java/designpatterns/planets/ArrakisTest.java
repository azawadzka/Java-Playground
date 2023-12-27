package designpatterns.planets;

import designpatterns.life.Life;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrakisTest {

    @Test
    void instantiate() {
        assertEquals(Arrakis.INSTANCE, Arrakis.INSTANCE);
    }
    @Test
    void getLife() {
        Life life = Arrakis.INSTANCE.getLife();
        assertTrue(life.hasFauna());
        assertTrue(life.hasFlora());
    }
}