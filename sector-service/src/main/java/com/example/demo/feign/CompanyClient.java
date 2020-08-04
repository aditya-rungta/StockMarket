package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CompanyDetailsDto;


@FeignClient(name = "company-service")
public interface CompanyClient {
	
	@RequestMapping(value = "/company/sector/{sectorName}", method = RequestMethod.GET)
	public ResponseEntity<List<CompanyDetailsDto>> getBySector(@PathVariable("sectorName") String sectorName);

}
