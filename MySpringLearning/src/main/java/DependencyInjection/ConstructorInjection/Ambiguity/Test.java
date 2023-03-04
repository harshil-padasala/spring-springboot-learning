package DependencyInjection.ConstructorInjection.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml-config/constructor-injection.xml");
        Addition add1 = (Addition) context.getBean("add1");
        System.out.println(add1.doAddition());

        Addition add2 = (Addition) context.getBean("add2");
        System.out.println(add2.doAddition());

        Addition add3 = (Addition) context.getBean("add3");
        System.out.println(add3.doAddition());
    }
}
