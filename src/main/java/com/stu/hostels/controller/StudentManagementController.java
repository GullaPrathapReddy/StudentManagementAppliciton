package com.stu.hostels.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stu.hostels.dto.StudentDTO;

import com.stu.hostels.service.StudentManagementService;
import com.stu.hostels.utility.LoggingUtility;

@RestController
@CrossOrigin(origins="http://localhost:4646",allowedHeaders="**")
public class StudentManagementController {

	@Autowired
	StudentManagementService service;
	
	private Logger logger=null;
	public StudentManagementController() {
		logger =LoggingUtility.getLoggerInstance();
	}
	@PostMapping(value="/reg",consumes=MediaType.APPLICATION_JSON)
	public void getPrimaryDetails(@RequestBody StudentDTO dto) {
		String result=null;
		logger.info("Getting Details of User");
		result=service.GetstudentPrimaryDetails(dto);
		
	}
	
	@InitBinder
	public void dataBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
}
