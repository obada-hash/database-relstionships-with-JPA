package com.example.jpafirst.repository;

import com.example.jpafirst.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartementId(Long id);


}
