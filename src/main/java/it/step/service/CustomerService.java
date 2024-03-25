package it.step.service;


import it.step.model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer save(Customer customer);
    public Customer getOneById (String id);
    public List<Customer> getAll ();
    public Customer update(Customer customer);
    public Customer deleteById(String id);

}
