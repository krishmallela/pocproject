package com.java.orderservice.feignproxy;
import javax.validation.Valid;

//
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.orderservice.dto.DeliveryBoy;

@FeignClient(name = "SEARCH-SERVICE")
public interface SearchServiceProxy {
	
	@GetMapping("/api/deliveryBoy/{id}")
	public DeliveryBoy getDeliveryBoyDetails(@PathVariable int id)  ;
	
	
	 
	    
}
