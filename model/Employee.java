package com.capgemini.employee.model;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	private double grossSalary;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public double grossSalary() {
		double hra = basicSalary * 0.50;
		grossSalary = basicSalary + hra + medical;
		return grossSalary;
	}

	public double netSalary() {

		double PT = 200;
		double PF = (0.12 * basicSalary);
		double netSalary = grossSalary - (PT + PF);
		return netSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

}
