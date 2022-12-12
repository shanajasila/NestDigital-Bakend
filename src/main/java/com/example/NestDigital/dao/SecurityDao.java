package com.example.NestDigital.dao;

import com.example.NestDigital.model.Employee;
import com.example.NestDigital.model.Security;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecurityDao extends CrudRepository<Security,Integer> {

    @Query(value = "SELECT `id`, `code`, `contactno`, `password`, `securityname`, `username` FROM `security` WHERE `username`= :username AND `password`= :password",nativeQuery = true)
    List<Security>securitylogin(@Param("username")String username,@Param("password") String password);

    @Query(value = "SELECT `id`, `code`, `contactno`, `password`, `securityname`, `username` FROM `security` WHERE `id`= :id",nativeQuery = true)
    List<Security>viewprofilesec(@Param("id")Integer id );
}
