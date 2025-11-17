package com.example.jpafirst.repository;

import com.example.jpafirst.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepo extends JpaRepository<Departement, Long> {


}
