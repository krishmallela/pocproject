package com.demo.searchservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.searchservice.entity.MenuItem;
import com.demo.searchservice.repository.MenuItemsRepository;

@Service
public class MenuItemService {

	@Autowired
	private MenuItemsRepository repository;

	public MenuItem createMenuItem(MenuItem menuitems) {
		// TODO Auto-generated method stub
		return repository.save(menuitems);
	}

	public List<MenuItem> findAllByRestaurantId(String rid) {
		// TODO Auto-generated method stub
		return repository.findAllByRestaurantId(rid);
	}

	

	

}
