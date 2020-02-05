package vehicle.domain.engine;

public abstract class Engine {
    private final int horsePower;
    private final double capacity;
    private final String name;

    public Engine(int horsePower, double capacity, String name) {
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                '}';
    }
}
