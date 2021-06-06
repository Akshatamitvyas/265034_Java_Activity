package com.LTTS;

public class DeluxeRoom extends HotelRoom {
protected int ratePerSqFoot = 10;

public DeluxeRoom(String hotelName, int numberofSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFoot) {
	super(hotelName, numberofSqFeet, hasTV, hasWifi);
	this.ratePerSqFoot =ratePerSqFoot;
}
public int getRatePerSqFeet() {
	if (hasWifi == true) {
		return (ratePerSqFoot+2);
	}
	else {
		return ratePerSqFoot;
	}
}
}
