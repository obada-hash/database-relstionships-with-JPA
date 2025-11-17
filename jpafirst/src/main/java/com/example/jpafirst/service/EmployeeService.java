package com.example.jpafirst.service;


import com.example.jpafirst.entity.Employee;
import com.example.jpafirst.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    public List<Employee> findByDepartementId(Long delpartementId) {
        return employeeRepo.findByDepartementId(delpartementId);
    }
}
