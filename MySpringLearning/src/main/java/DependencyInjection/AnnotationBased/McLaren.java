package DependencyInjection.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class McLaren implements Car {
    @Override
    public String getCarName() {
        return "McLaren GT";
    }

    @Override
    public int getPrice() {
        return 2345678;
    }
}

