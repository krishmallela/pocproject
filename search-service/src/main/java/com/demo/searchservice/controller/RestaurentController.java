package com.demo.searchservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.searchservice.dto.RestaurantDetails;
import com.demo.searchservice.entity.MenuItem;
import com.demo.searchservice.entity.Restaurent;
import com.demo.searchservice.service.MenuItemService;
import com.demo.searchservice.service.RestaurentService;

@RefreshScope
@RestController
@RequestMapping("/api")
public class RestaurentController {
	
	@Autowired
	private RestaurentService resservice;
	
	@Autowired
	private MenuItemService menuItemservice;
	
	
	
// create restaurents
	
	@PostMapping("/restaurents")
	public Restaurent createRestaurent(@Valid @RequestBody Restaurent restaurent) {
		return resservice.save(restaurent);
	}
	
	//get restaurents by name
	
	@GetMapping("/restaurants/{name}")
	public Restaurent findRestaurant(@RequestParam(value = "name") String name) {
        return resservice.getRestaurantByName(name);
    }
	
	// get restaurents by distance
	
	@GetMapping("/restaurents/byDistance/{byDistance}")
	public List<RestaurantDetails> getRestaurentsByDistance (@PathVariable String byDistance,@RequestParam String lattitude,@RequestParam String longitude){
		return resservice.getRestaurantByDistance(Double.parseDouble(byDistance),Double.parseDouble(lattitude),Double.parseDouble(longitude));
	}
	
	//get restaurents by rating
	
	@GetMapping("/restaurents/rating/{rating}")
	public List<Restaurent> getRestaurentsByRating (@PathVariable double rating){
		return resservice.getRestaurentsByRating(rating);
	}
	
	// get restaurents by type
	
	@GetMapping("/restaurents/type/{type}")
	public List<Restaurent> getRestaurentsByType (@PathVariable String type){
		return resservice.getRestaurentsByType(type);
	}
	
	@PostMapping("/restaurants/menuItems")
	public MenuItem createMenuItem( @Valid @RequestBody MenuItem menuitems) {
		return menuItemservice.createMenuItem(menuitems);
    }
	
	@GetMapping("/restaurants/{rid}/menuItems")
	public List<MenuItem> getMenuItems(@PathVariable String rid) {
        return menuItemservice.findAllByRestaurantId(rid);
    }

	
	
	
	

}
