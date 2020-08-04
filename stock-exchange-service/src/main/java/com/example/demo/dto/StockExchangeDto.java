package com.example.demo.dto;

public class StockExchangeDto {
	
	private String id;
	private String exchangeName;
	private String brief;
	private String contactddress;
	private String remarks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getExchangeName() {
		return exchangeName;
	}
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactddress() {
		return contactddress;
	}
	public void setContactddress(String contactddress) {
		this.contactddress = contactddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchangeDto [id=" + id + ", exchangeName=" + exchangeName + ", brief=" + brief + ", contactddress="
				+ contactddress + ", remarks=" + remarks + "]";
	}
	

}
