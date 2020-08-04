package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.UploadExcelService;

@RestController
@RequestMapping("/uploadExcel")
public class ExcelUploadController {
	
	@Autowired
	private UploadExcelService uploadExcelService;
	
	@PostMapping("/upload")
	  public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";
	      try {
	    	  uploadExcelService.save(file);
	    	  message = "Uploaded the file successfully: " + file.getOriginalFilename();
	    	  return new ResponseEntity<>(message,HttpStatus.OK);
	      } catch (Exception e) {
	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	        return new ResponseEntity<>(message,HttpStatus.OK);	     
	        }
	      
	  }

}
