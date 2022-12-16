package com.example.NestDigital.controller;

import com.example.NestDigital.dao.LeaveapplyDao;
import com.example.NestDigital.model.Employee;
import com.example.NestDigital.model.LeavCounter;
import com.example.NestDigital.model.Leaveapply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LeaveController {

    @Autowired
    private LeaveapplyDao ldao;

    Date currentDate=new Date();

    @CrossOrigin(origins ="*")
    @PostMapping(path ="/applyleave",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> ApplyLeave(@RequestBody Leaveapply lv){


        lv.setApplydate(String.valueOf(currentDate));
        lv.setStatus(0);
        ldao.save(lv);

            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("status","success");
            return hashMap;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewalleavebyemp")
   public List<Map<String,String>>ViewAllLeave(){return (List<Map<String,String>>)ldao.ViewAllLeave();}

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/update",consumes = "application/json",produces = "application/json")
    public Map<String,String> UpdateStatus(@RequestBody Leaveapply l)
    {
        String empid=String.valueOf(l.getEmpid());
        String status=String.valueOf(l.getStatus());
        System.out.println(empid);
        System.out.println(status);
        ldao.UpdateStatus(l.getEmpid(),l.getStatus());

        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/accept",consumes = "application/json",produces = "application/json")
    public Map<String,String> AcceptLeave(@RequestBody Leaveapply l)
    {
        ldao.AcceptLeave(l.getEmpid());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");

        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchstatus",consumes = "application/json",produces = "application/json")
    public List<Leaveapply> SearchStatus(@RequestBody Leaveapply l)
    {
        String empid=String.valueOf(l.getEmpid());
        System.out.println(empid);
        return (List<Leaveapply>) ldao.SearchStatus(l.getEmpid());
    }



}
