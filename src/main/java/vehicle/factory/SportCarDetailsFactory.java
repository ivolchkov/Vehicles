package vehicle.factory;

import vehicle.domain.engine.Engine;
import vehicle.domain.engine.SportCarEngine;
import vehicle.domain.wheel.SportCarWheels;
import vehicle.domain.wheel.Wheels;
import org.springframework.stereotype.Component;

@Component
public class SportCarDetailsFactory implements DetailsFactory {
    @Override
    public Wheels createWheels() {
        return new SportCarWheels();
    }

    @Override
    public Engine createEngine() {
        return new SportCarEngine();
    }

    @Override
    public int createSeats() {
        return 2;
    }
}
