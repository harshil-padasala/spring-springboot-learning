package DependencyInjection.XMLBased.ReferenceObjects;

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

