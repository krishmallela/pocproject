package com.demo.searchservice.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="DELIVERY_BOY")
public class DeliveryBoy {
	
	@Id
	
	private int id;
	private String deliveryBoyName;
	private long phoneNumber;

}
