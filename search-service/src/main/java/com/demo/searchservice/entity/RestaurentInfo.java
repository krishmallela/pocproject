package com.demo.searchservice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="RESTAURENT_INFORMATION")
public class RestaurentInfo {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String restaurentName;
	
	private String location;
	
	@OneToMany(targetEntity = Order.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ro_fk",referencedColumnName = "id")
    private List<Order> orders;

}
