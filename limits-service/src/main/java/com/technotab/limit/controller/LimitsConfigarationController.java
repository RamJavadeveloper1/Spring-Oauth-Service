package com.technotab.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technotab.limit.configuration.LimitConfiguration;

@RestController
public class LimitsConfigarationController {

	@Autowired
	LimitConfiguration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration returnConfigation() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}