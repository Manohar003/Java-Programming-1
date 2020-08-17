package assign1;

import java.util.Scanner;
import java.lang.Math;
public class ques7 {
	static void Triangle(int a,int b,int c)
	{
		double p =Double.valueOf((a+b+c)/2);
		double k = Math.sqrt(p*((p-a)*(p-b)*(p-c)));
		System.out.println("Using Heron's Formula");
		System.out.println("Area of Triangle:"+k);
	}
	public static void main(String[] args)
	{
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Triangle(a,b,c);
		sc.close();
	}
}
