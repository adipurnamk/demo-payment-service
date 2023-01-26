package com.fis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.app.dto.PaymentDto;
import com.fis.app.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/api/payment-list")
	@Transactional
	public List<PaymentDto>  getProduct () throws Exception {
		return paymentService.getHistory();
	}
	
	@PostMapping("/api/order")
	@Transactional
	public PaymentDto order (@RequestBody PaymentDto p) throws Exception {
		return paymentService.submitProduct(p);
	}
	
}
