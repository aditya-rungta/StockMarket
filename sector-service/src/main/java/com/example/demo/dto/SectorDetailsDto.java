package com.example.demo.dto;


public class SectorDetailsDto {
	
	private String sectorId;
	private String fromPeriod;
	private String toPeriod;
	
	public String getSectorId() {
		return sectorId;
	}
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
	public String getFromPeriod() {
		return fromPeriod;
	}
	public void setFromPeriod(String fromPeriod) {
		this.fromPeriod = fromPeriod;
	}
	public String getToPeriod() {
		return toPeriod;
	}
	public void setToPeriod(String toPeriod) {
		this.toPeriod = toPeriod;
	}
	@Override
	public String toString() {
		return "SectorDetailsDto [sectorId=" + sectorId + ", fromPeriod=" + fromPeriod + ", toPeriod=" + toPeriod + "]";
	}
	

}
