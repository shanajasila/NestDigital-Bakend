package com.example.NestDigital.dao;

import com.example.NestDigital.model.VisitorslogModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VisitorslogDao extends CrudRepository<VisitorslogModel,Integer> {
    @Query(value = "SELECT `id`, `entry_datetime`, `exit_datetime`, `name`, `purpose`, `whomtomeet`, `date` FROM `visitors` WHERE `date`= :date",nativeQuery = true)
    List<VisitorslogModel> ViewDailyVisitorLog(@Param("date") String date);
}
