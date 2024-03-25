package it.step.mapper;

import it.step.dto.CustomerDTO;
import it.step.model.Customer;

public interface CustomerMapper {

    public CustomerDTO customerToCustomerDTO (Customer customer);

    public Customer customerDTOToCustomer (CustomerDTO customerDTO);
}
