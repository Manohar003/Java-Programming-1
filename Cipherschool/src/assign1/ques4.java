package assign1;


class Circle
{
	private double radius=1.0;
	private String color="red";
	Circle()
	{
		System.out.println("This is constructor");
	}
	Circle(double d)
	{
		this.radius=d;
	}
	void getradius()
	{
		System.out.println("Radius:"+radius);
	}
	void getArea()
	{
		System.out.println("Area:"+(3.14*radius*radius));
	}
}
public class ques4 {
 public static void main(String[] args)
 {
	 Circle c1 = new Circle();
	 Circle c2 = new Circle(20.0);
	 System.out.println("Constructor with no argument obj");
	 c1.getradius();
	 c1.getArea();
	 System.out.println("Constructor with one argument obj");
	 c2.getradius();
	 c2.getArea();
 }
}
