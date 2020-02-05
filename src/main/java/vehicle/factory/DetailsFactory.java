package vehicle.factory;

import vehicle.domain.engine.Engine;
import vehicle.domain.wheel.Wheels;

public interface DetailsFactory {
    Wheels createWheels();
    Engine createEngine();
    int createSeats();
}
