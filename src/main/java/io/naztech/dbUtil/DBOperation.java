package io.naztech.dbUtil;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOperation {
	public boolean ShowAllCustomerData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_1()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("customer_name");
			if (strName != null) {
				return true;
			}
		}
		return false;
	}

	public boolean ShowAllBranchData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_2()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("branch_name");
			if (strName != null) {
				return true;
			}
		}
		return false;
	}

	public boolean DisplayBranchData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_3()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("branch_name");
			String strCity = rs.getString("branch_city");
			BigDecimal assets = rs.getBigDecimal("assets");
			if (strName != null && strCity != null && assets.compareTo(BigDecimal.ZERO) != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean FindAccNumberData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_4()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("account_number");
			if (strName != null) {
				return true;
			}
		}
		return false;
	}

	public boolean FindAccNumberBalFromBrightonData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_5()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("account_number");
			BigDecimal balance = rs.getBigDecimal("balance");
			if (strName != null && balance.compareTo(BigDecimal.ZERO) != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean DisplayBranchNameAssetsData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_6()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString(1);
			BigDecimal assets = rs.getBigDecimal(3);
			if (strName != null && assets.compareTo(BigDecimal.ZERO) != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean FindNameAllBranchData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_7()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("branch_name");
			if (strName != null) {
				return true;
			}
		}
		return false;
	}

	public boolean FindCustWithAccData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_8()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("customer_name");
			String strAccNumer = rs.getString("account_number");
			BigDecimal balance = rs.getBigDecimal("balance");

			if (strName != null && strAccNumer != null && balance.compareTo(BigDecimal.ZERO) != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean FindCustWithAccWithBalData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String sqlString = "{CALL promi_9()}";
		CallableStatement stmt = dbConnection.prepareCall(sqlString);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String strName = rs.getString("customer_name");
			String strAccNumer = rs.getString("account_number");
			BigDecimal balance = rs.getBigDecimal("balance");

			if (strName != null && strAccNumer != null && balance.compareTo(BigDecimal.ZERO) != 0) {
				return true;
			}
		}
		return false;
	}
}
