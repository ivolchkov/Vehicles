package vehicle.domain.car;

import vehicle.domain.engine.Engine;
import vehicle.domain.wheel.Wheels;

public class Skoda extends Car {
    public Skoda(Engine engine, Wheels wheels, int seats) {
        super(engine, wheels, seats);
    }

    @Override
    public void drive() {
        System.out.println("Skoda is driving");
    }

    @Override
    public void stop() {
        System.out.println("Skoda has stopped");
    }
}
