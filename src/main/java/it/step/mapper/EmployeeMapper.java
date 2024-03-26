package it.step.mapper;

import it.step.dto.EmployeeDTO;
import it.step.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface EmployeeMapper {

    public EmployeeDTO employeeToEmployeeDTO (Employee customer);

    public Employee employeeDTOToEmployee (EmployeeDTO customerDTO);
}
