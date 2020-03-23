package com.ers.reactor.country.step1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CountriesController1 {
	
	@Autowired
	public CountryService1 service;
	
	
	@GetMapping("/s1/countries")
	public Mono<String> getCountryNames(){
		return service.getCountries();
	}
	
	//try this api - for fun and understanding
	@GetMapping("/s1/loop/countries")
	public Flux<String> getCountryNamesInLoop(){
		return service.getCountries().repeat(10);
	}
}
