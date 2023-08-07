package Hopitalbooking;

public class hospital 
{
	int hosp_no;
	String hosp_name;
	String hosp_loc;
	String doct_name;
	int capacity;
	hospital(int no, String name,String loc,String doct_name,int capacity)
	{
		this.hosp_no=no;
		this.hosp_name=name;
		this.hosp_loc=loc;
		this.doct_name=doct_name;
		this.capacity=capacity;
	}
	// Get methods
	public int gethosp_no()
	{
		return hosp_no;
	}
	public String gethosp_name()
	{
		return hosp_name;
	}
	public String gethosp_loc()
	{
		return hosp_loc;
	}
	public String getdoct_name()
	{
		return doct_name;
	}
	public int getcapacity()
	{
		return capacity;
	}
	//Set method
	public void setdoct_name(String name)
	{
		doct_name=name;
	}
	public void setcapacity(int capa)
	{
		capacity=capa;
	}
}
