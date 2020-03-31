package arora.nitish.orders.services;

import arora.nitish.orders.dto.response.OrderResponse;

public interface OrderService {

	/**
	 * function to get details of all order with specific user id
	 * 
	 * @param userId - user id mapped to order
	 */
	public OrderResponse getOrderData(String userId);
}
