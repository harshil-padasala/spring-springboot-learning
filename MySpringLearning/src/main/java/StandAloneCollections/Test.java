package StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stand-alone-collections/alone-collections.xml");
        State state = (State) context.getBean("gujarat", State.class);
        System.out.println(state);
    }
}
