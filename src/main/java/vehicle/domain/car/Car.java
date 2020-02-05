package vehicle.domain.car;


import vehicle.domain.engine.Engine;
import vehicle.domain.wheel.Wheels;

public class Car implements Vehicle {
    private final Engine engine;
    private final Wheels wheels;
    private final int seats;

    public Car(Engine engine, Wheels wheels, int seats) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", seats=" + seats +
                '}';
    }
}
