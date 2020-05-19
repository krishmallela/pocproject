package com.demo.searchservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.searchservice.entity.MenuItem;

@Repository
public interface MenuItemsRepository extends JpaRepository<MenuItem, String> {

	List<MenuItem> findAllByRestaurantId(String rid);

	

	

	

	
}
