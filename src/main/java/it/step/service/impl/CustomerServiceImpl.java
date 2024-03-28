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
        return repo.save(customer);
    }

    @Override
    public Customer deleteById(String id) {
        Customer c = repo.findById(id).orElse(null);
        if(c != null && !c.getIsDeleted()) {
            c.setIsDeleted(true);
            c.setDeletedAt(new Date());
        }
        return c != null ? repo.save(c) : null;
    }
}
