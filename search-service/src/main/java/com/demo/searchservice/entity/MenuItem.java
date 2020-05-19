package com.demo.searchservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FOOD_MENU")
public class MenuItem {

	@Id
	@GeneratedValue
	private int id;

	private String restaurantId;
	private String name;
	private String description;
	private int price;

}
