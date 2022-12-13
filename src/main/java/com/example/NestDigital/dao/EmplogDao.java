package com.example.NestDigital.dao;

import com.example.NestDigital.model.EmplogModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmplogDao extends CrudRepository<EmplogModel,Integer> {

    @Query(value = "SELECT `id`, `date`, `empcode`, `entry_datetime`, `exit_datetime` FROM `Employeelog` WHERE `date`= :date",nativeQuery = true)
    List<EmplogModel> ViewDailyEmpLog(@Param("date") String date);
}

