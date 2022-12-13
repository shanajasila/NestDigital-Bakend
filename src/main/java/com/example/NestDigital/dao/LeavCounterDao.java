package com.example.NestDigital.dao;

import com.example.NestDigital.model.LeavCounter;
import org.springframework.data.repository.CrudRepository;

public interface LeavCounterDao extends CrudRepository<LeavCounter,Integer> {

}
