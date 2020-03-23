package com.ers.reactor.country.step2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ers.reactor.greeting.legacy.CountryBlockingService;

import reactor.core.publisher.Mono;

@Service
public class CountryService2 {
	
	@Autowired
	public CountryBlockingService service;
	
	public Mono<String> getCountries(){
		//Static Factory for Creating Mono's
		return Mono.fromCallable(service::getCountries);
	}
	
	
}
