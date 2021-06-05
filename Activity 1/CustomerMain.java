package com.LTTS;
import java.util.Scanner;
class Customer{
	private String name, address, mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
public class CustomerMain {
public static void main(String[] args) {
	Customer c = new Customer();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Details");
	String s = sc.nextLine();
	String[] word = s.split(",");
	String s1 = word[0];
	String s2 = word[1];
	String s3 = word[2];
	c.setName(s1);
	c.setAddress(s2);
	c.setMobile(s3);
	System.out.println("Name: "+c.getName());
	System.out.println("Address: "+c.getAddress());
	System.out.println("Mobile: "+c.getMobile());
	sc.close();
}
}
