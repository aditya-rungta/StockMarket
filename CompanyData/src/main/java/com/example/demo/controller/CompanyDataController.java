package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.CompanyStockPriceDto;
import com.example.demo.dto.IPODetailsDto;
import com.example.demo.service.CompanyDetailsService;
import com.example.demo.entity.CompanyDetails;


@RestController
@RequestMapping("/company")
public class CompanyDataController {
	
	@Autowired
	CompanyDetailsService companyDetailsService;
	
	@GetMapping("/all")
	public ResponseEntity<List<CompanyDetailsDto>> getAllCompanies() {
		return new ResponseEntity<>(companyDetailsService.getAll(),HttpStatus.OK);
		//return ResponseEntity.status(HttpStatus.OK).body(companyDtlsList);
	}
	
	
	@GetMapping("/price/{companyId}")
	public ResponseEntity<CompanyStockPriceDto> getCompanyStockPrice(@PathVariable("companyId") String companyId,
			@PathVariable("fromPeriod") String fromPeriod,@PathVariable("toPeriod") String toPeriod,@PathVariable("periodicity") String periodicity){
		 return new ResponseEntity<>(companyDetailsService.getCompanyStockPrice(companyId,fromPeriod,toPeriod,periodicity),HttpStatus.OK);
	}
	
	@GetMapping("/details/{name}")
	public ResponseEntity<CompanyDetailsDto> getCompanyDetails(@PathVariable("name") String name){
		 return new ResponseEntity<>(companyDetailsService.getCompanyDetails(name),HttpStatus.OK);
	}
	
	@GetMapping("/matchingCompany/{pattern}")
	public ResponseEntity<List<CompanyDetailsDto>> getMatchingCompanies(@PathVariable("pattern") String pattern){
		 return new ResponseEntity<>(companyDetailsService.getMatchingCompanies(pattern),HttpStatus.OK);
	}
	
	@GetMapping("/companyIPO/{name}")
	public ResponseEntity<IPODetailsDto> getIpoDetails(@PathVariable("name") String name){
		 return new ResponseEntity<>(companyDetailsService.getIpoDetails(name),HttpStatus.OK);
	}
	
	@GetMapping("/sectorList/{name}")
	public ResponseEntity<List<CompanyDetailsDto>> getCompanySector(@PathVariable("name") String name){
		 return new ResponseEntity<>(companyDetailsService.getCompBySector(name),HttpStatus.OK);
	}

}
