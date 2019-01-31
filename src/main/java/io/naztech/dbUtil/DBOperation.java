package io.naztech.dbUtil;

import java.security.PublicKey;
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
}
