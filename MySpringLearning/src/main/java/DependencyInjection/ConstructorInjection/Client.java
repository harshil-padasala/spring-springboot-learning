package DependencyInjection.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml-config/constructor-injection.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person);
    }
}
