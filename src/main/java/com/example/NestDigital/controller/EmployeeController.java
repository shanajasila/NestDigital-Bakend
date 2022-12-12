package com.example.NestDigital.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class EmployeeController {

    @CrossOrigin(origins ="*")
    @PostMapping(path ="/addemp",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> addemployee(@RestController )
}
