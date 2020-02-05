package vehicle.factory;

import vehicle.domain.car.Car;
import vehicle.domain.car.Jeep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JeepFactory implements CarFactory {
    private final DetailsFactory factory;

    @Autowired
    public JeepFactory(@Qualifier("jeepDetailsFactory") DetailsFactory factory) {
        this.factory = factory;
    }

    @Override
    public Car createCar() {
        return new Jeep(factory.createEngine(), factory.createWheels(), factory.createSeats());
    }
}
