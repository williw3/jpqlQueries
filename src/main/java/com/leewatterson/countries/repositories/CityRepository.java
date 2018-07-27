package com.leewatterson.countries.repositories;

import org.springframework.data.repository.CrudRepository;

import com.leewatterson.countries.models.City;

public interface CityRepository extends CrudRepository<City, Long> {

}
