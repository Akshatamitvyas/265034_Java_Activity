package com.LTTS;


import java.util.Scanner;
class Innings{
	private String teamname, inningsname;
	private int runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void displayInningsDetails(String inningsname, int runs) {
		if (runs < 0) {
			System.out.println("Invalid output");
		}
		else {
			if (inningsname.equalsIgnoreCase("Second")) {
				System.out.println("Name: "+getTeamname());
				System.out.println("Scored: "+getRuns());
				System.out.println("Match Ended");
			}
			else {
				System.out.println("Name: "+getTeamname());
				System.out.println("Scored: "+getRuns());
				System.out.println("Need "+(getRuns()+1)+" to Win");
			}
		}
	}
}
	

public class InningsMain {

	public static void main(String[] args) {
		Innings i = new Innings();
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		int runs;
		System.out.println("Enter the team name: ");
		s1 = sc.nextLine();
		System.out.println("Enter Session: ");
		s2 = sc.nextLine();
		System.out.println("Enter runs: ");
		runs = sc.nextInt();
		i.setTeamname(s1);
		i.setInningsname(s2);
		i.setRuns(runs);
		i.displayInningsDetails(s2, runs);
		sc.close();
	}
}
