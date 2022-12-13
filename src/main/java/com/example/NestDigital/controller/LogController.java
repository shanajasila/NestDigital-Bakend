package com.example.NestDigital.controller;

import com.example.NestDigital.dao.EmplogDao;
import com.example.NestDigital.dao.VisitorslogDao;
import com.example.NestDigital.model.EmplogModel;
import com.example.NestDigital.model.VisitorslogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogController {
    @Autowired
    private EmplogDao dao;
    @Autowired
    private VisitorslogDao d;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/emplog",consumes = "application/json",produces = "application/json")
    public Map<String,String> EmployLog(@RequestBody EmplogModel l)
    {
        System.out.println(l.getEmpcode());
        System.out.println(l.getDate().toString());
        System.out.println(l.getEntry_datetime().toString());
        System.out.println(l.getExit_datetime().toString());
        dao.save(l);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewallemplog")
    public List<EmplogModel> ViewAllEMpLog()
    {
        return (List<EmplogModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewdailyemplog",consumes = "application/json",produces = "application/json")
    public List<EmplogModel> ViewDailyEmpLog(@RequestBody EmplogModel e)
    {
        return (List<EmplogModel>) dao.ViewDailyEmpLog(e.getDate());
    }



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/logvisitor",consumes = "application/json",produces = "application/json")
    public Map<String,String> VisitorLog(@RequestBody VisitorslogModel v)
    {
        System.out.println(v.getName().toString());
        System.out.println(v.getWhomtomeet().toString());
        System.out.println(v.getPurpose().toString());
        System.out.println(v.getEntry_datetime().toString());
        System.out.println(v.getExit_datetime().toString());
        d.save(v);
        HashMap<String,String> map =new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewallvisitorlog")
    public List<VisitorslogModel> ViewAllVisitorLog()
    {
        return (List<VisitorslogModel>)d.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewDailyVisitorlog",consumes = "application/json",produces = "application/json")
    public List<VisitorslogModel> ViewDailyVisitorLog(@RequestBody VisitorslogModel v)
    {
        return (List<VisitorslogModel>) d.ViewDailyVisitorLog(v.getDate());
    }
}
