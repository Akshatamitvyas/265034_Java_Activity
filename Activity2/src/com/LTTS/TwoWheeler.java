package com.LTTS;

public class TwoWheeler extends Vehicle {
private boolean kickStartAvailable;

public TwoWheeler(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc,
		boolean kickStartAvailable) {
	super(make, vehicleNumber, fueltype, fuelCapacity, cc);
	this.kickStartAvailable = kickStartAvailable;
}

public boolean isKickStartAvailable() {
	return kickStartAvailable;
}

public void setKickStartAvailable(boolean kickStartAvailable) {
	this.kickStartAvailable = kickStartAvailable;
}
public void displayDetailInfo() {
	if (kickStartAvailable == true) {
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available:YES");
	}
	else {
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available:NO");
	}
}
}
