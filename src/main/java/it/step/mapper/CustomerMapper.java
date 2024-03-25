package it.step.mapper;

import it.step.dto.CustomerDTO;
import it.step.model.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    public CustomerDTO customerToCustomerDTO (Customer customer);

    public Customer customerDTOToCustomer (CustomerDTO customerDTO);
}
