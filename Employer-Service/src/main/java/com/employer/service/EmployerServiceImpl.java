package com.employer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer.entity.Employer;
import com.employer.repository.EmployerRepository;

@Service
public class EmployerServiceImpl implements EmployerService{

	@Autowired
	private EmployerRepository employerRepository;

	@Override
	public List<Employer> getAllEmployer() {
		return employerRepository.findAll();
	}
}
