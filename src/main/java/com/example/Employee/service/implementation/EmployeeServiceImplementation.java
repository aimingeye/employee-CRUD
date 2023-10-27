package com.example.Employee.service.implementation;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    /**
     * @param employee
     */
    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    /**
     * @param employee
     */
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }
}
