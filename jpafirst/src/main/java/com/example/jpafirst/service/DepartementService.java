package com.example.jpafirst.service;

import com.example.jpafirst.entity.Departement;
import com.example.jpafirst.repository.DepartementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementService {

    @Autowired
    DepartementRepo departementRepo;

    public Departement getDepartement(Long id) {
        return departementRepo.findById(id).orElseThrow();
    }

    public void insert(Departement departement) {
        departementRepo.save(departement);
    }

    public void update(Departement departement) {
        departementRepo.save(departement);
    }
}
