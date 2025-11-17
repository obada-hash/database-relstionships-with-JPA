package com.example.jpafirst.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Entity
@Table(name = "hr_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "imp_name")
    private String name;
    private double salary;
    @ManyToOne
    @JoinColumn(name = "departement_id")
    @JsonIgnore
    private Departement departement;



    public Employee() {
        super();
    }

    public Employee(Long id, String name, double salary, Departement departement) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departement = departement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
