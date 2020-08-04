package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.StockExchangeDao;
import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.StockExchangeDto;
import com.example.demo.entity.StockExchange;
import com.example.demo.feign.CompanyClient;

public class StockExchangeServiceImpl implements StockExchangeService{
	
	@Autowired
	StockExchangeDao stockExchangeDao;
	
	@Autowired
	CompanyClient companyClient;
	
	@Override
	public List<StockExchangeDto> getStockExchangeList() {
		Iterable<StockExchange> stockExchange=stockExchangeDao.findAll();
		return convertToDtoList(stockExchange);
	}

	@Override
	public String addStockExchange(StockExchangeDto stockExchangeDto) {
		ModelMapper modelMapper = new ModelMapper();
		StockExchange stockExchange=modelMapper.map(stockExchangeDto, StockExchange.class);
		stockExchangeDao.save(stockExchange);
		return "New Stock Exchange addded successfully!!";
	}

	@Override
	public List<CompanyDetailsDto> getCompaniesList(String stockExchangeName) {
		return companyClient.getByStockExchange(stockExchangeName);
	}
	
	private List<StockExchangeDto> convertToDtoList(Iterable<StockExchange> stockExchangeList) {
		List<StockExchangeDto> stockExchangeDetailsList = new ArrayList<StockExchangeDto>();
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for (StockExchange s : stockExchangeList) {
			stockExchangeDetailsList.add(modelMapper.map(s, StockExchangeDto.class));
		}
		return stockExchangeDetailsList;
	}

}
