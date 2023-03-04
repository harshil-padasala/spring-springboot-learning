package LifeCycleMethods.UsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("life-cycle-config/xml-config.xml");
//        McLaren mcLaren = (McLaren) context.getBean("mcLaren");
//        System.out.print(mcLaren);

        // By default, destroy method is not called so use this way
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("life-cycle-config/xml-config.xml");
        // for invoking destroy method - register for ShutdownHook using AbstractApplicationContext
        context1.registerShutdownHook();

        McLaren mcLaren1 = (McLaren) context1.getBean("mcLaren");
        System.out.println(mcLaren1);

    }
}
