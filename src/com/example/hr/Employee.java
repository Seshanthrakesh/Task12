package com.example.hr;

public class Employee {
	
		String name="Rakesh";
		int id=2346;
		double salary=7.25;
		public void printName() {
			System.out.println("Emloyee_Name : "+name);
		}
		public void printId() {
			System.out.println("Emloyee_Id : "+id);
		}
		public void printSalary() {
			System.out.printf("Salary : %.2f",salary);
			System.out.print(" LPA");
			
		}

	}


