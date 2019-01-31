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

	@Test
	public void showAllBranchTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.ShowAllBranch());
	}

	@Test
	public void DisplayBranchTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.DisplayBranch());
	}

	@Test
	public void FindAccNumberTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.FindAccNumber());
	}

	@Test
	public void FindAccNumberBalFromBrightonTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.FindAccNumberBalFromBrighton());
	}

	@Test
	public void DisplayBranchNameAssetsTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.DisplayBranchNameAssets());
	}

	@Test
	public void FindNameAllBranchTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.FindNameAllBranch());
	}

	@Test
	public void FindCustWithAccTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.FindCustWithAcc());
	}

	@Test
	public void FindCustWithAccWithBalTest() {
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		assertTrue(customerDAOImpl.FindCustWithAccWithBal());
	}
}
