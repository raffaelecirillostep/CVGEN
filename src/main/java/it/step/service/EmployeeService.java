package it.step.service;

import it.step.model.Customer;
import it.step.model.Employee;

import java.util.List;

public interface EmployeeService {


    public Employee save(Employee employee);
    public Employee getOneById (String id);
    public List<Employee> getAll ();
    public Employee update(Employee employee);
    public Employee deleteById(String id);
}
