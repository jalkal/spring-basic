package service;

import java.util.List;
import domain.Customer;
import main.CustomerService;


public class CustomerServiceFromDB implements CustomerService {

    public CustomerServiceFromDB(Repository repository) {
        this.repository = repository;
    }

    private final Repository repository;
    @Override
    public List<Customer> getCustomers() {
        return repository.getCustomers();
    }
}
