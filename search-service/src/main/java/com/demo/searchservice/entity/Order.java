package com.demo.searchservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="ORDER_INFORMATION")
public class Order {
    @Id
    private int oid;
    private String orderName;
    private int qty;
    private int price;
}
