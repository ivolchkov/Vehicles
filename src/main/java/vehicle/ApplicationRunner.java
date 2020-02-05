package vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vehicle.configuration.VehicleConfiguration;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfiguration.class);

        Application application = context.getBean(Application.class);

        application.start();
    }
}
