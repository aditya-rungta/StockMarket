package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CompanyDetails;

@Repository
public interface CompanyDataRepository extends CrudRepository<CompanyDetails,String>{

	public Iterable<CompanyDetails> findByCompanyNameContaining(String pattern);
	
	public CompanyDetails findByCompanyName(String companyName);
	
	public Iterable<CompanyDetails> findAllBySector(String sectorName);

//	@Query("select * from CompanyDetails where companyName like %:pattern% ")
//	public List<String> getMatching(@Param("pattern") String pattern);
//
//	@Query("select * from CompanyDetails")
//	public List<String> getMatching(@Param("pattern") String pattern);
	
}
