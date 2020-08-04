package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.CompanyStockPriceDto;
import com.example.demo.dto.IPODetailsDto;
import com.example.demo.entity.CompanyDetails;

public interface CompanyDetailsService {
	
	
	public CompanyDetailsDto getCompanyDetails(String companyName);
	public List<CompanyDetailsDto> getMatchingCompanies(String pattern);
	public CompanyStockPriceDto getCompanyStockPrice(String companyId, String fromPeriod, String toPeriod, String periodicity);
	public IPODetailsDto getIpoDetails(String name);
	public List<CompanyDetailsDto> getCompBySector(String name);
	List<CompanyDetailsDto> getAll();

}
