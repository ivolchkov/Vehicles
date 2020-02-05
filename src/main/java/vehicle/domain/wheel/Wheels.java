package vehicle.domain.wheel;

public abstract class Wheels {
    private final int diameter;
    private final boolean isStudded;

    public Wheels(int diameter, boolean isStudded) {
        this.diameter = diameter;
        this.isStudded = isStudded;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "diameter=" + diameter +
                ", isStudded=" + isStudded +
                '}';
    }
}
