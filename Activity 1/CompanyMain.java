package com.LTTS;
import java.util.Scanner;
class Company{
	private String name, teamlead;
	private String []employees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	public String[] getEmployees() {
		return employees;
	}
	public void setEmployees(String[] employees) {
		this.employees = employees;
	}

}
public class CompanyMain {
public static void main(String[] args) {
	Company co = new Company();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Company name: ");
	String s1 = sc.nextLine();
	co.setName(s1);
	System.out.println("Enter the Employee");
	String s2 = sc.nextLine();
	String[] s = s2.split(",");
	co.setEmployees(s);
	System.out.println("Enter TeamLead");
	String s3 = sc.nextLine();
	co.setTeamlead(s3);
	boolean found = s2.contains(s3);
	if(found == true){
		System.out.println("Name: "+co.getName());
		System.out.println("Employees: "+s2);
		System.out.println("Lead: "+co.getTeamlead());
	    }
	else {
		System.out.println("Invalid output");
	}
	sc.close();
	}
}
