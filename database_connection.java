package Hopitalbooking;

import java.sql.*;

public class database_connection 
{
		private static final String url = "jdbc:mysql://localhost:3306/hospitalapp";
		private static final String userName = "root";
		private static final String passWord = "abishek23";
		
		public static Connection getConnection() throws SQLException
		{
			return  DriverManager.getConnection(url,userName,passWord);
		}
}
