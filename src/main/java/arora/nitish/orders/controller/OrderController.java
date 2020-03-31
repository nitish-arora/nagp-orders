package arora.nitish.orders.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arora.nitish.orders.dto.response.OrderResponse;
import arora.nitish.orders.services.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	
	@Resource
	OrderService orderService;
	
	@GetMapping(value="/user/{userId}")
	public OrderResponse getOrderData(@PathVariable("userId") String userId) {
		return orderService.getOrderData(userId);
	}
	
}
