package com.LTTS;

import java.util.Scanner;

abstract class Shape{
	int value;
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	abstract void calculateArea(int value);
}
class Circle extends Shape{
	void calculateArea(int value) {
		final double PI = 3.14;
		double area = PI*value*value;
		System.out.println("Area of Circle is: "+String.format("%.2f", area));
	}
}
class Square extends Shape{
	void calculateArea(int value) {
		double area = value*value;
		System.out.println("Area of Square: "+String.format("%.2f", area));
	}
}

public class ShapeMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Circle");
	System.out.println("Square");
	System.out.println("Enter the Shape: ");
	String s1 = sc.next();
	if (s1.equals("Circle")) {
		System.out.println("Enter The Radius: ");
		int r = sc.nextInt();
		Circle c = new Circle();
		c.setValue(r);
		c.calculateArea(r);
	}
	else {
		System.out.println("Enter the Side");
		int side = sc.nextInt();
		Square s = new Square();
		s.setValue(side);
		s.calculateArea(side);
	}
	sc.close();
}
}
