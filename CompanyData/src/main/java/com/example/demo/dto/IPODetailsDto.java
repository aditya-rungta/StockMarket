package com.example.demo.dto;

import org.springframework.data.annotation.Id;

public class IPODetailsDto {

	@Id
	private String companyCode;
	private String  companyName;
	private String  stockExchange;
	private String  pricePerShare;
	private String  totalNumberOfShares;
	private String  openDateTime;
	private String  remarks;
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(String pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public String getTotalNumberOfShares() {
		return totalNumberOfShares;
	}
	public void setTotalNumberOfShares(String totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPODetailsDto [companyCode=" + companyCode + ", companyName=" + companyName + ", stockExchange="
				+ stockExchange + ", pricePerShare=" + pricePerShare + ", totalNumberOfShares=" + totalNumberOfShares
				+ ", openDateTime=" + openDateTime + ", remarks=" + remarks + "]";
	}
	
}
