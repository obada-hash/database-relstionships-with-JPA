package com.example.jpafirst.controller;


import com.example.jpafirst.entity.Departement;
import com.example.jpafirst.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dep")
public class DepartementController {

    @Autowired
    DepartementService departementService;

    @GetMapping("/{id}")
    public Departement getDepartement(@PathVariable Long id) {
        return departementService.getDepartement(id);
    }

    @PostMapping()
    public void insert(@RequestBody Departement departement) {
        departementService.insert(departement);
    }

    @PutMapping()
    public void update(@RequestBody Departement departement) {
        departementService.update(departement);
    }
}
