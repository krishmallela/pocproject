package com.java.paymentservice.service;

import java.util.UUID;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.paymentservice.dao.PaymentRepository;
import com.java.paymentservice.entity.Payment;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repository;

	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	public String paymentProcessing() {
		// api call should be third party gateway (paypal,paytm)
		return new Random().nextBoolean()?"sucess":"false";
	}
	public Payment findPaymentHistoryByOrderId(int orderid) {
		// TODO Auto-generated method stub
		return repository.findByorderid(orderid);
	}
} 
