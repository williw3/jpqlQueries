package com.leewatterson.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.leewatterson.countries.models.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
	@Query("SELECT c FROM Country c")
	List<Country> findAllCountries();
	
	@Query("SELECT c.name, l.language, l.percentage FROM Country c JOIN c.languages l WHERE l.language='Slovene' ORDER BY l.percentage DESC")
	List<Object[]> sloveneJoin();
	
	@Query("SELECT c.name, COUNT(city.id) AS cityCount FROM Country c JOIN c.cities city GROUP BY c.name ORDER BY cityCount DESC")
	List<Object[]> citiesJoin();
	
	@Query("SELECT city.name, city.population FROM Country c JOIN c.cities city WHERE c.name = 'Mexico' AND city.population > 500000 ORDER BY city.population DESC")
	List<Object[]> mexicoCities();
	
	@Query("SELECT c.name, l.language, l.percentage FROM Country c JOIN c.languages l WHERE l.percentage > 89 ORDER BY l.percentage DESC")
	List<Object[]> popLanguages();
	
	@Query("SELECT c.name, c.surfaceArea, c.population FROM Country c WHERE c.surfaceArea < 501 AND c.population > 100000")
	List<Object[]> denseCountries();
	
	@Query("SELECT c.name, c.governmentForm, c.surfaceArea, c.lifeExpectancy FROM Country c WHERE c.governmentForm='Constitutional Monarchy' AND c.surfaceArea > 200 AND c.lifeExpectancy > 75")
	List<Object[]> monarchies();
	
	@Query("SELECT c.name, city.name, city.district, city.population FROM Country c JOIN c.cities city WHERE city.district='Buenos Aires' AND city.population > 500000")
	List<Object[]> buenosAiresCities();
	
	@Query("SELECT c.region, COUNT(c.name) AS countryCount FROM Country c GROUP BY c.region ORDER BY countryCount DESC")
	List<Object[]> regionalNumbers();
}











