package com.ers.reactor.country.step2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
public class CountriesController2 {
	
	@Autowired
	public CountryService2 service;
	
	
	@GetMapping("/s2/countries")
	public Mono<String> getCountryNames(){
		return service.getCountries();
	}
	
	@GetMapping("/s2/flux/countries")
	public Flux<String> getCountryNamesFlux(){
		return service.getCountries().subscribeOn(Schedulers.boundedElastic()).repeat(5);
	}
	
	

}
