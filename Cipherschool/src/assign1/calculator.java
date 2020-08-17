package assign1;

interface ad
{
	 int add(int a,int b);

}
interface dif
{
	 int difference(int a,int b);

}
interface pro
{
	 int product(int a,int b);

}
interface safedivision
{
	 int division(int a,int b);

}
public class calculator {
	public static void main(String[] args)
	{
		ad x =(a,b)->(a+b);
		System.out.println(x.add(5, 7));
		
		dif b =(x1,x2)->(x1-x2);
		System.out.println(b.difference(5, 7));
		
		pro c =(a1,a2)->{ 
			return(a1*a2);
			};
		System.out.println(c.product(5, 7));
		try {
		safedivision d =(b1,b2)->{
			return (b1/b2);
		};
		System.out.println(d.division(5, 0));
		}
		 catch(ArithmeticException e) { 
	            System.out.println ("Can't divide a number by 0"); 
	        } 
		
		
	}
}
