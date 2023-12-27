package designpatterns.planets;

import designpatterns.life.Life;

public class Arrakis implements IPlanet {
    public static final Arrakis INSTANCE = new Arrakis();
    private Life life;

    private Arrakis() {
        life = new Life.Builder().fauna().flora().build();
    }
    public Life getLife() {
        return life;
    }
}
