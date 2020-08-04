package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserDetailsService;
import com.example.demo.dto.UserDetailsDto;


@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	UserDetailsService userDetailsService;
	
	@GetMapping("/login/{userName}/{password}")
	public ResponseEntity<String> userLogin(@PathVariable("userName") String userName,@PathVariable("password") String password){
		 return new ResponseEntity<>(userDetailsService.userLogin(userName,password),HttpStatus.OK);
	}
	
	@PostMapping("/signup")
	public ResponseEntity<String> userSignUp(@RequestBody UserDetailsDto userDetailsDto){
		 return new ResponseEntity<>(userDetailsService.userSignUp(userDetailsDto),HttpStatus.OK);
	}
	
}
