package com.example.Employee.service;

import com.example.Employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> getEmployeeById(String id);

    List<Employee> findAll();

    void createEmployee(Employee employee);

    void saveEmployee(Employee employee);

    void deleteById(String id);
}
