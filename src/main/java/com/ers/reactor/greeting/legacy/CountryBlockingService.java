package com.ers.reactor.greeting.legacy;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ers.reactor.config.CountriesConfigurationProperties;

@Service
public class CountryBlockingService {
	
	@Autowired
	private CountriesConfigurationProperties config;
	
	public String getCountries() {
		try {
			// Simulate blocking I/O call with a blocking sleep call
			Thread.sleep(50);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException(e);
		}
		int index = ThreadLocalRandom.current()
				.nextInt(0, config.getCountries().size());
		
		return config.getCountries().get(index) + "\n";
	}


}
