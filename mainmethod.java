package Hopitalbooking;
import java.util.Scanner;
public class mainmethod 
{
	public static void main(String args[])
	{
		try
		{
			hospitaldata o1=new hospitaldata();
			o1.displayinfo();
			int option=1;
			try (Scanner scanner = new Scanner(System.in)) {
				while(option==1)
				{
					System.out.println("Enter 1 to book your confirmation and 2 to exit");
					option=scanner.nextInt();
					if(option==1)
					{
						patient book =new patient();
						if(book.isavailable())
						{
							patientdata pd=new patientdata();
							pd.addbooking(book);
							System.out.println("Successfully booked......");
						}
						else
						{
							System.out.println("Sorry No space....");
						}
					}
					else
					{
						System.out.println("Thanks for contacting us..... "
								+ "Press 1 to book your appointment");
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}
