package it.step.service;


import it.step.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public Customer save(Customer customer);
    public Optional<Customer> getOneById (String id);
    public List<Customer> getAll ();
    public Optional<Customer> deleteById(String id);

}
