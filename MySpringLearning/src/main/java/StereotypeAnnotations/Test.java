package StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereo-type/config.xml");
        McLaren mcLaren = context.getBean("mc", McLaren.class);
        System.out.println(mcLaren);
    }
}
