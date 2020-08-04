package com.example.demo.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice,String>{

//	@Query("select * from StockPrice where TO_DATE(date)>=TO_DATE(:fromPeriod) && TO_DATE(date)>=TO_DATE(:toPeriod)")
//	public StockPrice getPriceByPeriod(@Param("companyId") String companyId,@Param("fromPeriod") String fromPeriod,
//			@Param("toPeriod") String toPeriod,@Param("periodicity") String periodicity);
	
//	@Query("select * from StockPrice")
//	public StockPrice findByDate(@Param("companyId") String companyId,@Param("fromPeriod") String fromPeriod,
//			@Param("toPeriod") String toPeriod,@Param("periodicity") String periodicity);
	public StockPrice findByDate(String fromPeriod);

}
