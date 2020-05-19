package com.demo.searchservice.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="RESTAURENT_TABLE")
public class Restaurent implements Serializable{
	
	@Id
	private String id;
	
	private String restaurentName;
	private double lattitude;
	private double longitude;

	private String type;
	private double rating;
	


}
