package com.java.orderservice.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.orderservice.controller.common.Payment;
import com.java.orderservice.controller.common.TransactionRequest;
import com.java.orderservice.controller.common.TransactionResponse;
import com.java.orderservice.dao.OrderRepository;
import com.java.orderservice.entity.Order;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private RestTemplate template;

	public TransactionResponse saveorder(TransactionRequest request) {
		String response="";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderid(order.getId());
		payment.setAmount(order.getPrice());
		
		

		// rest call
	Payment paymentRespose=	template.postForObject("http://PAYMENT-SERVICE/payment/doPayment ", payment, Payment.class);
		
		 
		 response=paymentRespose.getPaymentStatus().equals("sucess")?"payment Sucessful by COD":"payment sucessful by Online,";
		 repository.save(order);
		 return new TransactionResponse(order, paymentRespose.getAmount(),paymentRespose.getTransactionId(),response);
	}

}
