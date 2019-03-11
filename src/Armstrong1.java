
import java.util.Scanner;

public class Armstrong1 
{
	public static void main(String[] args) 
	{
		int number = 0;
		int remainder;
		int sum;
		int flag;
		int i;
		for (i = 100; i <=999; i++) 
		{
			sum = 0;
			number=i;
			while(number != 0) {
				remainder = number % 10;
				sum = (int) (sum + Math.pow(remainder, 3));
				number = number / 10;
			}
			if (sum == i) 
			{
				System.out.println(i+"Number is armstrong");
			} 


		}

	}

}
