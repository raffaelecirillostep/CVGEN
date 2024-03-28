package it.step.repository;

import it.step.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
    List<Employee> findAllByIsDeletedFalse();
}
