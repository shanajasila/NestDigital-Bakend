package com.example.NestDigital.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String empcode;
    private String empname;
    private String designation;
    private String contact;
    private String email;
    private String username;
    private String password;

    public Employee() {
    }

    public Employee(int id, String empcode, String empname, String designation, String contact, String email, String username, String password) {
        this.id = id;
        this.empcode= empcode;
        this.empname = empname;
        this.designation = designation;
        this.contact = contact;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmpcode (){
        return empcode;
    }

    public String getEmpname() {
        return empname;
    }

    public String getDesignation() {
        return designation;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
