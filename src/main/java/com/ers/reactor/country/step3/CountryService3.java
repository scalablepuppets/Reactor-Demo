package com.ers.reactor.country.step3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ers.reactor.wrapper.CountryBlockingCallWrapperService;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class CountryService3 {
	
	@Autowired
	public CountryBlockingCallWrapperService service;
	
	public Mono<String> getCountries(){
		return Mono.from(service.getCountries()).subscribeOn(Schedulers.boundedElastic());
	}
	
	
}
