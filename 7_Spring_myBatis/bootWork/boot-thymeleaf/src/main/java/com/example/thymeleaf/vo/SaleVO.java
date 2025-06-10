package com.example.thymeleaf.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleVO {
	
	private int id;
	private String item;
	private int quantity;
	private float amount;
}
