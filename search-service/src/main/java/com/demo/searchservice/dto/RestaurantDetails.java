package com.demo.searchservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDetails {

	private String id;
	private String restaurentName;
	private String type;
	private double rating;
	private String distance;
}
