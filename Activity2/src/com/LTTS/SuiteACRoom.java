package com.LTTS;

public class SuiteACRoom extends HotelRoom {
private int ratePerSqFeet = 15;

public SuiteACRoom(String hotelName, int numberofSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
	super(hotelName, numberofSqFeet, hasTV, hasWifi);
	this.ratePerSqFeet = ratePerSqFeet;
}

public int getRatePerSqFeet() {
	if (hasWifi == true) {
		return (ratePerSqFeet+2);
	}
	else {
		return ratePerSqFeet;
	}
}

public void setRatePerSqFeet(int ratePerSqFeet) {
	this.ratePerSqFeet = ratePerSqFeet;
}

}
