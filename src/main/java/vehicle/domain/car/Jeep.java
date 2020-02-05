package vehicle.domain.car;

import vehicle.domain.engine.Engine;
import vehicle.domain.wheel.Wheels;

public class Jeep extends Car {
    public Jeep(Engine engine, Wheels wheels, int seats) {
        super(engine, wheels, seats);
    }

    @Override
    public void drive() {
        System.out.println("Jeep is driving");
    }

    @Override
    public void stop() {
        System.out.println("Jeep has stopped");
    }
}
