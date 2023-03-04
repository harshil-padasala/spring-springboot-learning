package DependencyInjection.AnnotationBased;

public class Producer {
    Car car;

    // Setter Method
    public void setCar(Car car) {
        this.car = car;
    }

    // Getter Method
    public Car getCar() {
        return this.car;
    }
}
