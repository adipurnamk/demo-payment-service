package com.fis.app.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentDto {

	private String sku;
	private String price;
	private String name;
	private String paymentMethod;
	private String totalPrice;
	
}
