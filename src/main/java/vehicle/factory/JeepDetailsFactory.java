package vehicle.factory;

import vehicle.domain.engine.Engine;
import vehicle.domain.engine.JeepEngine;
import vehicle.domain.wheel.JeepWheels;
import vehicle.domain.wheel.Wheels;
import org.springframework.stereotype.Component;

@Component
public class JeepDetailsFactory implements DetailsFactory {
    @Override
    public Wheels createWheels() {
        return new JeepWheels();
    }

    @Override
    public Engine createEngine() {
        return new JeepEngine();
    }

    @Override
    public int createSeats() {
        return 6;
    }
}
