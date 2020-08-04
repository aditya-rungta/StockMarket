package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDetailsRepository;
import com.example.demo.dto.UserDetailsDto;
import com.example.demo.entity.UserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserDetailsRepository userDetailsRepository ;

	@Override
	public String userLogin(String userName, String password) {
		UserDetails userDetails=userDetailsRepository.getByUserName(userName);
		if(userDetails.getPassword().equals(password)) {
			return "User Login Successful";
		}
		else {
			return "Username or Password Invalid";
		}
	}

	@Override
	public String userSignUp(UserDetailsDto userDetailsDto) {
		ModelMapper modelMapper = new ModelMapper();
		UserDetails userDetails=modelMapper.map(userDetailsDto, UserDetails.class);
		userDetailsRepository.save(userDetails);
		return "User Account created successfully";
	}

}
