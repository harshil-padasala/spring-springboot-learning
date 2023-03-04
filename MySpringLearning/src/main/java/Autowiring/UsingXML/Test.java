package Autowiring.UsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-config/xml-config.xml");
        Car car = (Car) context.getBean("car1");
        System.out.print(car);
    }
}
