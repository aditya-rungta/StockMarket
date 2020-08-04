package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.StockExchangeDto;

public interface StockExchangeService {

	public List<StockExchangeDto> getStockExchangeList();
	public String addStockExchange(StockExchangeDto stockExchangeDto);
	public List<CompanyDetailsDto> getCompaniesList(String stockExchangeName);
	
}
