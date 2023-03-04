package DependencyInjection.ConstructorInjection.Ambiguity;

public class Addition {
    private final int num1;
    private final int num2;

    public Addition(double num1, double num2) {
        this.num1 = (int) num1;
        this.num2 = (int) num2;
        System.out.println("Constructor is called: (double, double)");
    }

    public Addition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Constructor is called: (int, int)");
    }


    public Addition(String num1, String num2) {
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
        System.out.println("Constructor is called: (String, String)");
    }

    public int doAddition() {
        return this.num2 + this.num1;
    }
}
