package com.capgemini.employee.model;

public class Manager extends Employee{
	
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	private double grossSalary;
	
	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId,employeeName,basicSalary,medical);

		petrolAllowance=(0.08)*basicSalary;
		foodAllowance=(0.13)*basicSalary;
		otherAllowance=(0.03)*basicSalary;
	}
	
	public double grossSalary()
	{
		 grossSalary=super.grossSalary();
		grossSalary=petrolAllowance+foodAllowance+otherAllowance+grossSalary;
		return grossSalary;
	}
	
	public double netSalary() {

		double PT = 200;
		double PF = (0.12 * getBasicSalary());
		
		double netSalary = grossSalary - (PT + PF);
		return netSalary;
	}

	
	
}
