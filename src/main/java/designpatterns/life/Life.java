package designpatterns.life;

public class Life {
    private final boolean fauna;
    private final boolean flora;
    public static class Builder {
        private boolean fauna = false;
        private boolean flora = false;
        public Builder() {}
        public Builder fauna() {
            fauna = true;
            return this;
        }
        public Builder flora() {
            flora = true;
            return this;
        }
        public Life build() {
            return new Life(this);
        }
    }
    private Life(Builder builder) {
        fauna = builder.fauna;
        flora = builder.flora;
    }

    public static void main(String[] args) {
        Life life = new Life.Builder().fauna().flora().build();
        System.out.println(life);
    }
}
