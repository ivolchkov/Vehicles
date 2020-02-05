package vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import vehicle.domain.car.Car;
import vehicle.factory.CarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {
    private final Car car;

    @Autowired
    public Application(@Qualifier("jeepFactory") CarFactory factory) {
        this.car = factory.createCar();
    }

    public void start() {
        car.drive();
        car.stop();
    }
}
