package com.LTTS;

import java.util.Scanner;

abstract class Match{
	private int currentscore, target;
	private float currentover;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqrunrate,int balls);
}
class ODIMatch extends Match{ 
	float calculateRunRate() {
		int remainingScore = (getTarget()-getCurrentscore());
		float remainingOver = (50 - getCurrentover());
		float RunRate = (float)remainingScore/remainingOver;
		return RunRate;
	}
	int calculateBalls() {
		float tillBalls = getCurrentover()*6;
		int Balls = (int)tillBalls;
		int remainingBalls = 50*6 - Balls;
		return remainingBalls;
	}
	void display(double reqrunrate, int balls) {
		System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate()+"0");
	}
	
}

class TestMatch extends Match{
	float calculateRunRate() {
		int remainingScore = (getTarget()-getCurrentscore());
		float remainingOver = (90 - getCurrentover());
		float RunRate = (float)remainingScore/remainingOver;
		return RunRate;
	}
	int calculateBalls() {
		float tillBalls = getCurrentover()*6;
		int Balls = (int)tillBalls;
		int remainingBalls = 90*6 - Balls;
		return remainingBalls;
	}
	void display(double reqrunrate, int balls) {
		System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate()+"0");
	}
}

class T20Match extends Match{
	float calculateRunRate() {
		int remainingScore = (getTarget()-getCurrentscore());
		float remainingOver = (20 - getCurrentover());
		float R = (float)remainingScore/remainingOver;
		return R;
	}
	int calculateBalls() {
		float tillBalls = getCurrentover()*6;
		int Balls = (int)tillBalls;
		int remainingBalls = 20*6 - Balls;
		return remainingBalls;
	}
	void display(double reqrunrate, int balls) {
		System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate()+"0");
	}
}

public class MatchMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number="";
		while(!number.equals("4")){
			System.out.println("Enter the match format");
			System.out.println("1. ODI");
			System.out.println("2. T20");
			System.out.println("3. Test");
			System.out.println("4. Exit");
			number = sc.next();
			switch(number) {
			case "1": // ODI Class
				ODIMatch odi = new ODIMatch();
				System.out.println("Enter the Current Score: ");
				int cs1 = sc.nextInt();
				odi.setCurrentscore(cs1);
				System.out.println("Enter Current over: ");
				float co1 = sc.nextFloat();
				odi.setCurrentover(co1);
				System.out.println("Enter the Target: ");
				int t1 = sc.nextInt();
				odi.setTarget(t1);
				t1=t1*6;
				odi.display(co1, t1);
				break;
			case "2":
				T20Match t20 = new T20Match();
				System.out.println("Enter the Current Score: ");
				int cs3 = sc.nextInt();
				t20.setCurrentscore(cs3);
				System.out.println("Enter Current over: ");
				float co3 = sc.nextFloat();
				t20.setCurrentover(co3);
				System.out.println("Enter the Target: ");
				int t3 = sc.nextInt();
				t20.setTarget(t3);
				t3=t3*6;
				t20.display(co3, t3);
				break;
			case "3":
				TestMatch te = new TestMatch();
				System.out.println("Enter the Current Score: ");
				int cs2 = sc.nextInt();
				te.setCurrentscore(cs2);
				System.out.println("Enter Current over: ");
				float co2 = sc.nextFloat();
				te.setCurrentover(co2);
				System.out.println("Enter the Target: ");
				int t2 = sc.nextInt();
				te.setTarget(t2);
				t2=t2*6;
				te.display(co2, t2);
				break;
			}
		}
		sc.close();
	}
}