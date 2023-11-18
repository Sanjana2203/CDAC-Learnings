package com.app.core;

import java.time.LocalDate;

public class Tape extends Publication {
 private int playingTime;

public Tape(String title, int price, LocalDate publishingDate, int rating, int playingTime) {
	super(title, price, publishingDate, rating);
	this.playingTime = playingTime;
}

public int getPlayingTime() {
	return playingTime;
}

public void setPlayingTime(int playingTime) {
	this.playingTime = playingTime;
}

@Override
public String toString() {
	return "Tape [playingTime=" + playingTime + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getPrice()="
			+ getPrice() + ", getPublishingDate()=" + getPublishingDate() + ", getRating()=" + getRating() + "]";
}


 
 
}
