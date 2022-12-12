package com.example.NestDigital.controller;

import com.example.NestDigital.dao.EmployeeDao;
import com.example.NestDigital.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins ="*")
    @PostMapping(path ="/addemp",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> addemployee(@RequestBody Employee e){
        System.out.println(e.getEmpcode());
        System.out.println(e.getEmpname());
        System.out.println(e.getDesignation());
        System.out.println(e.getContact());
        System.out.println(e.getEmail());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());
        dao.save(e);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Employee> searchEmployee(@RequestBody Employee e){
        String empcode=String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return(List<Employee>)dao.searchemp(e.getEmpcode());
    }

    @CrossOrigin(origins ="*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> delete(@RequestBody Employee d){
        String id=String.valueOf(d.getId());
        System.out.println(id);
        dao.deleteEmployee(d.getId());
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> viewpage(){
        return(List<Employee>)dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> login(@RequestBody Employee e){

        HashMap<String,String> map=new HashMap<>();
        List<Employee> result= dao.emplogin(e.getUsername(),e.getPassword());

        if (result.size()==0){
            map.put("status","failed");

        }else {
            int id =result.get(0).getId();
            map.put("message","Employee login success");
            map.put("userId",String.valueOf(id));
            map.put("status","success");

        }
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewprofile",consumes = "application/json",produces = "application/json")
    public List<Employee> viewprofile(@RequestBody Employee e){
        return dao.viewprofile(e.getId());
    }

}
