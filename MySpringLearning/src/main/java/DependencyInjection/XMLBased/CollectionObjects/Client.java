package DependencyInjection.XMLBased.CollectionObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("xml-config/collection.xml");
        A a = (A) ac.getBean("a");
        System.out.println(a.getList());
        System.out.println(a.getSet());
        System.out.println(a.getMap());
        System.out.println(a.getProperties());
    }
}