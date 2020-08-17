package assign1;

public class ques6 {
	
	String name;
	int year_of_join;
	double salary;
	String address;
	ques6(String name,int year_of_join,double salary,String address)
	{
		this.name=name;
		this.year_of_join=year_of_join;
		this.salary=salary;
		this.address=address;
	}
	void showdetails()
	{
		System.out.println(name+"\t"+year_of_join+"\t\t"+address);
	}
	public static void main(String[] args)
	{
		ques6 a=new ques6("Ram",1996,1234456.00,"Ram-Nagar,123");
		ques6 b=new ques6("Shyam",2006,723445.00,"Gandhi-Nagar,453");
		ques6 c=new ques6("Bhyam",2000,953445.00,"Saroj-Nagar,789");
		System.out.println("Name"+"\t"+"Year-Of-Join"+"\t"+"Address");
		a.showdetails();
		b.showdetails();
		c.showdetails();
	}
}
