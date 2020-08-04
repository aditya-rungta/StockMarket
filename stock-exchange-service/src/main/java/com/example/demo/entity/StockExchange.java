package com.example.demo.entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="stock_exchange_details")
public class StockExchange {

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="exchangeName")
	private String exchangeName;
	
	@Column(name="brief")
	private String brief;
	
	@Column(name="contactddress")
	private String contactddress;
	
	@Column(name="remarks")
	private String remarks;
}
