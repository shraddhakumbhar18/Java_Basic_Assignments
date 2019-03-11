import java.util.Scanner;
public class Rectangle 
{
	static int length;
	static int breadth;
	int area;
	int area1;
	int area2;
	int perimeter;
	int perimeter1;
	int perimeter2;

	public int area()
	{
		return (length*breadth);
	}
	public int perimeter()
	{
		return (2*(length+breadth));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		length = sc.nextInt();
		System.out.println("Enter the breadth of Rectangle:");
		breadth = sc.nextInt();
		Rectangle obj = new Rectangle();
		
		int area1 = obj.area();
		System.out.println("The area of rectangle:" + area1);				
		int perimeter1 = obj.perimeter();
		System.out.println("The perimeter of rectangle:" + perimeter1);	
		Rectangle obj2 = new Rectangle();
		int area2 = obj2.area();
		System.out.println("The area of rectangle:" + area2);				
		int perimeter2 = obj2.perimeter();
		System.out.println("The perimeter of rectangle:" + perimeter2);	
	}
}