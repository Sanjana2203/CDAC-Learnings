package com.app.core;

public class Pet {
//Pet ( petId, name, category, unitPrice, stocks)
	private int petId;
	private String name;
	Category category;
	private int unitPrice;
	private int stocks;

	public Pet(int petId, String name, Category category, int unitPrice, int stocks) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	public int getPetId() {
		return petId;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getStocks() {
		return stocks;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]";
	}

}
