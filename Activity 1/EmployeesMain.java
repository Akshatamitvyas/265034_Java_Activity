package com.LTTS;
import java.util.Scanner;
class Employees{
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
public class EmployeesMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Employees em = new Employees();
	System.out.println("Enter the Name: ");
	String s1 = sc.nextLine();
	em.setName(s1);
	System.out.println("Enter Address: ");
	String s2 = sc.nextLine();
	em.setAddress(s2);
	System.out.println("Enter Mobile:");
	String s3 = sc.nextLine();
	em.setMobile(s3);
	String number ="";
	while(!number.equals("4")) {
		System.out.println("Menu");
		System.out.println("1. Update Employee Name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee Mobile");
		System.out.println("4. All Information correct/Exit");
		number = sc.next();
		switch(number) {
		case "1":
			System.out.println("Current Name: "+em.getName());
			System.out.println("Enter the Name: ");
			String S1 = sc.next();
			em.setName(S1);
			System.out.println(em.getName());
			break;
		case "2":
			System.out.println("Current Address: "+em.getAddress());
			System.out.println("Enter Address: ");
			String S2 = sc.next();
			em.setName(S2);
			System.out.println(em.getAddress());
			break;
		case "3":
			System.out.println("Current Mobile: "+em.getMobile());
			System.out.println("Enter Mobile: ");
			String S3 = sc.next();
			em.setName(S3);
			System.out.println(em.getMobile());
			break;
		case "4":
			System.out.println("Name: "+em.getName());
			System.out.println("Address: "+em.getAddress());
			System.out.println("Mobile: "+em.getMobile());
			break;
		}
	}
	sc.close();
}
}
