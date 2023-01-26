package com.fis.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.app.dto.PaymentDto;
import com.fis.app.entity.Payment;
import com.fis.app.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public List<PaymentDto> getHistory(){
		
		List<PaymentDto> pr = new ArrayList<>();
		
		paymentRepository.findAll().forEach(a->{
			PaymentDto b = new PaymentDto();
			b.setName(a.getName());
			b.setPaymentMethod(a.getPaymentMethod());
			b.setPrice(a.getPrice());
			b.setSku(a.getSku());
			b.setTotalPrice(a.getTotalPrice());
			pr.add(b);
		});
		
		return pr;
		
	}
	
	
	public PaymentDto submitProduct(PaymentDto a) {
		
		Payment b = new Payment();
		b.setName(a.getName());
		b.setPaymentMethod(a.getPaymentMethod());
		b.setPrice(a.getPrice());
		b.setSku(a.getSku());
		b.setTotalPrice(a.getTotalPrice());
		
		paymentRepository.save(b);
		
		return a;
	}
	
}
