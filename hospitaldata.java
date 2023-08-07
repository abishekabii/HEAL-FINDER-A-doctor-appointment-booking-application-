package Hopitalbooking;
import java.sql.SQLException;
import java.sql.*;
public class hospitaldata 
{
	public void displayinfo() throws SQLException 
	{
			String query1= "SELECT * FROM hospital_info";
			Connection o1 = database_connection.getConnection();
			Statement s1 = o1.createStatement();
			ResultSet rs = s1.executeQuery(query1);
			while(rs.next()) 
			{
				System.out.println("Hospital No: " + rs.getInt(1));
				System.out.println("Hospital Name: " + rs.getString(2));
				System.out.println("Hospital location: " + rs.getString(3));
				System.out.println("Doctor Name: " + rs.getString(4));
				System.out.println("Capacity: " + rs.getInt(5));
			}
			System.out.println("------------------------------------------");
	}
			public int getCapacity(int no) throws SQLException 
			{
				String query2= "SELECT * FROM hospital_info WHERE hosp_no="+no;
				Connection con = database_connection .getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query2);
				rs.next();
				int val=rs.getInt(5);
				return val;
			}
}
