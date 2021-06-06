package com.LTTS;
import java.util.Scanner;
public class HotelRoomMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number="";
		while(!number.equals("4")) {
			System.out.println("Hotel Tariff Calculate");
			System.out.println("1. Deluxe Room");
			System.out.println("2. Deluxe AC Room");
			System.out.println("3. Suite AC Room");
			System.out.println("Select Room Type:");
			number = sc.next();
			switch(number) {
			case "1":
				System.out.println("Hotel Name:");
				String hn1 = sc.next();
				System.out.println("Room Square Feet Area:");
				int rsfa1 = sc.nextInt();
				System.out.println("Room has TV(yes/no):");
				String rhtv1 = sc.next();
				boolean x1;
				if (rhtv1.equals("yes")) {
					rhtv1 = "true";
					x1 =  Boolean.parseBoolean(rhtv1);
				}
				else {
					rhtv1 = "false";
					x1 =  Boolean.parseBoolean(rhtv1);
				}
				System.out.println("Room has Wifi:(yes/no)");
				String rhwf1 = sc.next();
				boolean y1;
				if (rhwf1.equals("yes")) {
					rhwf1 = "true";
					y1 =  Boolean.parseBoolean(rhwf1);
				}
				else {
					rhwf1 = "false";
					y1 =  Boolean.parseBoolean(rhwf1);
				}
				DeluxeRoom dr = new DeluxeRoom(hn1, rsfa1, x1, y1, 10);
				dr.getRatePerSqFeet();
				System.out.println("Room Tariff per day is:"+dr.calculateTariff());
				break;
			case "2":
				System.out.println("Hotel Name:");
				String hn2 = sc.next();
				System.out.println("Room Square Feet Area:");
				int rsfa2 = sc.nextInt();
				System.out.println("Room has TV(yes/no):");
				String rhtv2 = sc.next();
				boolean x2;
				if (rhtv2.equals("yes")) {
					rhtv2 = "true";
					x2 = Boolean.parseBoolean(rhtv2);
				}
				else {
					rhtv2 = "false";
					x2 = Boolean.parseBoolean(rhtv2);
				}
				System.out.println("Room has Wifi:(yes/no)");
				String rhwf2 = sc.next();
				boolean y2;
				if (rhwf2.equals("yes")) {
					rhwf2 = "true";
					y2 = Boolean.parseBoolean(rhwf2);
				}
				else {
					rhwf2 = "false";
					y2 =  Boolean.parseBoolean(rhwf2);
				}
				DeluxeACRoom dar = new DeluxeACRoom(hn2, rsfa2, x2, y2, 10, 10);
				dar.getRatePerSqFeet();
				System.out.println("Room Tariff per day is:"+dar.calculateTariff());
				break;
			case "3":
				System.out.println("Hotel Name:");
				String hn3 = sc.next();
				System.out.println("Room Square Feet Area:");
				int rsfa3 = sc.nextInt();
				System.out.println("Room has TV(yes/no):");
				String rhtv3 = sc.next();
				boolean x3;
				if (rhtv3.equals("yes")) {
					rhtv3 = "true";
					x3 = Boolean.parseBoolean(rhtv3);
				}
				else {
					rhtv3 = "false";
					x3 =  Boolean.parseBoolean(rhtv3);
				}
				System.out.println("Room has Wifi:(yes/no)");
				String rhwf3 = sc.next();
				boolean y3;
				if (rhwf3.equals("yes")) {
					rhwf3 = "true";
					y3 = Boolean.parseBoolean(rhwf3);
				}
				else {
					rhwf3 = "false";
					y3 = Boolean.parseBoolean(rhwf3);
				}
				SuiteACRoom sar = new SuiteACRoom(hn3, rsfa3, x3, y3, 15);
				sar.getRatePerSqFeet();
				System.out.println("Room Tariff per day is:"+sar.calculateTariff());
				break;
			}
		}
		sc.close();
	}
}
