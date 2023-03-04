package LifeCycleMethods.UsingAnnotations;

import LifeCycleMethods.UsingInterface.Bugatti;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("life-cycle-config/interface-config.xml");
//        Bugatti bugatti = (Bugatti) context.getBean("bugatti1");
//        System.out.println(bugatti);

        // By default, destroy method is not called so use this way
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("life-cycle-config/annotation-config.xml");
        // for invoking destroy method - register for ShutdownHook using AbstractApplicationContext
        context1.registerShutdownHook();

        Lamborghini lamborghini1 = (Lamborghini) context1.getBean("lamborghini1");
        System.out.println(lamborghini1);

        Lamborghini lamborghini2 = (Lamborghini) context1.getBean("lamborghini2");
        System.out.println(lamborghini2);

    }
}
