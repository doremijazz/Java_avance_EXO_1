package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Dao {
	
	private static final String URL =
	        "jdbc:mariadb://127.0.0.1:3306/Shop";

	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	protected Connection getconnection() throws SQLException{
		return DriverManager.getConnection(URL,USER,PASSWORD);
		
	}

}
