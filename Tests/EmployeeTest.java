package com.capgemini.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;

class EmployeeTest {

	private Employee employee;

	@BeforeEach
	public void setUp()
	{
		employee=new Employee(101,"John",50000.0,2000.0);
	}
	
	@Test
	public void testWithDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}

	@Test
	public void testWithParameterizedConstructor()
	{
		Employee employee=new Employee(101,"John",30000.0,2000.0);
		assertNotNull(employee);
		assertEquals(101,employee.getEmployeeId());
		assertEquals("John", employee.getEmployeeName());
		assertEquals(30000.0,employee.getBasicSalary());
		assertEquals(2000.0,employee.getMedical());
		
	}

	@Test
	public void testWithGrossSalary()
	{
		double grossSal=employee.grossSalary();
		assertEquals(77000.0,grossSal,0.01);
	}
	
	@Test
	public void testWithNetSalary()
	{
		employee.grossSalary();
		assertEquals(70800.0,employee.netSalary(),0.01);
	}
	
	
	
	
	
}
