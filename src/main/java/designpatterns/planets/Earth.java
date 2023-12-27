package designpatterns.planets;

import designpatterns.life.Life;

public class Earth implements IPlanet {
    Life life;
    private static final Earth INSTANCE = new Earth();
    private Earth() {
        life = new Life.Builder().fauna().flora().build();
    }
    public static Earth getEarth() {
        return INSTANCE;
    }
    public Life getLife() {
        return life;
    }
}
