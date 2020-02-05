package vehicle.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import vehicle.domain.car.Car;
import vehicle.domain.car.Ferrari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FerrariFactory implements CarFactory {
    private final DetailsFactory factory;

    @Autowired
    public FerrariFactory(@Qualifier("sportCarDetailsFactory") DetailsFactory factory) {
        this.factory = factory;
    }

    @Override
    public Car createCar() {
        return new Ferrari(factory.createEngine(), factory.createWheels(), factory.createSeats());
    }
}
