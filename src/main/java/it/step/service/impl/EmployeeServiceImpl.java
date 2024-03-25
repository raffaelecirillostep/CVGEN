package it.step.service.impl;

import it.step.model.Employee;
import it.step.repository.EmployeeRepo;
import it.step.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
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
    public Employee getOneById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public Employee update(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee deleteById(String id) {
        Employee employee = repo.findById(id).orElse(null);
        if (employee != null) {
            employee.setDeleted(true);
            employee.setDeletedAt(new Date());
        }
        return employee != null ? repo.save(employee) : null;
    }
}
