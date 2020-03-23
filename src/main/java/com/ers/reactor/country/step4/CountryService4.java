package com.ers.reactor.country.step4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ers.reactor.wrapper.CountryBlockingCallWrapperServiceV2;

import reactor.core.publisher.Mono;

@Service
public class CountryService4 {
	
	@Autowired
	public CountryBlockingCallWrapperServiceV2 service;
	
	public Mono<String> getCountries(){
		return Mono.from(service.getCountries());
	}
	
	
}
