package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.jdbc.query.Query;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xml-config.xml");
        Query impl = context.getBean("query", Query.class);

        System.out.println(impl.getAllStudents());


    }
}