package designpatterns.planets;

import designpatterns.life.Life;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsTest {

    @Test
    void instantiate() {
        assertEquals(Mars.INSTANCE, Mars.INSTANCE);
    }
    @Test
    void getLife() {
        Life life = Mars.INSTANCE.getLife();
        assertFalse(life.hasFauna());
        assertFalse(life.hasFlora());
    }
}