package Hopitalbooking;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class patient 
{
	String pat_name;
	int pat_age;
	String pat_gender;
	String cause;
	Date date;
	int hospital_no;
	patient()
	{
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter name of patient: ");
			pat_name = scanner.next();
			System.out.println("Enter patient's age: ");
			pat_age = scanner.nextInt();
			System.out.println("Enter patient's gender: ");
			pat_gender= scanner.next();
			System.out.println("Enter your causes: ");
			cause = scanner.next();
			System.out.println("Enter date dd-MM-yyyy");
			String dateip = scanner.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			try 
			{
				date= dateFormat.parse(dateip);
			} 
			catch (ParseException o1) 
			{
				o1.printStackTrace();
			}
			System.out.println("Enter hospital no to book:");
			hospital_no= scanner.nextInt();
		}
	}
	public boolean isavailable()  throws SQLException
	{
		
		hospitaldata o1 = new hospitaldata();
		patientdata o2 = new patientdata();
		int capacity = o1.getCapacity(hospital_no);
		
		System.out.println("capacity:"+capacity);
		
		int booked = o2.getbookedcount(hospital_no,date);
		
		System.out.println("Booked:"+booked);
		
		return booked<capacity;
		
	}
}
