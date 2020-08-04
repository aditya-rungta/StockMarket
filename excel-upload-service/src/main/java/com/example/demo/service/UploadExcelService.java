package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadExcelService {

	public void save(MultipartFile file);
	
}
