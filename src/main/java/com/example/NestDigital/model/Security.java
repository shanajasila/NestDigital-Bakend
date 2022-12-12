package com.example.NestDigital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue
    private int id;
    private String code;
    private String securityname;
    private String contactno;
    private String username;
    private String password;

    public Security() {
    }

    public Security(int id, String code, String securityname, String contactno, String username, String password) {
        this.id = id;
        this.code = code;
        this.securityname = securityname;
        this.contactno = contactno;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getSecurityname() {
        return securityname;
    }

    public String getContactno() {
        return contactno;
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setSecurityname(String securityname) {
        this.securityname = securityname;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
