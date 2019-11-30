package com.employer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employer.entity.Employer;
import com.employer.service.EmployerService;

@RestController
public class EmployerController {

	@Autowired
	private EmployerService employerService;
	
	@RequestMapping(value = "/get/all/employer" , method = RequestMethod.GET)
	public List<Employer> getAllEmployer(){
		return employerService.getAllEmployer();
	}
}
