package com.example.demo.dto;

public class CompanyDetailsDto {
	
	private String companyId;
	private String companyName;
	private String turnover;
	private String ceo;
	private String boardOfDirectors;
	private String listedInStockExchanges;
	private String sector;
	private String summary;
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
		return "CompanyDetailsDto [companyId=" + companyId + ", companyName=" + companyName + ", turnover=" + turnover
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", listedInStockExchanges="
				+ listedInStockExchanges + ", sector=" + sector + ", summary=" + summary + ", stockCode=" + stockCode
				+ "]";
	}
	

}
