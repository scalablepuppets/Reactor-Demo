package com.ers.reactor.wrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ers.reactor.greeting.legacy.CountryBlockingService;

import reactor.core.publisher.Mono;

@Service
public class CountryBlockingCallWrapperService {
	
	@Autowired
	public CountryBlockingService service;
	
	public Mono<String> getCountries(){
		//return Mono.just(service.getCountries());
		return Mono.fromCallable(service::getCountries);
	}
	
	
}
