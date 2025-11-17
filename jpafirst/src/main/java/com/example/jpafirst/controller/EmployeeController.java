package com.example.jpafirst.controller;


import com.example.jpafirst.entity.Employee;
import com.example.jpafirst.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping()
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/{id}")
    public List<Employee> findByDepartementId(@PathVariable Long id) {
        return employeeService.findByDepartementId(id);
    }



}
