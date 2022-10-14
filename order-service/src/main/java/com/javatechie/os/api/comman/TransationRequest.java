package com.javatechie.os.api.comman;

import com.javatechie.os.api.entity.Order;

public class TransationRequest {
	
	private Order order;
	private Payment payment;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	@Override
	public String toString() {
		return "TransationRequest [order=" + order + ", payment=" + payment + "]";
	}

	

}
