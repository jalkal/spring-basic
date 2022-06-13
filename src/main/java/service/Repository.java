package service;

import java.util.List;
import domain.Customer;

public interface Repository {
    List<Customer> getCustomers();
}
