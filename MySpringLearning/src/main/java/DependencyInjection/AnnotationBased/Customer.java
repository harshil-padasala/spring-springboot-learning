package DependencyInjection.AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml-config/annotation.xml");
//        Producer producer = context.getBean(Producer.class);
//        System.out.println("Car: " + producer.getCar().getCarName() + "\nPrice: " + producer.getCar().getPrice());
        Car car = context.getBean(McLaren.class);
        System.out.println(car.getCarName());

    }
}
