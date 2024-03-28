package it.step.service.impl;

import it.step.model.Employee;
import it.step.repository.EmployeeRepo;
import it.step.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo repo;
    @Override
    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Optional<Employee> getOneById(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Employee> findAllByIsDeletedFalse() {
        return repo.findAllByIsDeletedFalse();
    }

    @Override
    public Employee update(Employee employee) {
        if(repo.existsById(employee.getId()))
            return repo.save(employee);
        else
            return null;
    }

    @Override
    public Employee deleteById(String id) {
        Employee employee = repo.findById(id).orElse(null);
        if (employee != null && !employee.getIsDeleted()) {
            employee.setIsDeleted(true);
            employee.setDeletedAt(new Date());
            employee = repo.save(employee);
        }
        return employee;
    }
}
