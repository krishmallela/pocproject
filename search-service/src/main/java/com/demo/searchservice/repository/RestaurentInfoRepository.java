package com.demo.searchservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.searchservice.entity.RestaurentInfo;
import com.demo.searchservice.dto.OrderResponse;
import com.demo.searchservice.entity.Restaurent;

public interface RestaurentInfoRepository extends JpaRepository<RestaurentInfo, String> {

	@Query("SELECT new com.demo.searchservice.dto.OrderResponse(r.restaurentName , o.orderName) FROM RestaurentInfo r JOIN r.orders o")
	
	public List<OrderResponse> getJoinInformation();

}
