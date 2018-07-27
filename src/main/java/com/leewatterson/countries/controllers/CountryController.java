package com.leewatterson.countries.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leewatterson.countries.services.ApiService;

@RestController
public class CountryController {
	private final ApiService apiService;
	public CountryController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@RequestMapping("/")
	public List<Object[]> index(){
		return apiService.countriesByRegion();
	}
}
