package com.capgemini.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;
import com.capgemini.employee.model.Manager;
import com.capgemini.employee.model.MarketingExecutive;

class MarketingExecutiveTest {


	private MarketingExecutive executive;

	@BeforeEach
	public void setUp()
	{
		executive = new MarketingExecutive(101, "John", 50000.0, 2000.0,180.0);
	}
	
	
	@Test
	public void testMarketingexecutiveGrossSalary() {


		assertEquals(79400.0,executive.grossSalary(),0.01);
	}

	@Test
	public void testWithNetSalary()
	{
		
		executive.grossSalary();
		assertEquals(73200.0,executive.netSalary(),0.01);
	}
	
	
	
}
