package com.example.NestDigital.controller;

import com.example.NestDigital.dao.SecurityDao;
import com.example.NestDigital.model.Employee;
import com.example.NestDigital.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class SecurityController {

    @Autowired
    private SecurityDao sd;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addsecurity", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> addSecurity(@RequestBody Security s) {
        System.out.println(s.getCode());
        System.out.println(s.getSecurityname());
        System.out.println(s.getContactno());
        System.out.println(s.getContactno());
        System.out.println(s.getUsername());
        System.out.println(s.getPassword());
        sd.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securitylogin", consumes = "application/json", produces ="application/json")
    public HashMap<String, String> securitylogin(@RequestBody Security s) {

        HashMap<String, String> map = new HashMap<>();
        List<Security> result =(List<Security>) sd.securitylogin(s.getUsername(), s.getPassword());

        if (result.size() == 0) {
            map.put("status", "failed");

        } else {
            int id = result.get(0).getId();
            map.put("message", "Security login success");
            map.put("userId", String.valueOf(id));
            map.put("status", "success");

        }
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewprofilesec",consumes = "application/json",produces = "application/json")
    public List<Security> viewprofilesecurity(@RequestBody Security s){
        return sd.viewprofilesec(s.getId());
    }
}

