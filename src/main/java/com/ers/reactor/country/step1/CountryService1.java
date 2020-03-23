package com.ers.reactor.country.step1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ers.reactor.greeting.legacy.CountryBlockingService;

import reactor.core.publisher.Mono;

@Service
public class CountryService1 {
	
	@Autowired
	public CountryBlockingService service;
	
	public Mono<String> getCountries(){
		// Work is done upfront, Mono's would return the precomputed value
		return Mono.just(service.getCountries());
	}
	
	
}
