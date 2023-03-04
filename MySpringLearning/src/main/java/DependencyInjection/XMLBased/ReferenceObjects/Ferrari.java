package DependencyInjection.XMLBased.ReferenceObjects;

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
