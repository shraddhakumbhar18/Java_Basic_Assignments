import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int number;
		int remainder;
		int sum = 0;
		int flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		number = sc.nextInt();
		flag = number;
		while(number > 0)
		{
			remainder = number%10;
			sum = (int) (sum + Math.pow(remainder, 3));
			number = number/10;
		}
		if( flag == sum)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		sc.close();
	}

}
