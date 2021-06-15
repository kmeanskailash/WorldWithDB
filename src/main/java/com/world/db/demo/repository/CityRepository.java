package com.world.db.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.db.demo.model.City;
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
