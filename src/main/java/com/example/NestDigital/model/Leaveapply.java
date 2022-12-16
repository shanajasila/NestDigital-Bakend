package com.example.NestDigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "leaveapply")
public class Leaveapply {
    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private String leavetype;
    private String reason;
    private String fromdate;
    private String todate;
    private String applydate;
    private int status;


    public Leaveapply() {
    }

    public Leaveapply(int id, int empid, String leavetype, String reason, String fromdate, String todate, String applydate, int status) {
        this.id = id;
        this.empid = empid;
        this.leavetype = leavetype;
        this.reason = reason;
        this.fromdate = fromdate;
        this.todate = todate;
        this.applydate = applydate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getEmpid() {
        return empid;
    }

    public String getLeavetype() {
        return leavetype;
    }

    public String getReason() {
        return reason;
    }

    public String getFromdate() {
        return fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public String getApplydate() {
        return applydate;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public void setApplydate(String applydate) {
        this.applydate = applydate;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}