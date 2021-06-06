package com.LTTS;

public class HotelRoom {
protected String hotelName;
protected int numberofSqFeet;
protected boolean hasTV;
protected boolean hasWifi;
public HotelRoom(String hotelName, int numberofSqFeet, boolean hasTV, boolean hasWifi) {
	super();
	this.hotelName = hotelName;
	this.numberofSqFeet = numberofSqFeet;
	this.hasTV = hasTV;
	this.hasWifi = hasWifi;
}
public int calculateTariff() {
	int x = numberofSqFeet * getRatePerSqFeet();
	return x;
}
public int getRatePerSqFeet() {
	return 0;
}
}
