package com.javatechie.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.os.api.comman.Payment;
import com.javatechie.os.api.comman.TransationRequest;
import com.javatechie.os.api.comman.TransationResponce;
import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/bookOrders")
	public TransationResponce bookOrder(@RequestBody TransationRequest transationRequest) {
		return orderService.saveOrder(transationRequest);
	}
}
