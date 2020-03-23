package com.ers.reactor.country.step4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
public class CountriesController4 {
	
	@Autowired
	public CountryService4 service;
	
	
	@GetMapping("/s4/countries")
	public Mono<String> getCountryNames(){
		return service.getCountries();
	}
	
	@GetMapping("/s4/flux/countries")
	public Flux<String> getCountryNamesFlux(){
		return service.getCountries().subscribeOn(Schedulers.boundedElastic()).repeat(5);
	}
	
	//try this api now after you have tried in Step1
	@GetMapping("/s4/loop/countries")
	public Flux<String> getCountryNamesInLoop(){
		return service.getCountries().repeat(10);
	}
		

}
