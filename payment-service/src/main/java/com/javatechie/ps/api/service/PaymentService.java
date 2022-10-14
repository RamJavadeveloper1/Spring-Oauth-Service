package com.javatechie.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.repostory.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	
	public Payment doPayment(Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setPaymentStatus(paymentProccessing());
		System.out.println(payment.getPaymentStatus());
		return paymentRepository.save(payment); 
	}
	
	
	public String  paymentProccessing() {
		//3rd party paymentsgatway (paypal, paytm)
		return new Random().nextBoolean()?"success":"false"; 
	}
	
}
