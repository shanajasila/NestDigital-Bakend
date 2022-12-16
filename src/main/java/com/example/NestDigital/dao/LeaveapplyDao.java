package com.example.NestDigital.dao;

import com.example.NestDigital.model.Leaveapply;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface LeaveapplyDao extends CrudRepository<Leaveapply,Integer> {

    @Query(value = "SELECT  e.`empcode`, e.`empname`,l.leavetype,l.applydate,l.fromdate,l.todate,l.status,l.reason,l.empid FROM `employee` e JOIN leaveapply l ON e.id=l.empid",nativeQuery = true)
    List<Map<String,String>> ViewAllLeave();
@Modifying
@Transactional
@Query(value = "UPDATE `leaveapply` SET `status`= :status WHERE `empid`= :empid",nativeQuery = true)
void UpdateStatus(@Param("empid") Integer empid,@Param("status") Integer status);



    @Modifying
    @Transactional
    @Query(value = "UPDATE `leaveapply` SET `status`= 1 WHERE `empid`= :empid",nativeQuery = true)
    void AcceptLeave(@Param("empid") Integer empid);


    @Query(value = "SELECT `id`, `leavetype`, `applydate`, `fromdate`, `status`, `todate`, `reason`, `empid` FROM `leaveapply` WHERE `empid`= :empid",nativeQuery = true)
    List<Leaveapply> SearchStatus(@Param("empid") Integer empid);

}
