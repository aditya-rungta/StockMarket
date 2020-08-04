package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails,String>{

	UserDetails getByUserName(String userName);

}
