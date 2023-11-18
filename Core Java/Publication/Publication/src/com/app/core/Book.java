package com.app.core;

import java.time.LocalDate;

public class Book extends Publication {
 private int pages;



public Book(String title, int price, LocalDate publishingDate, int rating, int pages) {
	super(title, price, publishingDate, rating);
	this.pages = pages;
}



public int getPages() {
	return pages;
}



public void setPages(int pages) {
	this.pages = pages;
}



@Override
public String toString() {
	return "Book [Id="+super.getId()+"pages=" + pages + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice()
			+ ", getPublishingDate()=" + getPublishingDate() + ", getRating()=" + getRating() +"]";
}
 
 
	

}
