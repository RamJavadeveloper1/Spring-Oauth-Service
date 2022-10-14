package com.javatechie.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javatechie.os.api.comman.Payment;
import com.javatechie.os.api.comman.TransationRequest;
import com.javatechie.os.api.comman.TransationResponce;
import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private RestTemplate restTemplate;	
	
	public TransationResponce saveOrder(TransationRequest transationRequest) {
		String responce = "";
		Order  order = transationRequest.getOrder();
		Payment payment = transationRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		Payment paymentresponse =restTemplate.postForObject("http://localhost:9192/payment/doPayment", payment, Payment.class);	 
		responce  = paymentresponse.getPaymentStatus().equals("success")?"payment prossing succesful and order placed": "there is failure in payment api, order added to cart";
		orderRepository.save(order);
		TransationResponce transationResponce = new TransationResponce(order, paymentresponse.getAmount(), paymentresponse.getTransactionId(), responce);
		return transationResponce;
	}
	
	
}
