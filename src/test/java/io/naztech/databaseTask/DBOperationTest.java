package io.naztech.databaseTask;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.naztech.service.CustomerDAOImpl;

public class DBOperationTest {
	@Test
	public void showAllCustomerTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.ShowAllCustomer());
	}
}
