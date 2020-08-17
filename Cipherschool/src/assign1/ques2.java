package assign1;

import java.util.Scanner;

class Rectangle 
{
	int width;
	int height;
	void display()
	{
		System.out.println("Base display");
	}
}
class RectangleArea extends Rectangle 
{
	void read_input(int a,int b)
	{
		width=a;
		height=b;
	}
	void display()
	{
		System.out.println("width:"+width+" "+"height:"+height);
		System.out.print("Area of Rectangle is:"+width*height);
	}
}

public class ques2 {
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		RectangleArea ra = new RectangleArea();
		ra.read_input(a, b);
		ra.display();
	}
}
