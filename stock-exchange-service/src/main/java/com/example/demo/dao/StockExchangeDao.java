package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.StockExchange;

public interface StockExchangeDao extends CrudRepository<StockExchange,String>{
	

}
