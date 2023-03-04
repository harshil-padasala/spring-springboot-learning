package DependencyInjection.XMLBased.PrimitiveObjects;

public class HelloImpl implements Hello {

    private String greet;

    public HelloImpl() {
        System.out.println("HelloImpl constructor.....");
    }

    public void setGreet(String greet) {
        System.out.println("Setting greet ---> " + greet);
        this.greet = greet;
    }

    @Override
    public String sayHello(String name) {
        return this.greet + ", " + name;
    }
}
