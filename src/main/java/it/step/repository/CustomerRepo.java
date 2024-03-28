package it.step.repository;

import it.step.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepo extends MongoRepository<Customer, String> {

    List<Customer> findAllByIsDeletedFalse();
}
