package com.example.demo.service;

import com.example.demo.dto.UserDetailsDto;

public interface UserDetailsService {

	public String userLogin(String userName, String password);
	public String userSignUp(UserDetailsDto userDetailsDto);
	
}
