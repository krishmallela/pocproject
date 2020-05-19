package com.demo.searchservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.searchservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
