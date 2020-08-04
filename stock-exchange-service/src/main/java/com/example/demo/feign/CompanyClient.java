package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CompanyDetailsDto;

@FeignClient(name="company-service")
public interface CompanyClient {

	@RequestMapping(value="/company/exchange/{stockExchange}", method=RequestMethod.GET)
	List<CompanyDetailsDto> getByStockExchange(@PathVariable("stockExchange") String stockExchange);
	
}
