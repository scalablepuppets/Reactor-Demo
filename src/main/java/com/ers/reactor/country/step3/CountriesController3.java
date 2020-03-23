package com.ers.reactor.country.step3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
public class CountriesController3 {
	
	@Autowired
	public CountryService3 service;
	
	
	@GetMapping("/s3/countries")
	public Mono<String> getCountryNames(){
		return service.getCountries();
	}
	
	@GetMapping("/s3/flux/countries")
	public Flux<String> getCountryNamesFlux(){
		return service.getCountries().subscribeOn(Schedulers.boundedElastic()).repeat(5);
	}
	
	

}
