package service;

import java.util.List;
import domain.Customer;

@org.springframework.stereotype.Repository
public class RepositoryMyBatis implements Repository{

    @Override
    public List<Customer> getCustomers() {
        return List.of(new Customer("iria", "miguez"), new Customer("cliona", "murphy"));
    }
}
