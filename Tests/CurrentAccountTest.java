package com.capgemini.employee;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.CurrentAccount;


public class CurrentAccountTest {

	private CurrentAccount account;
	
	@Before
	public void setUp() {
		account = new CurrentAccount(101, "John", 45000);
	}

	
	@Test
	public void testWithdrawWithSufficientBalance() {
		assertEquals(40000, account.withdraw(5000), 0.01);
	}
	
	
	@Test
	public void testWithdrawWithSufficientDebitLimit() {
		 account.withdraw(50000);
		assertEquals(0,account.getAccountBalance(), 0.01);
	}
	
	@Test
	public void testWithdrawWithDebitLimitExceedAndDeposit() {
		 account.withdraw(65000);
		assertEquals(0,account.getAccountBalance(), 0.01);
		account.withdraw(5000);
		assertEquals(0, account.getAccountBalance(),0.01);
		account.deposit(25000);
		assertEquals(5000, account.getAccountBalance(),0.01);

	}
	
	@Test
	public void testdeposit() {
		account = new CurrentAccount(101, "John", 0);
		assertEquals(5000, account.deposit(5000), 0.01);
	}
	
}
