package com.demo.searchservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.searchservice.entity.DeliveryBoy;

public interface DeliveryBoyRepository extends JpaRepository<DeliveryBoy, Integer> {

	DeliveryBoy findDeliveryBoyById(int id);

}
