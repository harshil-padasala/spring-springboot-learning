package LifeCycleMethods.UsingInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("life-cycle-config/interface-config.xml");
//        Bugatti bugatti = (Bugatti) context.getBean("bugatti1");
//        System.out.println(bugatti);

        // By default, destroy method is not called so use this way
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("life-cycle-config/interface-config.xml");
        // for invoking destroy method - register for ShutdownHook using AbstractApplicationContext
        context1.registerShutdownHook();

        Bugatti bugatti1 = (Bugatti) context1.getBean("bugatti1");
        System.out.println(bugatti1);

        Bugatti bugatti2 = (Bugatti) context1.getBean("bugatti2");
        System.out.println(bugatti2);

    }
}
