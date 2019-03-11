import java.util.Scanner;
public class Bubblesort 
{
	public static void main(String[] args) 
	{
		int bubSort;
		int number;
		int i;
		int j;
		int temp;
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		number = arr.length;
		for(i=0 ; i<number-1 ; i++)
		{
			for(j=0 ; j<number-i-1 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("The Sorted array is:");
		for(i=0;i<number;++i)
		{
			
			System.out.print(arr[i] + " ");
		}
		
	}
}
