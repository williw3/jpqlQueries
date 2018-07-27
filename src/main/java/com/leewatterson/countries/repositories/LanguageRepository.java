package com.leewatterson.countries.repositories;

import org.springframework.data.repository.CrudRepository;

import com.leewatterson.countries.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

}
