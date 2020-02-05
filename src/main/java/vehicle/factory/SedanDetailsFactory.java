package vehicle.factory;

import vehicle.domain.engine.Engine;
import vehicle.domain.engine.SedanEngine;
import vehicle.domain.wheel.SedanWheels;
import vehicle.domain.wheel.Wheels;
import org.springframework.stereotype.Component;

@Component
public class SedanDetailsFactory implements DetailsFactory {
    @Override
    public Wheels createWheels() {
        return new SedanWheels();
    }

    @Override
    public Engine createEngine() {
        return new SedanEngine();
    }

    @Override
    public int createSeats() {
        return 4;
    }


}
