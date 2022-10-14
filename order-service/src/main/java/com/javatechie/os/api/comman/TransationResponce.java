package com.javatechie.os.api.comman;

import com.javatechie.os.api.entity.Order;

public class TransationResponce {

	private Order order;
	private Double amount;
	private String transactionId;
	private String message;
	
	
	public TransationResponce() {
		
	}
	
	public TransationResponce(Order order, Double amount, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TransationResponce [order=" + order + ", amount=" + amount + ", transactionId=" + transactionId
				+ ", message=" + message + "]";
	}

}
