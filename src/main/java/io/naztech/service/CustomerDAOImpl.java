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
	
}
