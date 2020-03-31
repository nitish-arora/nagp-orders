package arora.nitish.orders.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import arora.nitish.orders.dto.response.OrderResponse;
import arora.nitish.orders.entities.Order;
import arora.nitish.orders.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	List<Order> orders = new ArrayList<>();

	public OrderServiceImpl() {
		this.createOrders();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderResponse getOrderData(String userId) {
		List<Order> orders = Optional
				.ofNullable(this.orders).map(data -> data.stream()
						.filter(order -> order.getUserId().equalsIgnoreCase(userId)).collect(Collectors.toList()))
				.orElseGet(ArrayList::new);
		return new OrderResponse(HttpStatus.OK, orders);

	}

	/**
	 * function to create list of orders
	 */
	private void createOrders() {
		this.orders.add(new Order(500.00, new Date(), "USER_2"));
		this.orders.add(new Order(1000.00, new Date(), "USER_1"));
		this.orders.add(new Order(500.00, new Date(), "USER_2"));
		this.orders.add(new Order(520.20, new Date(), "USER_2"));
		this.orders.add(new Order(1500.00, new Date(), "USER_3"));
		this.orders.add(new Order(550.10, new Date(), "USER_10"));
		this.orders.add(new Order(500.00, new Date(), "USER_2"));
		this.orders.add(new Order(500.00, new Date(), "USER_5"));
		this.orders.add(new Order(550.00, new Date(), "USER_3"));
		this.orders.add(new Order(2500.00, new Date(), "USER_5"));
		this.orders.add(new Order(6500.00, new Date(), "USER_8"));
		this.orders.add(new Order(5100.00, new Date(), "USER_7"));
		this.orders.add(new Order(555.50, new Date(), "USER_7"));
	}
}
