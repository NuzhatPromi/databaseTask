package io.naztech.service;

import java.sql.SQLException;

import io.naztech.dao.CustomerDAO;
import io.naztech.dbUtil.DBOperation;

public class CustomerDAOImpl implements CustomerDAO {

	public boolean ShowAllCustomer() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.ShowAllCustomerData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean ShowAllBranch() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.ShowAllBranchData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean DisplayBranch() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.DisplayBranchData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean FindAccNumber() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.FindAccNumberData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean FindAccNumberBalFromBrighton() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.FindAccNumberBalFromBrightonData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean DisplayBranchNameAssets() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.DisplayBranchNameAssetsData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean FindNameAllBranch() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.FindNameAllBranchData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean FindCustWithAcc() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.FindCustWithAccData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean FindCustWithAccWithBal() {
		DBOperation dbOperations = new DBOperation();

		try {
			return dbOperations.FindCustWithAccWithBalData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
