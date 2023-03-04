package DependencyInjection.XMLBased.ReferenceObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml-config/any-object.xml");
        Producer producer = (Producer) context.getBean("producer");
        System.out.println("Car: " + producer.getCar().getCarName() + "\nPrice: " + producer.getCar().getPrice());

    }
}
