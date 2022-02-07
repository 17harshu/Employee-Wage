package com.employee.problems;

public class WelcomeEmployee {
	static int IS_FULL_TIME = 1;
	static int wagePerHour = 20;
	static int partTimeHour = 8;
	static int fullDayHour = 8;
	
	public static void empPresentAbsent() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
	
	public static void empWage() {
		int empWage = wagePerHour * partTimeHour;
		System.out.println("Daily Employee Wage for Part Time is: " + empWage);
	}
	
	public static void empFullTime()
	{
		int empWage = wagePerHour * fullDayHour;
		System.out.println("Daily Employee Wage for Full Time is: " + empWage);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		empPresentAbsent();
		empWage();
		empFullTime();
	}
}
