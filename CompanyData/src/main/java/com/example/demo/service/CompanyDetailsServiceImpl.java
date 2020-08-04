package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CompanyDataRepository;
import com.example.demo.dao.IpoDetailsRepository;
import com.example.demo.dao.StockPriceRepository;
import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.CompanyStockPriceDto;
import com.example.demo.dto.IPODetailsDto;
import com.example.demo.entity.CompanyDetails;
import com.example.demo.entity.IPODetails;
import com.example.demo.entity.StockPrice;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService{
	
	@Autowired
	private CompanyDataRepository companyDataRepository;
	
	@Autowired
	private IpoDetailsRepository ipoDetailsRepository;
	
	@Autowired
	private StockPriceRepository stockPriceRepository;

	@Override
	public CompanyDetailsDto getCompanyDetails(String companyName) {
		
		CompanyDetails details=companyDataRepository.findByCompanyName(companyName);
		ModelMapper modelMapper = new ModelMapper();
		CompanyDetailsDto companyDetailsDto=modelMapper.map(details, CompanyDetailsDto.class);
		System.out.println(companyDetailsDto);
		return companyDetailsDto;
		
	}

	@Override
	public List<CompanyDetailsDto> getMatchingCompanies(String pattern) {
		Iterable<CompanyDetails> matchingCompany=companyDataRepository.findByCompanyNameContaining(pattern);
		List<CompanyDetailsDto> companyDetailsList = new ArrayList<CompanyDetailsDto>();
		for (CompanyDetails c : matchingCompany) {
			companyDetailsList.add(convertToDto(c));
		}
		return companyDetailsList;
	}

	@Override
	public CompanyStockPriceDto getCompanyStockPrice(String companyId, String fromPeriod, String toPeriod,
			String periodicity) {
		//StockPrice stockPrice=stockPriceRepository.findByDate(companyId,fromPeriod,toPeriod,periodicity);
		StockPrice stockPrice=stockPriceRepository.findByDate(fromPeriod);
		ModelMapper modelMapper = new ModelMapper();
		CompanyStockPriceDto companyStockPriceDto=modelMapper.map(stockPrice, CompanyStockPriceDto.class);
		return companyStockPriceDto;
	}

	@Override
	public IPODetailsDto getIpoDetails(String name) {
		IPODetails ipoDetails = ipoDetailsRepository.findById(name).get();
		ModelMapper modelMapper = new ModelMapper();
		IPODetailsDto ipoDetailsDto=modelMapper.map(ipoDetails, IPODetailsDto.class);
		return ipoDetailsDto;
	}

	@Override
	public List<CompanyDetailsDto> getCompBySector(String name) {
		// TODO Auto-generated method stub
		Iterable<CompanyDetails> list=companyDataRepository.findAllBySector(name);
		List<CompanyDetailsDto> companyDetailsList = new ArrayList<CompanyDetailsDto>();
		for (CompanyDetails c : list) {
			companyDetailsList.add(convertToDto(c));
		}
		return companyDetailsList;
	}

	@Override
	public List<CompanyDetailsDto> getAll() {
		Iterable<CompanyDetails> companyList = companyDataRepository.findAll();
		List<CompanyDetailsDto> companyDetailsList = new ArrayList<CompanyDetailsDto>();
		for (CompanyDetails c : companyList) {
			companyDetailsList.add(convertToDto(c));
		}
		return companyDetailsList;
	}
	
	private CompanyDetailsDto convertToDto(CompanyDetails company) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CompanyDetailsDto companyDetailsDto = modelMapper.map(company, CompanyDetailsDto.class);
		return companyDetailsDto;
	}

	

}
