package com.app.core;

import java.time.LocalDate;

public class Publication {

private int id;
private String title;
private int price;
private LocalDate publishingDate;
private int rating;
public static int idGenerator=0;


public Publication(String title, int price, LocalDate publishingDate, int rating) {
	super();
	this.id = ++idGenerator;
	this.title = title;
	this.price = price;
	this.publishingDate = publishingDate;
	this.rating = rating;
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getTitle() {
	return title;
}




public void setTitle(String title) {
	this.title = title;
}




public int getPrice() {
	return price;
}




public void setPrice(int price) {
	this.price = price;
}




public LocalDate getPublishingDate() {
	return publishingDate;
}




public void setPublishingDate(LocalDate publishingDate) {
	this.publishingDate = publishingDate;
}




public int getRating() {
	return rating;
}




public void setRating(int rating) {
	this.rating = rating;
}







}
