import java.util.Scanner;
public class Array 
{
	public static void main(String[] args) 
	{
		int searchNo;
		int number = 0;
		int i;
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be searched: ");
		searchNo = sc.nextInt();
		number = arr.length;
		
		for(i=0;i<number;i++)
		{
			if(arr[i]==searchNo)
			{
				System.out.println("Number is present");
				break;
			}
			
		}
		if(number == i)
		{
			System.out.println("Number not present");
		}
		sc.close();
	}
}
