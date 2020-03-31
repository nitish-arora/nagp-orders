package arora.nitish.orders.dto.response;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import arora.nitish.orders.entities.Order;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Order order;
	
	private List<Order> orders;

	public OrderResponse(HttpStatus status) {
		super(status);
	}

	public OrderResponse(HttpStatus status, String message) {
		super(status, message);
	}

	public OrderResponse(HttpStatus status, Order order) {
		super(status);
		this.order = order;
	}
	
	public OrderResponse(HttpStatus status, List<Order> orders) {
		super(status);
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
