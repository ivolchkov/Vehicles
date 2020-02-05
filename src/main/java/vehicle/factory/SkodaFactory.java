package vehicle.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import vehicle.domain.car.Car;
import vehicle.domain.car.Skoda;
import org.springframework.stereotype.Component;

@Component
public class SkodaFactory implements CarFactory {
    private final DetailsFactory factory;

    public SkodaFactory(@Qualifier("sedanDetailsFactory") DetailsFactory factory) {
        this.factory = factory;
    }

    @Override
    public Car createCar() {
        return new Skoda(factory.createEngine(), factory.createWheels(), factory.createSeats());
    }
}
