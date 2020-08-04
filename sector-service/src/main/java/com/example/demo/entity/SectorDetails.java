package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sector_details")
public class SectorDetails {
	
	@Id
	@Column(name="sectorId")
	private String sectorId;
	
	@Column(name="fromPeriod")
	private String fromPeriod;
	
	@Column(name="toPeriod")
	private String toPeriod;

}
