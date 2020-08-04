package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ipo_details")
public class IPODetails {

	@Id
	@Column(name="companyCode")
	private String companyCode;
	
	@Column(name="companyName")
	private String  companyName;
	
	@Column(name="stockExchange")
	private String  stockExchange;
	
	@Column(name="pricePerShare")
	private String  pricePerShare;
	
	@Column(name="totalNumberOfShares")
	private String  totalNumberOfShares;
	
	@Column(name="openDateTime")
	private String  openDateTime;
	
	@Column(name="remarks")
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
		return "IPODetails [companyCode=" + companyCode + ", companyName=" + companyName + ", stockExchange=" + stockExchange
				+ ", pricePerShare=" + pricePerShare + ", totalNumberOfShares=" + totalNumberOfShares
				+ ", openDateTime=" + openDateTime + ", remarks=" + remarks + "]";
	}
	
	
}
