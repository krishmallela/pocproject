package com.java.orderservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
