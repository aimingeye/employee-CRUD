package com.example.Employee.controller;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/healthcheck")
    public String getHealth() {
        return "working...";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id)
    {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/register")
    public void registerEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable String id, @RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employeedel/{id}")
    public void removeEmployee(@PathVariable String id){
        employeeService.deleteById(id);
    }

}
