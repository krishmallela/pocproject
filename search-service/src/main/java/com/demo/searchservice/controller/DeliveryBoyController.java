package com.demo.searchservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.searchservice.entity.DeliveryBoy;
import com.demo.searchservice.entity.MenuItem;
import com.demo.searchservice.entity.Restaurent;
import com.demo.searchservice.service.DeliveryBoyService;

@RestController
@RequestMapping("/api")
public class DeliveryBoyController {
	
	@Autowired
	private DeliveryBoyService service;
	
	@PostMapping("/deliveryBoy")
	public DeliveryBoy createDeliveryBoy(@Valid @RequestBody DeliveryBoy deliveryboy) {
		return service.save(deliveryboy);
	}
	
	@GetMapping("/deliveryBoy/{id}")
	public DeliveryBoy getDeliveryBoyDetails(@PathVariable int id) {
        return service.findDeliveryBoyById(id);
    }

}
