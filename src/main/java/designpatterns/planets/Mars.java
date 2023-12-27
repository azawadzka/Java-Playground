package designpatterns.planets;

import designpatterns.life.Life;

public enum Mars implements IPlanet {
    INSTANCE;
    private Life life = new Life.Builder().build();

    public Life getLife() {
        return life;
    }
}
