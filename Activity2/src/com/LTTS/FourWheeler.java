package com.LTTS;

public class FourWheeler extends Vehicle {
private String audioSystem;
private int numberOfDoor;
public FourWheeler(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc, String audioSystem,
		int numberOfDoor) {
	super(make, vehicleNumber, fueltype, fuelCapacity, cc);
	this.audioSystem = audioSystem;
	this.numberOfDoor = numberOfDoor;
}
public String getAudioSystem() {
	return audioSystem;
}
public void setAudioSystem(String audioSystem) {
	this.audioSystem = audioSystem;
}
public int getNumberOfDoor() {
	return numberOfDoor;
}
public void setNumberOfDoor(int numberOfDoor) {
	this.numberOfDoor = numberOfDoor;
}
public void displayDetailInfo() {
	System.out.println("---Detail Information---");
	System.out.println("Audio System:"+getAudioSystem());
	System.out.println("Numbers of Doors:"+getNumberOfDoor());
}
}
