package arora.nitish.orders.entities;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String ORDER_ID_PREFIX = "ORDER_";

	private static Integer id = 1;

	private String orderId;

	private Double orderAmount;

	private Date orderDate;

	private String userId;

	public Order(Double orderAmount, Date orderDate, String userId) {
		this.orderId = ORDER_ID_PREFIX + id;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.userId = userId;
		id++;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
