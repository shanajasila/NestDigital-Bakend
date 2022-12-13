package com.example.NestDigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitors")
public class VisitorslogModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String purpose;
    private String whomtomeet;

    private String date;
    private String entry_datetime;
    private String exit_datetime;

    public VisitorslogModel() {
    }

    public VisitorslogModel(int id, String name, String purpose, String whomtomeet, String date, String entry_datetime, String exit_datetime) {
        this.id = id;
        this.name = name;
        this.purpose = purpose;
        this.whomtomeet = whomtomeet;
        this.date = date;
        this.entry_datetime = entry_datetime;
        this.exit_datetime = exit_datetime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getWhomtomeet() {
        return whomtomeet;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setWhomtomeet(String whomtomeet) {
        this.whomtomeet = whomtomeet;
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
