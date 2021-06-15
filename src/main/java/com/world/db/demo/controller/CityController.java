package com.world.db.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.world.db.demo.model.City;
import com.world.db.demo.repository.CityRepository;
import com.world.db.demo.service.CityService;

@RestController
public class CityController {
	@Autowired
	CityService cityService;

	@GetMapping("/allcity")
	public List<City> findAllCity() {
		return cityService.findAllCity();
	}
	@GetMapping("/city/{id}")
	public Optional<City> findCityById(@PathVariable("id")int id) {
		return cityService.findCityById(id);
	}
	
}
