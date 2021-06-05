package com.LTTS;


import java.util.Scanner;


class Employee{
	private String empname, empaddress, empno;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}
	
}
public class EmployeeMain {
public static void main(String[] args) {
	Employee e = new Employee();
	Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		s1 = sc.next();
		s2 = sc.next();
		s3 = sc.next();
		System.out.println("Enter the Name: ");
		e.setEmpname(s1);
	
	System.out.println("Enter Address");
	e.setEmpaddress(s2);
	System.out.println("Enter Mobile Number");
	e.setEmpno(s3);
	System.out.println("Name: "+e.getEmpname());
	System.out.println("Address: "+e.getEmpaddress());
	System.out.println("Mobile Number: "+e.getEmpno());
	sc.close();
}
}
