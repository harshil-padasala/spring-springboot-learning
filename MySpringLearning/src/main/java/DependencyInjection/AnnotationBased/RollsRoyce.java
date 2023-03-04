package DependencyInjection.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class RollsRoyce implements Car {

    @Override
    public String getCarName() {
        return "Rolls Royce Ghost";
    }

    @Override
    public int getPrice() {
        return 1234567;
    }
}
