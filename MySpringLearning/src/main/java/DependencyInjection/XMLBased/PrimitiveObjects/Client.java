package DependencyInjection.XMLBased.PrimitiveObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        HelloImpl h= new HelloImpl();
//        h.setGreet("Good Morning");
//        System.out.println(h.sayHello("Krishna and Harshil"));

        ApplicationContext ac = new ClassPathXmlApplicationContext("xml-config/primitive.xml");
        Hello h1 = (Hello) ac.getBean("h");
        System.out.println(h1.sayHello("Harshil"));

        Hello h2 = (Hello) ac.getBean("h");
        System.out.println(h2.sayHello("Krishna"));

        System.out.println(h1 == h2);

        // If we add scope="prototype" in bean tag in xml then it will create two objects

    }
}

