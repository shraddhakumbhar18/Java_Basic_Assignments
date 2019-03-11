import java.util.Scanner;

public class Ctc 
{
	public static void main(String[] args) 
	{
		int ctc;
		int tax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CTC: ");
		ctc = sc.nextInt();
		if(ctc >=0 && ctc <=180000)
		{
			System.out.println("Slab A : Nil");
		}
		else if(ctc >= 181001 && ctc <= 300000 )
		{
			tax = (int) (ctc * 0.10);
			System.out.println("Slab B");
		}
		else if(ctc >= 300001 && ctc <= 500000 )
		{
			tax = (int) (ctc * 0.20);
			System.out.println("Slab C");
		}
		else if(ctc >= 500001 && ctc <= 1000000 )
		{
			tax = (int) (ctc * 0.30);
			System.out.println("Slab D");
		}
		System.out.println("Tax Amount is: " + tax);
		sc.close();
	}
}
