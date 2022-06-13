package service;

import main.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("service")
public class MyConfiguration{

    @Autowired
    Repository repository;

    @Bean
    CustomerService serviceFromMemory(){
        return new CustomerServiceFromDB(repository);
    }
}
