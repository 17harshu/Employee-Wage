package com.employee.problems;

public class WelcomeEmployee {
	static int IS_FULL_TIME = 1;
	static int wagePerHour = 20;
	static int partTimeHour = 8;
	static int fullDayHour = 8;
	int isPartTime = 1;
	int isFullTime = 2;
	int empRatePerHour = 20;
	static int numWorkingDays = 20;
	static int workingHours = 0;
	static int totalSalary = 0;
	static int totalWorkingHours = 0;
	
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
	
	public static void empWageUsingCase() {
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch(empCheck) {
		case 1:
			int halfWorkingHours=4;
			int empSalary = halfWorkingHours * wagePerHour;
			System.out.println("Employee Salary for Part Time is: " + empSalary);
			break;
		case 2:
			int fullWorkingHours=8;
			int Salary = fullWorkingHours * wagePerHour;
			System.out.println("Employee Salary for Full Time is: " + Salary);
			break;
		default:
			System.out.println("Employee is absent");
		}
	}
	
	public static void wageForMonth() {
		for(int day=1 ; day<=numWorkingDays ; day++) {
			int empCheck=(int) (Math.floor(Math.random() * 10) % 3);
			
			switch(empCheck) {
			case 1:
				workingHours=4;
				break;
			case 2:
				workingHours=8;
				break;
			default:
				System.out.println("Employee is absent");
			}
				int salary= workingHours * wagePerHour;
				totalSalary=totalSalary + salary;
				System.out.println("Total Salary: " + totalSalary);
		}
	}
	
	public static void finalEmpWages() {
		for(int day=1 ; day<=numWorkingDays ; day++) {
			if ((totalWorkingHours <= 100) || (day <= 20)) {
				int empCheck=(int) (Math.floor(Math.random() * 10) % 3);
					
					switch(empCheck) {
					case 1:
						workingHours=4;
						System.out.println("Full Day");
						break;
					case 2:
						workingHours=8;
						System.out.println("Half Day");
						break;
					default:
						System.out.println("Employee is absent");
					}
			
		
				
				int salary= workingHours * wagePerHour;
				totalSalary=totalSalary + salary;
				totalWorkingHours= totalWorkingHours + workingHours;
				System.out.println("Number of working days: " + day);
				System.out.println("Total working hours: " + totalWorkingHours);
				System.out.println("Total Salary: " + totalSalary);
			}
	}
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		empPresentAbsent();
		empWage();
		empFullTime();
		empWageUsingCase();
		wageForMonth();
		finalEmpWages();
	}
}
