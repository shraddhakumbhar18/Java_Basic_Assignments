import java.util.Scanner;

public class result 
{
	public static void main(String[] args) 
	{
		int result1;
		int subject1;
		int subject2;
		int subject3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject1 Marks: ");
		subject1 = sc.nextInt();
		System.out.println("Enter Subject2 Marks: ");
		subject2 = sc.nextInt();
		System.out.println("Enter Subject3 Marks: ");
		subject3 = sc.nextInt();
		if(subject1 >60 && subject2>60 && subject3 > 60)
		{
			System.out.println("Passed ");
		}
		else if((subject1>60 && subject2 >60) || (subject2>60 && subject3 >60)|| (subject3>60 && subject1 >60))
		{
			System.out.println("Promoted");
		}
		else 
		{
			System.out.println("Failed");
		}
		sc.close();
	}
}
