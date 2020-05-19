package com.demo.searchservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.searchservice.dto.OrderResponse;
import com.demo.searchservice.entity.Restaurent;
@Repository
public interface RestaurentRepository extends JpaRepository<Restaurent, String> {
	


	Restaurent findByRestaurentName(String name);

	List<Restaurent> findByRating(double rating);

	List<Restaurent> findByType(String type);

}
