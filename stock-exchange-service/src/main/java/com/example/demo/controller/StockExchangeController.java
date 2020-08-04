package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.StockExchangeDto;
import com.example.demo.service.StockExchangeService;

@RestController
@RequestMapping("/stockExchange")
public class StockExchangeController {
	
	@Autowired
	StockExchangeService stockExchangeService;
	
	@GetMapping("/list")
	public ResponseEntity<List<StockExchangeDto>> stockExchangeList(){
		 return new ResponseEntity<>(stockExchangeService.getStockExchangeList(),HttpStatus.OK);
	}
	
	@PostMapping("/addExchange")
	public ResponseEntity<String> addStockExchange(@RequestBody StockExchangeDto stockExchangeDto){
		 return new ResponseEntity<>(stockExchangeService.addStockExchange(stockExchangeDto),HttpStatus.OK);
	}
	
	@GetMapping("/companyInExchange/{stockExchangeName}")
	public ResponseEntity<List<CompanyDetailsDto>> getCompaniesList(@PathVariable("stockExchangeName") String stockExchangeName){
		 return new ResponseEntity<>(stockExchangeService.getCompaniesList(stockExchangeName),HttpStatus.OK);
	}
	

}
