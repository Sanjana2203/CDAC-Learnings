package com.app.core;

import java.time.LocalDate;

public class Pen {
	
	private int id;
	private Brand brand;
	private Colour colour;
	private InkColor inkColor;
	private String material;
	private int stock;
	private LocalDate updateDate;
	private LocalDate stockListingDate;
	private double price;
	private double discount;
	
	
	
	public Pen(int id, Brand brand, Colour colour, InkColor inkColor, String material, int stock,
			LocalDate updateDate, LocalDate stockListingDate,double price, double discount) {
		super();
		this.id = id;
		this.brand = brand;
		this.colour = colour;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.updateDate = updateDate;
		this.stockListingDate = stockListingDate;
		this.price= price-1.01*discount;
		this.discount = discount;
	}

	
	

	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price- 0.01*getDiscount();
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Brand getBrand() {
		return brand;
	}




	public void setBrand(Brand brand) {
		this.brand = brand;
	}




	public Colour getColour() {
		return colour;
	}




	public void setColour(Colour colour) {
		this.colour = colour;
	}




	public InkColor getInkColor() {
		return inkColor;
	}




	public void setInkColor(InkColor inlColor) {
		this.inkColor = inlColor;
	}




	public String getMaterial() {
		return material;
	}




	public void setMaterial(String material) {
		this.material = material;
	}




	public int getStock() {
		return stock;
	}




	public void setStock(int stock) {
		this.stock = stock;
	}




	public LocalDate getUpdateDate() {
		return updateDate;
	}




	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}




	public LocalDate getStockListingDate() {
		return stockListingDate;
	}




	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}




	public double getDiscount() {
		return discount;
	}




	public void setDiscount(double discount) {
		this.discount = discount;
	}




	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", colour=" + colour + ", inlColor=" + inkColor
				+ ", material=" + material + ", stock=" + stock + ", updateDate=" + updateDate + ", stockListingDate="
				+ stockListingDate +", price=" + price +  ", discount=" + discount + "]";
	}
	
	
	

}
