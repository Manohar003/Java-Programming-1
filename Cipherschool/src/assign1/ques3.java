package assign1;

import java.util.Scanner;

class Employee
{
	int empid;
	String empname,empdesignation,emplocation;
	double empsalary;
	public void setName(int empid,String empname,String empdesignation,String emplocation,double empsalary)
	{
		this.empid = empid;
		this.empname = empname;
		this.empdesignation = empdesignation;
		this.emplocation = emplocation;
		this.empsalary = empsalary;
	}
	public void getname()
	{
		System.out.println(empid+" "+empname+" "+empdesignation+" "+emplocation+" "+empsalary);
	}
	public String toString()
	{
		return empid+" "+empname+" "+empdesignation+" "+emplocation+" "+empsalary;
	}
}

public class ques3 {
	public static void main(String[] args)
	{
		int a;
		String b,c,d;
		double f;
		Scanner sc=new Scanner(System.in);
		Employee[] e=new Employee[2];
		for(int i=0;i<10;i++)
		{
			a=sc.nextInt();
			b=sc.next();
			c=sc.next();
			d=sc.next();
			f=sc.nextDouble();
			e[i]=new Employee();
			e[i].setName(a,b,c,d,f);
			e[i].getname();
			System.out.println(e[i]);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(e[i].empname);
		}
		for(int i=0;i<10;i++)
		{
			
			if(e[i].empsalary>50000)
			{
				System.out.println("Salary:"+e[i].empname+" "+e[i].empsalary);
			}
			if(e[i].empname.charAt(0)=='M')
			{
				System.out.println("Employee Name starts with M:"+e[i].empname);
			}
			if(e[i].empdesignation.charAt(e[i].empdesignation.length()-1)=='E')
			{
				System.out.println("Employee Designation ends with E:"+e[i].empname);
			}
		}
	}
}
