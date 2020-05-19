package com.java.orderservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.orderservice.entity.UserKafkaConsumer;

//@RestController
//public class KafkaConsController {
//	List<String> messages = new ArrayList<>();
//
//	UserKafkaConsumer userFromTopic = null;
//
//	
//
//	@GetMapping("/consumeJsonMessage")
//	public UserKafkaConsumer consumeJsonMessage() {
//		return userFromTopic;
//	}
//
//	
//	@KafkaListener(groupId = "orderservice", topics = "order", containerFactory = "userKafkaListenerContainerFactory")
//	public UserKafkaConsumer getJsonMsgFromTopic(UserKafkaConsumer user) {
//		userFromTopic = user;
//		return userFromTopic;
//	}

	
//}
