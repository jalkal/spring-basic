package service;

import java.util.List;
import domain.Customer;
import main.CustomerService;
import org.springframework.stereotype.Service;


class CustomerServiceFromMemory implements CustomerService {
    @Override
    public List<Customer> getCustomers() {
        return List.of(new Customer("pepe", "moyano"), new Customer("ivan", "correa"));
    }
}
