package com.capgemini.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;
import com.capgemini.employee.model.Manager;

class ManagerTest {

	private Manager manager;
	@BeforeEach
	public void setUp()
	{
			manager = new Manager(101, "John", 50000.0, 2000.0);
			
	}
	
	@Test
	public void testManagerGrossSalary() {

		assertEquals(89000.0, manager.grossSalary(),0.01);
	}
	@Test
	public void testWithNetSalary()
	{
		manager.grossSalary();
		assertEquals(82800.0,manager.netSalary(),0.01);
	}
	
}
