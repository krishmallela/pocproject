package com.demo.searchservice.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.demo.searchservice.entity.DeliveryBoy;
import com.demo.searchservice.repository.DeliveryBoyRepository;

@Service
public class DeliveryBoyService {

	private DeliveryBoyRepository repo;

	public DeliveryBoy save( DeliveryBoy deliveryboy) {
		// TODO Auto-generated method stub
		return repo.save(deliveryboy);
	}

	public DeliveryBoy findDeliveryBoyById(int id) {
		// TODO Auto-generated method stub
		return repo.findDeliveryBoyById(id);
	}
}
