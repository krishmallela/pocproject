package com.demo.searchservice.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.searchservice.dto.RestaurantDetails;
import com.demo.searchservice.entity.Restaurent;
import com.demo.searchservice.repository.RestaurentRepository;

@Service
public class RestaurentService {

	@Autowired
	private RestaurentRepository repository;

	public Restaurent save(@Valid Restaurent restaurent) {
		// TODO Auto-generated method stub
		return repository.save(restaurent);
	}

	public Restaurent getRestaurantByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByRestaurentName(name);
	}

	public List<RestaurantDetails> getRestaurantByDistance(double dist, double lattitude, double longitude) {
		List<Restaurent> restaurants = repository.findAll();
		List<RestaurantDetails> newRestaurants = new ArrayList<>();
		for(Restaurent r:restaurants) {
			double d=distance(lattitude,r.getLattitude(),longitude,r.getLongitude());
			if(d<dist) {
				newRestaurants.add(new RestaurantDetails(r.getId(), r.getRestaurentName(), r.getType(), r.getRating(), d+" km"));
			}
		}

		return newRestaurants;
	}

	public List<Restaurent> getRestaurentsByRating(double rating) {
		// TODO Auto-generated method stub
		return repository.findByRating(rating);
	}

	public List<Restaurent> getRestaurentsByType(String type) {
		// TODO Auto-generated method stub
		return repository.findByType(type);
	}

	public double distance(double lat1, double lat2, double lon1, double lon2) {

// The math module contains a function 
// named toRadians which converts from 
// degrees to radians. 
		lon1 = Math.toRadians(lon1);
		lon2 = Math.toRadians(lon2);
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);

// Haversine formula  
		double dlon = lon2 - lon1;
		double dlat = lat2 - lat1;
		double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);

		double c = 2 * Math.asin(Math.sqrt(a));

// Radius of earth in kilometers. Use 3956  
// for miles 
		double r = 6371;

// calculate the result 
		return (c * r);
	}

}
