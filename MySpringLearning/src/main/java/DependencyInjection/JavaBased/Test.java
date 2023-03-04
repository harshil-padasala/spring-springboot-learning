package DependencyInjection.JavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        McLaren mcLaren = context.getBean("mc", McLaren.class);
//        System.out.println(mcLaren);

        Bugatti bugatti = context.getBean("getBugatti", Bugatti.class);
//        System.out.println(bugatti);

        Swift swift = context.getBean("swif", Swift.class);
        System.out.println(swift);

    }
}
