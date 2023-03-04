package DependencyInjection.JavaBased;

public class Swift {

    private Engine engine;

    public Swift(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Swift{" +
                "engine=" + engine +
                '}';
    }
}
