package com.demo.searchservice.dto;

import com.demo.searchservice.entity.RestaurentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private RestaurentInfo restaurentInfo;
}