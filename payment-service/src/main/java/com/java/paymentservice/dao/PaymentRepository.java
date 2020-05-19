package com.java.paymentservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.paymentservice.entity.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Integer>{

	public Payment findByorderid(int orderid);

}
