package com.example.demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.ExcelRepository;
import com.example.demo.entity.CompanyDetails;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Service
public class UploadExcelServiceImpl implements UploadExcelService{
	
	@Autowired
	private ExcelRepository excelRepository;

	@Override
	public void save(MultipartFile file) {
		try {
		      List<CompanyDetails> list = excelToTutorials(file.getInputStream(),file.getOriginalFilename());
		      excelRepository.saveAll(list);
		    } catch (IOException e) {
		      throw new RuntimeException("fail to store excel data: " + e.getMessage());
		    }
		
	}

	private List<CompanyDetails> excelToTutorials(InputStream inputStream, String fileName) {
		// TODO Auto-generated method stub
		try {
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheetAt(0);
			List<CompanyDetails> companyDetailsList = new ArrayList<CompanyDetails>();
	        for (int index = 0; index < sheet.getPhysicalNumberOfRows(); index++) {
	            if (index > 0) {
	            	CompanyDetails companyDetails=new CompanyDetails(); 

	                XSSFRow row = (XSSFRow) sheet.getRow(index);
	                Integer id = (int) row.getCell(0).getNumericCellValue();
	                companyDetails.setCompanyId(id.toString());
	                companyDetails.setCompanyName(row.getCell(1).getStringCellValue());
	                Integer turnover = (int) row.getCell(2).getNumericCellValue();
	                companyDetails.setTurnover(turnover.toString());
	                companyDetails.setCeo(row.getCell(3).getStringCellValue());
	                companyDetails.setBoardOfDirectors(row.getCell(4).getStringCellValue());
	                companyDetails.setListedInStockExchanges(row.getCell(5).getStringCellValue());
	                companyDetails.setSector(row.getCell(6).getStringCellValue());
	                companyDetails.setSummary(row.getCell(7).getStringCellValue());
	                companyDetails.setStockCode(row.getCell(8).getStringCellValue());
	                companyDetailsList.add(companyDetails);
	            }
	        }
	        workbook.close();
	        return companyDetailsList;

		}
		catch(IOException e) {
			throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
		}
	}

}
