package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.example.demo.dao.SectorDetailsRepository;
import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.SectorDetailsDto;
import com.example.demo.entity.SectorDetails;
import com.example.demo.feign.CompanyClient;

@Service
public class SectorServiceImpl implements SectorService{
	
	@Autowired
	private SectorDetailsRepository sectorDetailsRepository;
	
	@Override
	public SectorDetailsDto getSectorDetails(String sectorId, String fromPeriod, String toPeriod, String periodicity) {
		// TODO Auto-generated method stub
		SectorDetails details=sectorDetailsRepository.findById(sectorId).get();
		ModelMapper modelMapper = new ModelMapper();
		SectorDetailsDto sectorDetailsDto=modelMapper.map(details, SectorDetailsDto.class);
		return sectorDetailsDto;
	}

}
