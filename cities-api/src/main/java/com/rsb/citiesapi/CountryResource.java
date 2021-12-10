package com.rsb.citiesapi;

import com.rsb.citiesapi.countries.Country;
import com.rsb.citiesapi.repository.CountryRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }
}
