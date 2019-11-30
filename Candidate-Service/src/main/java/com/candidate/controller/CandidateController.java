package com.candidate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.candidate.entity.Candidate;
import com.candidate.service.CandidateService;

@RestController
public class CandidateController {

	@Autowired
	private CandidateService candidateService;

	@Autowired
	protected RestTemplate restTemplate;

	@RequestMapping(value = "/get/all/candidate", method = RequestMethod.GET)
	public List<Candidate> getAllCandidate() {
		return candidateService.getAllCandidates();
	}

	@RequestMapping(value = "/get/all/employer", method = RequestMethod.GET)
	public List<?> getEmployer() {
		return restTemplate
				.exchange("http://localhost:8085/employer-service/get/all/employer", HttpMethod.GET, null, List.class)
				.getBody();

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
