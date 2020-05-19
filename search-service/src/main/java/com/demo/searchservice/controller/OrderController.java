package com.demo.searchservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.searchservice.dto.OrderRequest;
import com.demo.searchservice.dto.OrderResponse;
import com.demo.searchservice.entity.Restaurent;
import com.demo.searchservice.entity.RestaurentInfo;
import com.demo.searchservice.repository.RestaurentInfoRepository;
import com.demo.searchservice.repository.OrderRepository;
import com.demo.searchservice.repository.RestaurentRepository;

@RefreshScope
@RestController

public class OrderController {
	
	@Autowired
	private RestaurentInfoRepository repository;
	
	@Autowired
	private OrderRepository orderrepository;
	
	@PostMapping("/placeOrder")
    public RestaurentInfo placeOrder(@RequestBody OrderRequest request){
       return repository.save(request.getRestaurentInfo());
    }
	
	  @GetMapping("/findAllOrders")
	    public List<RestaurentInfo> findAllOrders(){
	        return repository.findAll();
	    }
	  
	  @GetMapping("/getInfo")
	    public List<OrderResponse> getJoinInformation(){
	        return repository.getJoinInformation();
	    }


}
