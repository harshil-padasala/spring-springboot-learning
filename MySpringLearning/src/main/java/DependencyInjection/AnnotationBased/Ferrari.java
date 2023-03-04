package DependencyInjection.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class Ferrari implements Car {
    @Override
    public String getCarName() {
        return "Ferrari F8";
    }

    @Override
    public int getPrice() {
        return 3456789;
    }
}
