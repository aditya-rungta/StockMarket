package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SectorDetails;

@Repository
public interface SectorDetailsRepository extends CrudRepository<SectorDetails,String>{

}
