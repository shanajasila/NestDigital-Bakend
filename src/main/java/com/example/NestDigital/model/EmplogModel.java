package com.example.NestDigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employeelog")
public class EmplogModel {

    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String date;
    private String entry_datetime;
    private String exit_datetime;

    public EmplogModel() {
    }

    public EmplogModel(int id, int empcode, String date, String entry_datetime, String exit_datetime) {
        this.id = id;
        this.empcode = empcode;
        this.date = date;
        this.entry_datetime = entry_datetime;
        this.exit_datetime = exit_datetime;
    }

    public int getId() {
        return id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public String getDate() {
        return date;
    }

    public String getEntry_datetime() {
        return entry_datetime;
    }

    public String getExit_datetime() {
        return exit_datetime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEntry_datetime(String entry_datetime) {
        this.entry_datetime = entry_datetime;
    }

    public void setExit_datetime(String exit_datetime) {
        this.exit_datetime = exit_datetime;
    }
}
