package it.step.mapper;

import it.step.dto.EmployeeDTO;
import it.step.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface EmployeeMapper {

    public EmployeeDTO employeeToEmployeeDTO (Employee customer);

    public Employee employeeDTOToEmployee (EmployeeDTO customerDTO);

    public List<EmployeeDTO> employeesToEmployeeDTOs (List<Employee> customers);

    public List<Employee> employeeDTOsToEmployees (List<EmployeeDTO> customerDTOs);
}
