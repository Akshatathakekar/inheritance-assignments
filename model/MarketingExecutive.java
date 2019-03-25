package com.capgemini.employee.model;

public class MarketingExecutive extends Employee {

	private double kilometerTravelled;
	private int tourAllowance;
	private int telephoneAllowance;
	private double grossSalary;

	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical,
			double kilometerTravelled) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kilometerTravelled = kilometerTravelled;
		tourAllowance=5;
		telephoneAllowance=1500;
	}

	public double grossSalary()
	{
		
   grossSalary=super.grossSalary()+(kilometerTravelled*tourAllowance)+telephoneAllowance;
		return grossSalary;
		
	}
	public double netSalary() {

		double PT = 200;
		double PF = (0.12 * getBasicSalary());
		double netSalary = grossSalary - (PT + PF);
		return netSalary;
	}
}
