package it.step.service;

import it.step.model.Customer;
import it.step.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    public Employee save(Employee employee);
    public Optional<Employee> getOneById (String id);
    public List<Employee> getAll ();
    public List<Employee> findAllByIsDeletedFalse();
    public Employee update(Employee employee);
    public Employee deleteById(String id);
}
