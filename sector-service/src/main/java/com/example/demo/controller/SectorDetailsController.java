package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.SectorDetailsDto;
import com.example.demo.feign.CompanyClient;
import com.example.demo.service.SectorService;

@RestController
@RequestMapping("/sector")
public class SectorDetailsController {
	
	@Autowired
	SectorService sectorService;
	
	@Autowired
	private CompanyClient companyClient;
	
	@GetMapping("/price/{sectorId}")
	public ResponseEntity<SectorDetailsDto> getCompanyStockPrice(@PathVariable("sectorId") String sectorId,
			@PathVariable("fromPeriod") String fromPeriod,@PathVariable("toPeriod") String toPeriod,@PathVariable("periodicity") String periodicity){
		 return new ResponseEntity<>(sectorService.getSectorDetails(sectorId,fromPeriod,toPeriod,periodicity),HttpStatus.OK);
	}
	
	@GetMapping("/list/{name}")
	public ResponseEntity<List<CompanyDetailsDto>> getSectorList(@PathVariable("name") String name){
		 return companyClient.getBySector(name);
	}
	
}
