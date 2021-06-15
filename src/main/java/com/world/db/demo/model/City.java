package com.world.db.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity()
@Table(name = "city")
public class City {
	@Id
	private int id;
	private String name;
	private String countrycode ;
	private String district;
	private double population;

}
