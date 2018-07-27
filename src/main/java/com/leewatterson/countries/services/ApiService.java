package com.leewatterson.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leewatterson.countries.models.Country;
import com.leewatterson.countries.repositories.CountryRepository;

@Service
public class ApiService {
	private final CountryRepository countryRepository;
//	private final CityRepository cityRepository;
//	private final LanguageRepository languageRepository;
	public ApiService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
//		this.cityRepository = cityRepository;
//		this.languageRepository = languageRepository;
	}
	
	public List<Country> allCountries(){
		return countryRepository.findAllCountries();
	}
	
	public List<Object[]> allSloves(){
		return countryRepository.sloveneJoin();
	}
	
	public List<Object[]> cityCount(){
		return countryRepository.citiesJoin();
	}
	
	public List<Object[]> mexicoCitiesCount(){
		return countryRepository.mexicoCities();
	}
	
	public List<Object[]> mostCommonLanguages(){
		return countryRepository.popLanguages();
	}
	
	public List<Object[]> mostDenseCountries(){
		return countryRepository.denseCountries();
	}
	
	public List<Object[]> constMonarchy(){
		return countryRepository.monarchies();
	}
	
	public List<Object[]> buenosAiresBigCities(){
		return countryRepository.buenosAiresCities();
	}
	
	public List<Object[]> countriesByRegion(){
		return countryRepository.regionalNumbers();
	}
}







