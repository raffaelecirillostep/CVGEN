package it.step.controller;

import it.step.dto.EmployeeDTO;
import it.step.mapper.EmployeeMapper;
import it.step.model.Employee;
import it.step.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;
    private final EmployeeMapper mapper;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeDTO>> getAllByIsDeletedFalse(/*@RequestParam(value = "page") Integer page, @RequestParam(value = "num") Integer number4Page*/ ){
        ResponseEntity<List<EmployeeDTO>> res = null;
        try {
            List<Employee> employees = service.findAllByIsDeletedFalse();
            if (employees.isEmpty()) {
                res = ResponseEntity.notFound().build();
            } else {
                res = ResponseEntity.ok(mapper.employeesToEmployeeDTOs(employees));
            }
        }catch(Exception e){
            e.printStackTrace();
            res = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return res;
    }


    @GetMapping(value = "/all/includeDeleted", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeDTO>> getAll(){
        ResponseEntity<List<EmployeeDTO>> res = null;
        try {
            List<Employee> employees = service.getAll();
            if (employees.isEmpty()) {
                res = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            } else {
                res = ResponseEntity.ok(mapper.employeesToEmployeeDTOs(employees));
            }
        }catch(Exception e){
            e.printStackTrace();
            res = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return res;
    }


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeDTO> getById(@PathVariable(name = "id") String id){
        ResponseEntity<EmployeeDTO> res = null;
        try {
            Optional<Employee> employee = service.getOneById(id);
            if (employee.isPresent()) {
                res = ResponseEntity.ok(mapper.employeeToEmployeeDTO(employee.get()));
            } else {
                res = ResponseEntity.notFound().build();
            }
        }catch(Exception e){
            e.printStackTrace();
            res = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return res;
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeDTO> saveOne(@RequestBody EmployeeDTO employeeDTO){
        ResponseEntity<EmployeeDTO> res = null;
        try{
            if(employeeDTO != null){
                employeeDTO.setId(null);
                Employee emp = service.save(mapper.employeeDTOToEmployee(employeeDTO));
                res = ResponseEntity.ok(mapper.employeeToEmployeeDTO(emp));
            }else{
                res = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }catch(Exception e){
            e.printStackTrace();
            res = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return res;
    }

    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeDTO> updateOne(@RequestBody EmployeeDTO employeeDTO){
        ResponseEntity<EmployeeDTO> res = null;
        try{
            if(employeeDTO != null){
                Employee emp = service.update(mapper.employeeDTOToEmployee(employeeDTO));
                res = ResponseEntity.ok(mapper.employeeToEmployeeDTO(emp));
            }else{
                res = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }catch(Exception e){
            e.printStackTrace();
            res = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return res;
    }

    @DeleteMapping(value = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeDTO> deleteById(@PathVariable(name = "id") String id){
        ResponseEntity<EmployeeDTO> res = null;
        try{
            Employee emp = service.deleteById(id);
            if(emp != null){
                res = ResponseEntity.ok(mapper.employeeToEmployeeDTO(emp));
            }else{
                res = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        }catch(Exception e){
            e.printStackTrace();
            res = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return res;
    }

}