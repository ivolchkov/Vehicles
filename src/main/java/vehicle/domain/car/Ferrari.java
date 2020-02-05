package vehicle.domain.car;

import vehicle.domain.engine.Engine;
import vehicle.domain.wheel.Wheels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Ferrari extends Car {
    public Ferrari(Engine engine, Wheels wheels, int seats) {
        super(engine, wheels, seats);
    }

    @Override
    public void drive() {
        System.out.println("Ferrari is driving");
    }

    @Override
    public void stop() {
        System.out.println("Ferrari has stopped");
    }
}
