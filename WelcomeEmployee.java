package com.employee.problems;

public class WelcomeEmployee {
	static int IS_FULL_TIME = 1;
	
	public static void empPresentAbsent() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		empPresentAbsent();
	}
}
