package com.ers.reactor.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Retrieves a Country names
 */
@Configuration
@ConfigurationProperties
public class CountriesConfigurationProperties {

	/**
	 * A list of greetings in different languages.
	 */
	private List<String> countries;

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
}
