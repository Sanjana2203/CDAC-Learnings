package com.app.core;

public class Order {
//orderId, petId, quantity, status
	private int orderId;
	private int petId;
	private int quantity;
	Status status;
	private static int idGenerator=1;
	

	public Order( int petId, int quantity, Status status) {
		super();
		this.orderId = idGenerator;
		this.petId = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
		++idGenerator;
	}

	public int getOrderId() {
		return orderId;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getPetId() {
		return petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}

}
