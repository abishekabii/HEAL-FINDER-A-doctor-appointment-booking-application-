package Hopitalbooking;
import java.util.Date;
import java.sql.SQLException;
import java.sql.*;
public class patientdata 
{
	public int getbookedcount (int hosp_no,Date date)throws SQLException
	{
		String query3="select count(patient_name) from patient_info where hosno=? and book_date=?";
		Connection o1=database_connection.getConnection();
		PreparedStatement pst=o1.prepareStatement(query3);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setInt(1, hosp_no);
		pst.setDate(2, sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	public void addbooking(patient book) throws SQLException
	{
		String query4="INSERT INTO patient_info VALUES(?,?,?,?,?,?)";
		Connection c=database_connection.getConnection();
		java.sql.Date sqldate =new java.sql.Date(book.date.getTime());
		PreparedStatement pst=c.prepareStatement(query4);
		pst.setString(1,book.pat_name);
		pst.setInt(2,book.pat_age);
		pst.setString(3,book.pat_gender);
		pst.setDate(4,sqldate);
		pst.setString(5,book.cause);
		pst.setInt(6,book.hospital_no);
		pst.executeUpdate();
	}
}




