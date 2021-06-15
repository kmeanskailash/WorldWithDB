package com.world.db.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.db.demo.model.City;
import com.world.db.demo.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	CityRepository cityRepo;
	public List<City> findAllCity() {
		
		return cityRepo.findAll();
	}
	public Optional<City> findCityById(int id) {
		
		return cityRepo.findById(id);
	}

}
