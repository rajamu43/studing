package org.chainsys.projecthospital.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecting {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		getconnected();
	}

	public static Connection getconnected() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		//System.out.println(con);
		return con;
	}

	

}
