package com.LTTS;

import java.util.Scanner;
public class VehicleMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number="";
		while(!number.equals("3")) {
			System.out.println("1. Four Wheeler");
			System.out.println("2. Two Wheeler");
			System.out.println("Enter vehicle Type:");
			number = sc.next();
			switch(number) {
			case "1":
				System.out.println("Vehicle Make:");
				String vm1 = sc.next();
				System.out.println("Vehicle Number:");
				String vn1 = sc.next();
				String ft1 = "";
				String ch ="";
				System.out.println("Fuel Type");
				System.out.println("1. Petrol");
				System.out.println("2. Diesel");
				ch = sc.next();
				if(ch.equals("1")) {
					ft1 = "Petrol";
				}
				else {
					ft1 = "Diesel";
				}
				System.out.println("Fuel Capacity:");
				int fc1 = sc.nextInt();
				System.out.println("Engine CC");
				int ecc = sc.nextInt();
				System.out.println("Audio System:");
				String as1 = sc.next();
				System.out.println("Numbers of Doors:");
				int nd1 = sc.nextInt();
				FourWheeler fw = new FourWheeler(vm1, vn1, ft1, fc1, ecc, as1, nd1);
				fw.displayMake();
				fw.displayBasicInfo();
				fw.displayDetailInfo();
			case "2":
				System.out.println("Vehicle Make:");
				String vm2 = sc.next();
				System.out.println("Vehicle Number:");
				String vn2 = sc.next();
				String ft2 = "";
				String ch1 = "";
				System.out.println("Fuel Type");
				System.out.println("1. Petrol");
				System.out.println("2. Diesel");
				ch1 = sc.next();
				if(ch1.equals("1")) {
					ft2 = "Petrol";
				}
				else {
					ft2 = "Diesel";
				}
				System.out.println("Fuel Capacity:");
				int fc2 = sc.nextInt();
				System.out.println("Engine CC");
				int ecc1 = sc.nextInt();
				System.out.println("Kick Start Available(yes/no):");
				String ksa1 = sc.next();
				boolean x;
				if (ksa1.equals("yes")) {
					ksa1 = "true";
					x =  Boolean.parseBoolean(ksa1);
				}
				else {
					ksa1 = "false";
					x =  Boolean.parseBoolean(ksa1);
				}
				TwoWheeler tw = new TwoWheeler(vm2, vn2, ft2, fc2, ecc1, x);
				tw.displayMake();
				tw.displayBasicInfo();
				tw.displayDetailInfo();
			}
		}
		sc.close();
	}
}