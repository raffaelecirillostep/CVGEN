package it.step.service.impl;

import it.step.model.Customer;
import it.step.repository.CustomerRepo;
import it.step.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo repo;
    @Override
    public Customer save(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public Optional<Customer> getOneById(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Customer> getAll() {
        return repo.findAll();
    }

    @Override
    public Customer update(Customer customer) {
        if(repo.existsById(customer.getId()))
            return repo.save(customer);
        else
            return null;
    }

    @Override
    public Customer deleteById(String id) {
        Customer customer = repo.findById(id).orElse(null);
        if(customer != null && !customer.getIsDeleted()) {
            customer.setIsDeleted(true);
            customer.setDeletedAt(new Date());
            customer = repo.save(customer);
        }
        return customer;
    }
}
