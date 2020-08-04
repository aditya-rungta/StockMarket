package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_details")
public class CompanyDetails {

	@Id
	@Column(name="companyId")
	private String companyId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="turnover")
	private String turnover;
	
	@Column(name="ceo")
	private String ceo;
	
	@Column(name="boardOfDirectors")
	private String boardOfDirectors;
	
	@Column(name="listedInStockExchanges")
	private String listedInStockExchanges;
	
	@Column(name="sector")
	private String sector;
	
	@Column(name="summary")
	private String summary;
	
	@Column(name="stockCode")
	private String stockCode;
		
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public String getListedInStockExchanges() {
		return listedInStockExchanges;
	}
	public void setListedInStockExchanges(String listedInStockExchanges) {
		this.listedInStockExchanges = listedInStockExchanges;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	@Override
	public String toString() {
		return "CompanyDetails [companyId=" + companyId + ", companyName=" + companyName + ", turnover=" + turnover
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", listedInStockExchanges="
				+ listedInStockExchanges + ", sector=" + sector + ", summary=" + summary + ", stockCode=" + stockCode
				+ "]";
	}

	
}
