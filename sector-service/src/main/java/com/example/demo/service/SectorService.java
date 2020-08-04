package com.example.demo.service;

import com.example.demo.dto.CompanyDetailsDto;
import com.example.demo.dto.SectorDetailsDto;

public interface SectorService {
	
	public SectorDetailsDto getSectorDetails(String sectorId,String fromPeriod,String toPeriod,String periodicity);

	//public CompanyDetailsDto getSectorList(String name);

}
