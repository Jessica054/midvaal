package com.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    Integer id;
    String name;
    String email;
    LocalDate date_of_birth;

    public Employee() {
    }

    public Employee(Integer id, String name, String email, LocalDate date_of_birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}