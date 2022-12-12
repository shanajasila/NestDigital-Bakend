package com.example.NestDigital.dao;

import com.example.NestDigital.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value ="SELECT `id`, `contact`, `designation`, `email`, `empname`, `password`, `username`, `empcode` FROM `employee` WHERE `username`= :username AND `password`= :password",nativeQuery = true)
    List<Employee> emplogin(@Param("username")String username,@Param("password")String password);

    @Query(value = "SELECT `id`, `contact`, `designation`, `email`, `empcode`, `empname`, `password`, `username` FROM `employee` WHERE `empcode`= :empcode",nativeQuery = true)
    List<Employee>searchemp(@Param("empcode")String empcode);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employee` WHERE `id`= :id",nativeQuery = true)
    void deleteEmployee(@Param("id")Integer id);

    @Query(value = "SELECT `id`, `contact`, `designation`, `email`, `empname`, `password`, `username`, `empcode` FROM `employee` WHERE `id`= :id",nativeQuery = true)
    List<Employee>viewprofile(@Param("id")Integer id );



}
