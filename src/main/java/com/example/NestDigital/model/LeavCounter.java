package com.example.NestDigital.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leavecounter")
public class LeavCounter {

    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private int casual=20;
    private int sick=7;
    private int special=3;
    private String year;

    public LeavCounter() {
    }

    public LeavCounter(int id, int empid, int casual, int sick, int special, String year) {
        this.id = id;
        this.empid = empid;
        this.casual = casual;
        this.sick = sick;
        this.special = special;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public int getEmpid() {
        return empid;
    }

    public int getCasual() {
        return casual;
    }

    public int getSick() {
        return sick;
    }

    public int getSpecial() {
        return special;
    }

    public String getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setCasual(int casual) {
        this.casual = casual;
    }

    public void setSick(int sick) {
        this.sick = sick;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
