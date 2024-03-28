package it.step.controller;

import it.step.dto.CustomerDTO;
import it.step.mapper.CustomerMapper;
import it.step.model.Customer;
import it.step.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @GetMapping("all")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        try {
            List<Customer> customers = customerService.getAll();
            List<CustomerDTO> response = new ArrayList<>();
            customers.forEach(customer -> {
                response.add(customerMapper.customerToCustomerDTO(customer));
            });

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerDTO> getAllCustomers(@PathVariable("id") String id) {
        try {
            Optional<Customer> customer = customerService.getOneById(id);
            CustomerDTO response;

            if(customer.isPresent()){
                response = customerMapper.customerToCustomerDTO(customer.get());
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update")
    public ResponseEntity<CustomerDTO> updateCustomer(@RequestBody CustomerDTO customerDTO) {
        try {
            if(customerDTO.getId().isEmpty()){
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            CustomerDTO dto;
            Customer customer = customerMapper.customerDTOToCustomer(customerDTO);
            customerService.save(customer);

            dto= customerMapper.customerToCustomerDTO(customer);


            return new ResponseEntity<>(dto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<CustomerDTO> deleteCustomer(@PathVariable("id") String id) {
        try {
            Optional<Customer> customer = customerService.deleteById(id);
            CustomerDTO response;

            if(customer.isPresent()){
                response = customerMapper.customerToCustomerDTO(customer.get());
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("save")
    public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        try {
            Customer customer = customerService.save(
                    customerMapper.customerDTOToCustomer(customerDTO)
            );
            CustomerDTO response = customerMapper.customerToCustomerDTO(customer);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
