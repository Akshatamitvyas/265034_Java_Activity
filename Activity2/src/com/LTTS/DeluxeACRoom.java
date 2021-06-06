package com.LTTS;

public class DeluxeACRoom extends DeluxeRoom {
protected int ratePerSqFeet = 10;

public DeluxeACRoom(String hotelName, int numberofSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFoot,
		int ratePerSqFeet) {
	super(hotelName, numberofSqFeet, hasTV, hasWifi, ratePerSqFoot);
	this.ratePerSqFeet = ratePerSqFoot;
}
}
