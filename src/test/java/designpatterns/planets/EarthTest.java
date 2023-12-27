package designpatterns.planets;

import designpatterns.life.Life;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EarthTest {

    @Test
    void getEarth() {
        assertEquals(Earth.getEarth(), Earth.getEarth());
    }

    @Test
    void getLife() {
        Life life = Earth.getEarth().getLife();
        assertTrue(life.hasFauna());
        assertTrue(life.hasFlora());
    }

}