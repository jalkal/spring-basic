package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DemoXMLContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        CustomerService customerService = context.getBean(CustomerService.class);

        customerService.getCustomers().forEach(System.out::println);
    }
}