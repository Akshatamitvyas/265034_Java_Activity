package com.LTTS;

public class Vehicle {
protected String make, vehicleNumber,fueltype;
protected int fuelCapacity,cc;
public Vehicle(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc) {
	super();
	this.make = make;
	this.vehicleNumber = vehicleNumber;
	this.fueltype = fueltype;
	this.fuelCapacity = fuelCapacity;
	this.cc = cc;
}
public void displayMake() {
	System.out.println("***"+make+"***");
}
public void displayBasicInfo() {
	System.out.println("---Basic Information---");
	System.out.println("Vehicle Number:"+vehicleNumber);
	System.out.println("Fuel Capacity:"+fuelCapacity);
	System.out.println("Fuel Type:"+fueltype);
	System.out.println("CC:"+cc);
}
public void displayDetailInfo() {
	
}
}
