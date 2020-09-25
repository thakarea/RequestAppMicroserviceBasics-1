package com.bse.RequestSpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bse.RequestSpringBootApp.dto.EmployeeDto;

@Service
public class RequestAppService {

	@Autowired
	private RestTemplate restTemplate;

	public EmployeeDto getDetails(String paygroup) {
		EmployeeDto empDto = null;
		empDto = restTemplate.getForObject("http://localhost:8080/emplDetail/bse?payGroup=" + paygroup, EmployeeDto.class);
		return empDto;
	}

}
