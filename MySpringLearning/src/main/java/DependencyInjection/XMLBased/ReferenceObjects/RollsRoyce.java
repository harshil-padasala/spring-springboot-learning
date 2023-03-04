package DependencyInjection.XMLBased.ReferenceObjects;

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
