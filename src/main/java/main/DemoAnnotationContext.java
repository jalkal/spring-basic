package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MyConfiguration;

public class DemoAnnotationContext {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        CustomerService customerService = (CustomerService) context.getBean("serviceFromMemory");

        customerService.getCustomers().forEach(System.out::println);
    }
}